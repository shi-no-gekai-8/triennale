# Nome dell'eseguibile
EXEC = test_list

# Compilatore
CC = gcc

# Flag di compilazione
CFLAGS = -Wall -Wextra -g

# File sorgente e oggetto
SRC = main_list.c list.c item.c
OBJ = $(SRC:.c=.o)

# Regola principale: compila tutto e genera l'eseguibile
$(EXEC): $(OBJ)
	$(CC) $(CFLAGS) -o $(EXEC) $(OBJ)

# Regola per compilare i file .c in file .o
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Pulizia dei file oggetto e dell'eseguibile
clean:
	rm -f $(OBJ) $(EXEC)

# Regola per eseguire il programma
run: $(EXEC)
	./$(EXEC)

# Dichiarazione di target "phony" (non corrispondono a file)
.PHONY: clean run