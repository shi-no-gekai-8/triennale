#include<fcntl.h>
#include<stdio.h>
#include<signal.h>
int pid1, pid2, fd;
void gestore_F(int sig);
void gestore_T(int sig);
int main(int argc, char *argv[]){
	int n1, n2;
	char c1, c2;
	char s1[80], s2[80];
	if(argc!=6){
		printf("Sintassi sbagliata.\n";
		exit(1);
		}
	n1 = atoi(argv[1]);
	n2 = atoi(argv[2]);
	c1 = argv[4][0];
	c2 = argv[5][0];
	signal(SIGUSR1, gestore_F);
	signal(SIGUSR2, gestore_F);
	signal(SIGQUIT, gestore_T);
	fd=open("notifiche", O_WRONLY);
	pid1 = fork();
	if(pid1<0){
		printf("Errore nella creazione del primo processo.\n");
		EXIT_FAILURE();
		}
	else if(pid1==0){
		fd=open(argv[3], O_RDONLY);
		while(read(fd, s1, n1)>0){
			if(
	
