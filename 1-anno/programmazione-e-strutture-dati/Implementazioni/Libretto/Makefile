# Nome dell'eseguibile
EXEC = libretto

# Compilatore e flag
CC = gcc
CFLAGS = -Wall -Wextra -g

# File sorgenti e oggetti
SRC = libretto.c libretto_main.c item.c lista.c
OBJ = $(SRC:.c=.o)

# Regole principali
all: $(EXEC)

$(EXEC): $(OBJ)
	$(CC) $(CFLAGS) -o $(EXEC) $(OBJ)

# Regole per i file oggetto
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Pulizia dei file oggetto e dell'eseguibile
clean:
	rm -f $(OBJ) $(EXEC)

# Pulizia avanzata (inclusi i file di backup)
cleanall: clean
	rm -f *~ *.bak

# Test rapido per verificare il comportamento
run: $(EXEC)
	./$(EXEC)