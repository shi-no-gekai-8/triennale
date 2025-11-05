#include <stdio.h>
#include <stdlib.h>
#include "pqueue.h"
#include "item.h"
#define MAXPQ 50

struct c_PQ
{
    int vet[MAXPQ];
    int numel;
};

static void scendi(PQueue q);
static void sali(PQueue q);

PQueue newPQ(void)
{
    PQueue q;
    q = malloc(sizeof(struct c_PQ));
    if (q == NULL)
    {
        return NULL;
    }
    q->numel = 0;
    return q;
}

int emptyPQ(PQueue q)
{
    if (!q)
    {
        return 1;
    }
    return q->numel == 0;
}

int getMax(PQueue q)
{
    if (q && q->numel > 0)
    {
        return q->vet[1];
    }
    return -1;
}

int deleteMax(PQueue q)
{
    if (!q || q->numel == 0)
    {
        return 0;
    }
    q->vet[1] = q->vet[q->numel];
    q->numel--;
    scendi(q);
    return 1;
}

int insert(PQueue q, int key)
{
    if (!q || q->numel == MAXPQ)
    {
        return 0;
    }
    q->numel++;
    q->vet[q->numel] = key;
    sali(q);
    return 1;
}

int sizePQ(PQueue q)
{
    if (!q)
    {
        return -1;
    }
    return q->numel;
}

void clearPQ(PQueue q)
{
    if (q)
    {
        q->numel = 0;
    }
}

int isFullPQ(PQueue q)
{
    if (!q)
    {
        return 0;
    }
    return q->numel == MAXPQ;
}

void printPQ(PQueue q)
{
    PQueue temp = newPQ(); // Crea una copia della coda
    for (int i = 1; i <= q->numel; i++)
    {
        temp->vet[i] = q->vet[i];
    }
    temp->numel = q->numel;

    while (!emptyPQ(temp))
    {
        printf("%d ", getMax(temp)); // Stampa il massimo
        deleteMax(temp);             // Rimuovi il massimo
    }
    printf("\n");
    destroyPQ(temp); // Distruggi la copia
}

void destroyPQ(PQueue q)
{
    if (q)
    {
        free(q);
    }
}

static void scendi(PQueue q)
{
    int i = 1;
    int n = q->numel;
    int temp;
    while (2 * i <= n)
    {
        int figlio = 2 * i;
        if (figlio + 1 <= n && q->vet[figlio + 1] > q->vet[figlio])
        {
            figlio++;
        }
        if (q->vet[i] >= q->vet[figlio])
        {
            break;
        }
        temp = q->vet[i];
        q->vet[i] = q->vet[figlio];
        q->vet[figlio] = temp;
        i = figlio;
    }
}

static void sali(PQueue q)
{
    int pos = q->numel;
    int temp;
    while (pos > 1 && q->vet[pos] > q->vet[pos / 2])
    {
        temp = q->vet[pos];
        q->vet[pos] = q->vet[pos / 2];
        q->vet[pos / 2] = temp;
        pos = pos / 2;
    }
}
// funzione esame
void givePriority(PQueue q)
{
    if (q == NULL || emptyPQ(q))
    {
        return;
    }
    item maxItem = getMax(q);
    for (int i = 1; i <= q->numel; i++)
    {
        if (q->vet[i] != maxItem)
        {
            q->vet[i]++;
        }
    }
    for (int i = q->numel / 2; i >= 1; i--)
    {
        scendi(q);
    }
}
