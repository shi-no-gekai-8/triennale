#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
int main(void){
	printf("\n \n \n");
	printf("Sopra la panca\n");
	execlp("echo", "echo", "la", "capra", "campa", NULL);
	printf("Prima prova.\n");
	}
