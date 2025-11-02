# Variabili
CC = gcc
CFLAGS = -Wall -g
LIBS = stack.c item.c
OBJ = stack.o item.o

# Regole principali
all: test_stack parentesi

# Regola per test_stack
test_stack: main_stack.o $(OBJ)
	$(CC) $(CFLAGS) -o test_stack main_stack.o $(OBJ)

# Regola per parentesi
parentesi: parentesi.o $(OBJ)
	$(CC) $(CFLAGS) -o parentesi parentesi.o $(OBJ)

# Regole generiche per oggetti
%.o: %.c
	$(CC) $(CFLAGS) -c $<

# Pulizia
clean:
	rm -f *.o test_stack parentesi