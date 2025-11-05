#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "item.h"
#include "list.h"
#include "libretto.h"

struct libretto
{
    int matricola;
    char cognome[100];
    char nome[100];
    list esami;
};

libretto newLibretto(int mat, char *cogn, char *nom)
{
    libretto l = malloc(sizeof(struct libretto));
    if (!l)
    {
        fprintf(stderr, "Errore di allocazione della memoria per il libretto.\n");
        exit(EXIT_FAILURE);
    }
    l->matricola = mat;
    strncpy(l->cognome, cogn, 99);
    l->cognome[99] = '\0';
    strncpy(l->nome, nom, 99);
    l->nome[99] = '\0';
    l->esami = newList();
    return l;
}

libretto addEsame(libretto l, item es)
{
    if (es == NULL)
    {
        return l;
    }
    l->esami = consList(es, l->esami);
    return l;
}

list dammiEsami(libretto l)
{
    if (!l)
    {
        return NULL;
    }
    return l->esami;
}

item cercaEsame(libretto l, char *nome_es)
{
    list esami = l->esami;
    list head = esami;

    while (!emptyList(head))
    {
        item es = getFirst(head);
        if (strcmp(getNomeEsame(es), nome_es) == 0)
        {
            return es; // Esame trovato
        }
        head = tail(head);
    }

    return empty_item(); // Restituisce un item vuoto
}