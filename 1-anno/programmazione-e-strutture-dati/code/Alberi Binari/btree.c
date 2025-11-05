#include <stdio.h>
#include <stdlib.h>
#include "item.h"
#include "btree.h"

static int contaFoglieAlLivello(Btree T, int k, int livello);
item getItem(node *N)
{
    if (N == NULL)
    {
        return NULLITEM;
    }
    return N->value;
}

void setItem(node *N, item el)
{
    if (N == NULL)
    {
        return;
    }
    N->value = el;
}

Btree newBtree(void)
{
    return NULL;
}

int emptyBtree(Btree T)
{
    return T == NULL;
}

node *getRoot(Btree T)
{
    return T;
}

Btree consBtree(item val, Btree sx, Btree dx)
{
    struct node *nuovo;
    nuovo = malloc(sizeof(struct node));
    if (nuovo != NULL)
    {
        setItem(nuovo, val);
        nuovo->left = sx;
        nuovo->right = dx;
    }
    return nuovo;
}

Btree figlioSX(Btree T)
{
    if (T != NULL)
    {
        return T->left;
    }
    else
    {
        return NULL;
    }
}

Btree figlioDX(Btree T)
{
    if (T != NULL)
    {
        return T->right;
    }
    else
    {
        return NULL;
    }
}

Btree inputBtree(int level)
{
    Btree T1, T2;
    item el;
    int yn;
    printf("\nVuoi chiudere l'albero in questo ramo? (1/0): ");
    scanf("%d", &yn);
    if (yn)
    {
        return newBtree();
    }
    printf("Inserisci elemento: ");
    input_item(&el);
    level++;
    printf("Figlio sinistro al livello %d", level);
    T1 = inputBtree(level);
    printf("Figlio destro al livello %d", level);
    T2 = inputBtree(level);
    return consBtree(el, T1, T2);
}
int isLeaf(Btree T)
{
    return (T->right == NULL && T->left == NULL);
}
void outputBtreeIndentato(Btree T, int livello)
{
    if (emptyBtree(T))
    {
        for (int i = 0; i < livello; i++)
        {
            printf("   ");
        }
        printf("*\n");
        return;
    }
    for (int i = 0; i < livello; i++)
    {
        printf("   ");
    }
    output_item(getItem(getRoot(T)));
    printf("\n");
    outputBtreeIndentato(figlioSX(T), livello + 1);
    outputBtreeIndentato(figlioDX(T), livello + 1);
}
void outputBtree(Btree T)
{
    outputBtreeIndentato(T, 0);
}
void preOrder(Btree T)
{
    if (T == NULL)
    {
        return;
    }
    output_item(getItem(T));
    printf(" -> ");
    preOrder(figlioSX(T));
    printf(" -> ");
    preOrder(figlioDX(T));
}

void postOrder(Btree T)
{
    if (T == NULL)
    {
        return;
    }
    postOrder(figlioSX(T));
    printf(" -> ");
    postOrder(figlioDX(T));
    printf(" -> ");
    output_item(getItem(T));
}
void inOrder(Btree T)
{
    if (T == NULL)
    {
        return;
    }
    inOrder(figlioSX(T));
    printf(" -> ");
    output_item(getItem(T));
    printf(" -> ");
    inOrder(figlioDX(T));
}

int contaNodi(Btree T)
{
    if (emptyBtree(T))
    {
        return 0;
    }
    return 1 + contaNodi(figlioSX(T)) + contaNodi(figlioDX(T));
}

// funzioni esame
//  int foglieK
int foglieK(Btree T, int k)
{
    if (T == NULL || k < 0)
    {
        printf("Albero vuoto, impossibile procedere.\n");
        return 0;
    }
    return contaFoglieAlLivello(T, k, 0);
}
static int contaFoglieAlLivello(Btree T, int k, int livello)
{
    if (T == NULL)
    {
        return 0;
    }
    if (livello == k)
    {
        if (figlioSX(T) == NULL && figlioDX(T) == NULL)
        {
            return 1;
        }
        return 0;
    }
    return contaFoglieAlLivello(figlioSX(T), k, livello + 1) + contaFoglieAlLivello(figlioDX(T), k, livello + 1);
}

// strutturalmente uguali
int strutturalmenteUguali(Btree T1, Btree T2)
{
    if (T1 == NULL && T2 == NULL)
    {
        return 1;
    }
    if (T1 == NULL || T2 == NULL)
    {
        return 0;
    }
    return strutturalmenteUguali(T1->left, T2->left) && strutturalmenteUguali(T1->right, T2->right);
}

// uguali dx e sx
int somma_sottoalbero(Btree T)
{
    if (T == NULL)
    {
        return 0;
    }
    return getItem(T) + somma_sottoalbero(figlioSX(T)) + somma_sottoalbero(figlioDX(T));
}
int uguale_somma_dx_sx(Btree T)
{
    if (T == NULL)
    {
        return 0;
    }
    int somma_sx = somma_sottoalbero(figlioSX(T));
    int somma_dx = somma_sottoalbero(figlioDX(T));
    return somma_sx == somma_dx;
}

// funzione conta figli destri
int figli_destri(Btree T)
{
    if (T == NULL)
    {
        return 0;
    }
    int count = 0;
    if (figlioDX(T) != NULL)
    {
        count = 1;
    }
    count += figli_destri(figlioSX(T));
    count += figli_destri(figlioDX(T));
    return count;
}

// conta numero nipoti
/*PROGETTAZIONE*/
/*
1) verifichiamo che l'albero non sia vuoto, altrimenti ritorniamo 0
2) Individuiamo l tra i nodi dell'albero
3) Visitiamo prima il figlio sinistro e poi il destro di l
4) Effettuiamo una doppia visita sui figli di l per raggiungere i nipoti che ci interessano, incrementando di volta in volta count
5) Ritorniamo la somma dei nodi trovati come nipoti di l dei suoi sottoalberi destri e sinistri

*/
int numero_nipoti(Btree T, item l)
{
    if (emptyBtree(T))
    {
        return 0;
    }
    if (getItem(getRoot(T)) == l)
    {
        int count = 0;
        if (!emptyBtree(figlioSX(T)))
        {
            if (!emptyBtree(figlioSX(figlioSX(T))))
            {
                count++;
            }
            if (!emptyBtree(figlioDX(figlioSX(T))))
            {
                count++;
            }
        }
        if (!emptyBtree(figlioDX(T)))
        {
            if (!emptyBtree(figlioSX(figlioDX(T))))
            {
                count++;
            }
            if (!emptyBtree(figlioDX(figlioDX(T))))
            {
                count++;
            }
        }
        return count;
    }
    return numero_nipoti(figlioSX(T), l) + numero_nipoti(figlioDX(T), l);
}
