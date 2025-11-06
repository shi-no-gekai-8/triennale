#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<signal.h>
#include<sys/wait.h>
int fib(int n){
	if(n>=1){
		return n;
		}
	else{
		return(fib(n-1)+fib(n-2));
		}
}
int fatt(int n){
	if(n<0){
		return -1;
		}
	else if(n==0){
		return 1;
		}
	else {
		return n*fatt(n-1);
		}
}
void cntrl_c_handler(int sig){
	char answer[512];
	printf("\n\n%s%d\n\n%s", "Ricevuto segnale di interruzione : ", sig, "Vuoi continuare (c) o uscire (q)?\n");
	scanf("%s", answer);
	if(*answer == 'c'){
		signal(SIGINT, cntrl_c_handler);
		}
	else if(*answer == 'q'){
		printf("Processo terminato dall'utente.\n");
		exit(1);
		}
	else{
		printf("Comando non riconosciuto.\n");
		exit(1);
		}
}
int main(void){
	int pid1, pid2, status;
	int i;
	pid1 = fork();
	if(pid1<0){
		printf("Errore nella creazione del processo.\n");
		EXIT_FAILURE;
		}
	else if(pid1==0){
		printf("Questo è mio figlio: %d.\n", getpid());
		printf("Il segnale equivale a %d.\n", SIGINT);
		signal(SIGINT, cntrl_c_handler);
		for(i=0;i<30;i++){
			printf("Fib(%2d) = %d\n", i, fib(i));
			sleep(1);
			exit(0);
			}
		}
	else if(pid1>0){
		pid2 = fork();
		if(pid2<0){
			printf("Errore nella creazione del secondo processo.\n");
			EXIT_FAILURE;
			}
		else if(pid2==0){
			printf("Questo è il pid del secondo figlio: %d.\n", getpid());
			signal(SIGINT, cntrl_c_handler);
			for(i=0;i<30;i++){
				printf("Fatt(%2d) = %d\n", i, fatt(i));
				sleep(1);
				exit(0);
				}
			}
		else if(pid2>0){
			wait(&status);
			printf("Il primo processo %d termina.\n", pid1);
			}
		wait(&status);
		printf("Il secondo processo %d termina.\n", pid2);
	}
}






















