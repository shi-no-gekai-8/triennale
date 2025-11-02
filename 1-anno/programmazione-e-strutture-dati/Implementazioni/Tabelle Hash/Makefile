# Variabili
CC = gcc
CFLAGS = -Wall -Wextra -g
OBJ = hashtable_main.o hashtable.o item.o
EXEC = test_hashtable.exe

# Regola di default
all: $(EXEC)

# Regola per creare l'eseguibile
$(EXEC): $(OBJ)
	$(CC) $(CFLAGS) -o $@ $(OBJ)

# Compilazione dei file sorgenti
hashtable_main.o: hashtable_main.c hashtable.h item.h
	$(CC) $(CFLAGS) -c hashtable_main.c

hashtable.o: hashtable.c hashtable.h item.h
	$(CC) $(CFLAGS) -c hashtable.c

item.o: item.c item.h
	$(CC) $(CFLAGS) -c item.c

# Pulizia dei file oggetto e dell'eseguibile
clean:
	rm -f $(OBJ) $(EXEC)

# Pulizia completa
distclean: clean
	rm -f *~