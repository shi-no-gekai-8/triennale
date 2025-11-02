# Nome dell'eseguibile
TARGET = btree_main

# File sorgenti
SRCS = btree_main.c btree.c item.c

# File oggetto
OBJS = $(SRCS:.c=.o)

# Compilatore e flag
CC = gcc
CFLAGS = -Wall -Wextra -std=c99 -O2

# Regola per creare l'eseguibile
$(TARGET): $(OBJS)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJS)

# Regola per creare i file oggetto
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Regola per pulire i file generati
clean:
	rm -f $(OBJS) $(TARGET)

# Regola per eseguire il programma
run: $(TARGET)
	./$(TARGET)

