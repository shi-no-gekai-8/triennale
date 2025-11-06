#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<signal.h>
void sig_usr(int signal){
	if(signal == SIGUSR1){
		printf("Ricevuto SIGUSR1.\n");
		}
	else if(signal == SIGUSR2){
		printf("Ricevuto SIGUSR2.\n");
		}
}
int main(void){
	if(signal(SIGUSR1, sig_usr) == SIG_ERR){
		printf("Errore di sistema.\n");
		exit(-1);
	}
	if(signal(SIGUSR2, sig_usr) == SIG_ERR){
		printf("Errore di sistema.\n");
		exit(1);
	}	
	while(-1) pause();
}
