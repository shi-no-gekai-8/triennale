CC = gcc
CFLAGS = -Wall -g

all: ordinamento

ordinamento: main.o vettore.o
	$(CC) $(CFLAGS) -o ordinamento main.o vettore.o

main.o: main.c vettore.h
	$(CC) $(CFLAGS) -c main.c

vettore.o: vettore.c vettore.h
	$(CC) $(CFLAGS) -c vettore.c

clean:
	rm -f *.o ordinamento
