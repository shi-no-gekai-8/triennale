# Nome dell'eseguibile
TARGET = test_bst

# File sorgenti
SRCS = bst_main.c bst.c item.c

# File oggetto (uno per ogni file sorgente)
OBJS = $(SRCS:.c=.o)

# Compilatore
CC = gcc

# Flag di compilazione
CFLAGS = -Wall -Wextra -std=c99 -g

# Regola principale per costruire l'eseguibile
$(TARGET): $(OBJS)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJS)

# Regola generica per compilare i file oggetto
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Regola per pulire i file oggetto e l'eseguibile
clean:
	rm -f $(OBJS) $(TARGET)

# Regola di esecuzione
run: $(TARGET)
	./$(TARGET)

# Regola per forzare la ricompilazione
rebuild: clean $(TARGET)
