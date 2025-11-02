# Nome dell'eseguibile
EXEC = test_pqueue

# Compilatore e flag
CC = gcc
CFLAGS = -Wall -Wextra -g

# File sorgenti e oggetti
SRCS = pqueue_main.c pqueue.c
OBJS = $(SRCS:.c=.o)

# Regola principale (default)
all: $(EXEC)

# Compilazione dell'eseguibile
$(EXEC): $(OBJS)
	$(CC) $(CFLAGS) -o $(EXEC) $(OBJS)

# Compilazione dei file oggetto
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Pulizia dei file oggetto e dell'eseguibile
clean:
	rm -f $(OBJS) $(EXEC)

# Regola per forzare la ricompilazione
rebuild: clean all