#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<ctype.h>
#include<string.h>
int main(void){
	char comando[100];
	do{
		char *c1 = NULL, *c2 = NULL, *c3 = NULL, *c4 = NULL, *c5 = NULL, *c6 = NULL;
		int start = 0;
		int flag = 0;
		int pid;
		printf("Cosa vuoi fare?\t");
		fgets(comando, 100, stdin);
		for(int i=0;comando[i] != '\0';i++){
			if(isspace(comando[i])){
				for(int j=0;start<i;start++, j++){
					switch(flag){
						case 0: if(isspace(comando[start])) start++;
							if(j==0) c1 = malloc (10);
							c1[j] = comando[start];
							break;
						case 1: if(isspace(comando[start])) start++;
							if(j==0) c2 = malloc (10);
							c2[j] = comando[start];
							break;
						case 2: if(isspace(comando[start])) start++;
							if(j==0) c3 = malloc (10);
							c3[j] = comando[start];
							break;
						case 3: if(isspace(comando[start])) start++;
							if(j==0) c4 = malloc (10);
							c4[j] = comando[start];
							break;
						
						case 4: if(isspace(comando[start])) start++;
							if(j==0) c5 = malloc (10);
							c5[j] = comando[start];
							break;
						case 5: if(isspace(comando[start])) start++;
							if(j==0) c6 = malloc (10);
							c6[j] = comando[start];
							break;
						}
					}
					flag++;
				}
			}
		pid = fork();
		if(pid<0){
			printf("Errore nella creazione del processo.\n");
			exit(-1);
			}
		else if(pid==0){
			if(execlp(c1, c1, c2, c3, c4, c5, c6, NULL) < 0 && strcmp("exit\n", comando)){
				printf("Errore.\n");
				exit(-1);
			}
		}
		else if(pid>0){
			waitpid(pid, NULL, 0);
			}
		} while(strcmp(comando, "exit\n"));
}

				
				
				
				
				
				
				
				
						
