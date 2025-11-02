#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
int main(void){
	int status;
	int pid;
	int fd_in, fd_out;
	char buff;
	int n;
	int i, j;
	int num_consonanti=0;
	char consonantipiccole[] = {'b', 'c', 'd', 'f', 'g', 'h', 'l', 'm', 'n', 'p', 'q', 'r', 's', 'z', 'x', 't', 'y', 'w'};
	char consonantigrandi[] = {'B', 'C', 'D', 'F', 'G', 'H', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'Z', 'X', 'T', 'Y', 'W'};
	pid=fork();
	if(pid<0){
		printf("Errore nella creazione del processo.\n");
		EXIT_FAILURE;
		}
	else if(pid==0){
		signal(SIGINT, SIG_IGN);
		fd_in = open("file_read.txt", O_RDONLY);
		if(fd_in<0){
			printf("Errore nella lettura del file.\n");
			EXIT_FAILURE;
			}
		fd_out = open("file_write.txt", O_WRONLY | O_CREAT | O_TRUNC, 0600);
		if(fd_out<0){
			printf("Errore nella scrittura del file.\n");
			EXIT_FAILURE;
			}
		while((n=read(fd_in, &buff, 1)) > 0){
			for(i=0;consonantipiccole[i]!='\0';i++){
				if(buff==consonantipiccole[i]){
					write(fd_out, &buff, 1);
					num_consonanti++;
					}
				}
			for(j=0;consonantigrandi[j]!='\0';j++){
				if(buff==consonantigrandi[j]){
					write(fd_out, &buff, 1);
					num_consonanti++;
					}
				}
			}
		close(fd_in);
		close(fd_out);
		sleep(1);
		printf("Il numero di consonanti trovate è %d.\n", num_consonanti);
		sleep(3);
	}
	else if(pid>0){
		signal(SIGINT, SIG_IGN);
		wait(&status);
		printf("Hey, sono il padre %d. Questo è mio figlio %d.\n", getppid(), getpid());
		printf("Ora stiamo per terminare.\n");
		sleep(2);
		}
	return 0;
}
