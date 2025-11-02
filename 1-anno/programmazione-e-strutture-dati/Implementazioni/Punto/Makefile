# Nome dell'eseguibile
TARGET = programma

# File sorgenti
SRC = main.c punto.c

# File oggetto (vengono generati automaticamente)
OBJ = $(SRC:.c=.o)

# Compilatore e flag
CC = gcc
CFLAGS = -Wall -Wextra -std=c99 -O2

# Regola predefinita
all: $(TARGET)

# Regola per creare l'eseguibile
$(TARGET): $(OBJ)
	$(CC) $(OBJ) -o $(TARGET)

# Regola per compilare i file .c in file .o
%.o: %.c %.h
	$(CC) $(CFLAGS) -c $< -o $@

# Pulizia dei file oggetto e dell'eseguibile
clean:
	rm -f $(OBJ) $(TARGET)