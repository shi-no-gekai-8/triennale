#include<stdio.h>
#include<stdlib.h>
#include<errno.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<string.h>
int main(void){
	int fd, nwrite;
	char *data = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
	fd = open("alfabeto.txt", O_WRONLY | O_CREAT, S_IRUSR | S_IWUSR);
	if(fd<0){
		printf("Errore nella creazione del file.\n");
		EXIT_FAILURE;
		}
	nwrite = write(fd, data, strlen(data));
	if(nwrite<0){
		printf("Errore nella scrittura.\n");
		EXIT_FAILURE;
		}
	close(fd);
	return 0;
}
