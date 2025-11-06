#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
int main(void){
	int pid1, pid2;
	int status;
	int i;
	pid1 = fork();
	if(pid1<0){
		printf("Errore nella creazione del process.\n");
		EXIT_FAILURE;
		}
	else if(pid1==0){
		printf("Ciao, sono il primo figlio. Questo è il mio pid: %d.\n", getpid());
		printf("Ora stampo i numeri da 1 a 50.\n");
		for(i=1;i<=50;i++){
			printf("%d.\n", i);
			}
		exit(0);
		}
	else if(pid1>0){
		pid2 = fork();
		if(pid2<0){
			printf("Errore nella creazione del process.\n");
			EXIT_FAILURE;
			}
		else if(pid2==0){
			printf("Ciao sono il secondo figlio. Questo è il mio pid: %d.\n", getpid());
			printf("Ora stampo i numeri da 101 a 150.\n");
			for(i=101;i<=150;i++){
				printf("%d.\n", i);
				}
			exit(0);
			}
		waitpid(pid1, &status, 0);
		waitpid(pid2, &status, 0);
		printf("Sono il padre %d. Questi sono i pid dei miei figli: %d e %d. Ora terminiamo tutti e tre.\n", getpid(), pid1, pid2);
		}
	return 0;
}
			
