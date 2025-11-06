#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <signal.h>

int fib(int);
int fact(int);
void sig_usr1(int); 
void sig_usr2(int);
int fib(int n) {
    if (n <= 1)
        return n;
    return fib(n - 1) + fib(n - 2);
}
int fact (int n){
    if(n==0){
        return 1;
    }
    else return (n*fact(n-1));
}
void sig_usr1(int signo) {
    printf("Ricevuto segnale %d dal processo %d.\n", signo, getpid());
}
void sig_usr2(int signo) { 
    char c;
    printf("Ricevuto segnale %d dal processo %d. Vuoi continuare(S/N)?\n", signo, getpid());
    c=getchar();
        if (c == 'S'){
            printf("L'utente ha deciso di terminare il processo.\n"); 
            exit(0);
        }
        else if(c=='N'){
            printf("L'utente ha deciso di continuare.\n"); 
        }
        else{
        	printf("Comando sconosciuto, si continua.\n");
        	}
        getchar(); //rimozione del carattere \n dal Buffer per evitare che l'esecuzione continua anche dopo aver inserito il carattere s per terminare
}

int main (void){
    int pid1, pid2;

    pid1=fork();

    if(pid1 < 0){
        printf("Errore nella creazione del primo figlio.\n");
        exit(-1);
    }

    else if(pid1 == 0){
        signal(SIGINT, sig_usr1); 
        for(int i=0; i <= 30; i++){
            printf("Fibonacci (%d) : %d\n", i, fib(i)); 
            sleep(1);
        }
        exit(0);
    }
    if(pid1 > 0){ 

        pid2=fork();

        if(pid2 < 0){
            printf("Errore nella creazione del secondo figlio.\n");
            exit(-1);
        }

        else if(pid2 == 0){
            signal(SIGINT, sig_usr2);
            for(int i=0; i <= 20; i++){
                printf("Fattoriale (%d) : %d\n", i, fact(i));
                sleep(1);
            }
            exit(0);
        }
        else{
            signal(SIGINT, SIG_IGN); 
            wait(NULL);
            wait(NULL);
            printf("\n");
            printf("SONO NEL PADRE: PID del primo figlio: %d\n", pid1); //stampa del PID del primo figlio
            printf("SONO NEL PADRE: PID del secondo figlio: %d\n", pid2); //stampa del PID del secondo figlio
            printf("I figli sono TERMINATI CORRETTAMENTE\n");
        }
    }
}
