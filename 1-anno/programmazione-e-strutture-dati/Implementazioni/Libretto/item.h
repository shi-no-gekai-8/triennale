#ifndef ITEM_H
#define ITEM_H

typedef struct
{
    char nome[50];
    int voto;
    char data[11];
} item;

// Prototipi delle funzioni
int eq(item x, item y);
void input_item(item *x);
void output_item(item x);
char *getNomeEsame(item es);
item empty_item();         // Nuovo prototipo
int is_empty_item(item x); // Nuovo prototipo

#endif
