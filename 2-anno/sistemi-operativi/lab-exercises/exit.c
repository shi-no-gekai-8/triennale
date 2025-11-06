#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
int main(void){
	int pid, status;
	pid = fork();
	if(pid==0){
		printf("Sono il figlio e sto per terminare.\n");
		sleep(4);
		exit(0);
		}
	else {
		pid = wait(&status);
		if(WIFEXITED(status)){
			printf("Terminazione volontaria di %d con uno stato %d.\n", pid, WEXITSTATUS(status));
			}
		else if(WIFSIGNALED(status)){
			printf("Terminazione involontaria con segnale %d.\n", WTERMSIG(status));
			}
		}
}
