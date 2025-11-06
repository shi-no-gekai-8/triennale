#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<signal.h>
int fib(int n){
	if(n==0) return 1;
	else return (n*fib(n-1));
}
void cntrl_c_handler (int sig){
	int pidf1;
	char answer[512];
 	signal(SIGINT,SIG_IGN);
	
	pidf1=fork();
	
	if(pidf1<0) fprintf(stderr, "ERRORE CREAZIONE DEL PROCESSO FIGLIO");
	if(pidf1==0){

	printf("\n\n%s%d\n\n%s", "Ricevuto segnale di interruzione!, segnale=", sig, "Vuoi continuare (c) o 	terminare(q) i processi?");

	scanf("%s", answer);

	if (*answer == 'c') exit(0);
	else {printf("Processi terminati dall'utente\n\n");
	kill(getppid(),SIGKILL);		
	raise(SIGKILL);}
	}
	else{
	wait(NULL);
	signal(SIGINT,cntrl_c_handler);
	}
}
int main(){
	int pid1;
	pid1=fork();
	
	if (pid1<0) fprintf(stderr, "ERRORE CREAZIONE DEL PROCESSO FIGLIO");

	if(pid1==0){
		signal(SIGINT,cntrl_c_handler);	
			for(int i=0; i<45; i++) {
			printf("fib(%2d) = %d\n", i, fib(i));
			sleep(1);			
			}
			exit(0);
	}
	else{
		 signal(SIGINT,SIG_IGN);
		printf("IL PROCESSO FIGLIO F %d E' TERMINATO",waitpid(pid1,NULL,0));
		return 0;
	}
}
