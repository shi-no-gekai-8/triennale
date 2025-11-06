#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#define BUFFSIZE 8192
int main(void){
	int n;
	char buf[BUFFSIZE];
	while((n = read(STDIN_FILENO, buf, BUFFSIZE)) > 0){
		if(write(STDOUT_FILENO, buf, n) != n){
			printf("Errore durante la scrittura.\n");
			exit(-1);
			}
		if(n<0){
			printf("Errore nella lettura.\n");
			exit(-1);
			}
		}
	return 0;
}
