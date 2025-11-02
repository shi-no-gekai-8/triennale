#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
int main(){
	int pid1, pid2, status;
	pid1 = fork();
	if(pid1<0){
		fprintf(stderr, "ERRORE DURANTE LA CREAZIONE DEL PROCESSO");
		}
	else if(pid1==0){
		printf("Pid processo in esecuzione(1° figlio): %d\n", getpid());
		int i;
		for(i=1;i<50;i++){
			printf("%d\n", i);
			}
		}
	else if(pid1>0){
		pid2 = fork();
		if(pid2<0){
			fprintf(stderr, "ERRORE DURANTE LA CREAZIONE DEL PROCESSO");
			}
		else if(pid2==0){
			int j;
			for(j=101;j<105;j++){
			printf("%d\n", j);
			}
			}
		else if(pid2>0){
			printf("I processi %d e %d terminano.\n", waitpid(pid1, &status, 0), waitpid(pid2, &status, 0));
			}
		return 0;
	}
}

