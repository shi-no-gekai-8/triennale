#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<string.h>
int main(void){
	char buf[512];
	int pid, status;
	printf("%%");
	while(fgets(buf, 512, stdin) != NULL){
		buf[strlen(buf)-1] = 0;
		if((pid = fork()) < 0){
			printf("Errore nella creazione del processo.\n");
			exit(1);
			}
		else if(pid==0){
			if(execlp(buf, buf, (char *) 0) == -1){
				printf("Errore nell'esecuzione di %s.\n", buf);
				exit(1);
				}
			exit(0);
			}
		if((pid = waitpid(pid, &status, 0)) < 0){
			printf("Errore di sistema.\n");
			exit(1);
			}
		printf("%%");
	}
return 0;
}
