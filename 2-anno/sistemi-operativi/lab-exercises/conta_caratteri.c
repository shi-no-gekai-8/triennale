#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<signal.h>
#include<fcntl.h>
#define BUFSIZE 1024
int main(void){
	int pid, status, in_fd, out_fd, rd_count, wt_count;
	int num_char=0;
	char buff[BUFSIZE];
	pid = fork();
	if(pid<0){
		signal(SIGINT, SIG_IGN);
		printf("Errore nella creazione del processo.\n");
		EXIT_FAILURE;
		}
	else if(pid==0){
		signal(SIGINT, SIG_IGN);
		in_fd = open("file_read.txt", O_RDONLY);
		if(in_fd<0){
			printf("Errore nell'apertura del file.\n");
			EXIT_FAILURE;
			}
		out_fd = open("file_write.txt", O_WRONLY | O_EXCL | O_CREAT, 0600);
		if(out_fd<0){
			printf("Errore nella creazione del file.\n");
			EXIT_FAILURE;
			}
		while((rd_count = read(in_fd, buff, BUFSIZE)) > 0){
			num_char += rd_count;
			if(rd_count<0){
				printf("Errore nella lettura del file.\n");
				EXIT_FAILURE;
				}
			wt_count = write(out_fd, buff, rd_count);
			if(wt_count<0){
				printf("Errore nella scrittura del file.\n");
				EXIT_FAILURE;
				}
			}
		printf("In questo file ci sono %d caratteri.\n", num_char);
		sleep(3);
		close(in_fd);
		close(out_fd);
	}
	else if(pid>0){
		signal(SIGINT, SIG_IGN);
		wait(&status);
		printf("Sono il padre. Questo è mio figlio: %d.\n", pid);
		printf("Ora muoio.\n");
		sleep(3);
		}
	return 0;
}
			
			
			
			
			
			
			
			
