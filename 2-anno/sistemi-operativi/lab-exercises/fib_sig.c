#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<signal.h>
int fibonacci(int n){
	if(n<=1) return n;
	else return (fibonacci(n-1)+fibonacci(n-2));
	}
void signal_handler(int sig){
	char risposta[512];
	printf("\n ATTENZIONE!\nRicevuto segnale di interruzione %d.\n", sig);
	printf("Vuoi continuare (c) o uscire (u)?");
	scanf("%s", risposta);
	if(*risposta == 'c'){
		signal(SIGINT, signal_handler);
		}
	else if(*risposta == 'u'){
		printf("Processo terminato.\n");
		exit(1);
		}
	else{
		printf("Errore. Nessun comando corrispondente.\n");
		signal(SIGINT, signal_handler);
	}
}
int main(void){
	int i;
	signal(SIGINT, signal_handler);
	for(i=0; i<46;i++){
		printf("Fib(%2d) = %d.\n", i, fibonacci(i));
		sleep(1);
		}
}
