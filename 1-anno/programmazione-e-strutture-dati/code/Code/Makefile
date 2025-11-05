# Nome dell'eseguibile
TARGET = queue_test

# File sorgenti
SRCS = main_queue.c queue.c item.c

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

