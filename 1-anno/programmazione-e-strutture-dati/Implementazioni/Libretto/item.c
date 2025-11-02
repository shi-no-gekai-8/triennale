#include <stdio.h>
#include "item.h"

int eq(item x, item y)
{
    return x.voto == y.voto && strcmp(x.nome, y.nome) == 0; // Confronta nome e voto
}

void input_item(item *x)
{
    printf("Inserire nome esame: ");
    scanf("%s", x->nome);
    printf("Inserire voto esame: ");
    scanf("%d", &x->voto);
    printf("Inserire data esame (GG/MM/AAAA): ");
    scanf("%s", x->data);
}

void output_item(item x)
{
    printf("Esame: %s, Voto: %d, Data: %s\n", x.nome, x.voto, x.data);
}

char *getNomeEsame(item es)
{
    return es.nome;
}

item empty_item()
{
    item empty;
    strcpy(empty.nome, "");
    empty.voto = -1;
    strcpy(empty.data, "");
    return empty;
}

int is_empty_item(item x)
{
    return x.voto == -1;
}