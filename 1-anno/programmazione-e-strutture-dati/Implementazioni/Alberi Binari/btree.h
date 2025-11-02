#include "item.h"
typedef struct node
{
    item value;
    struct node *left;
    struct node *right;
} node;

typedef struct node *Btree;
Btree newBtree(void);
int emptyBtree(Btree T);
Btree figlioSX(Btree T);
Btree figlioDX(Btree T);
Btree consBtree(item val, Btree sx, Btree dx);
node *getRoot(Btree T);
item getItem(node *N);
void setItem(node *N, item el);
Btree inputBtree(int level);
int isLeaf(Btree T);
void outputBtree(Btree T);
void preOrder(Btree T);
void postOrder(Btree T);
void inOrder(Btree T);
int contaNodi(Btree T);

// Funzioni per esame
int foglieK(Btree T, int k);
int strutturalmenteUguali(Btree T1, Btree T2);
int uguale_somma_dx_sx(Btree T);
int figli_destri(Btree T);
/*SPECIFICA SINTATTICA*/
/* numero_nipoti(btree, item) -> integer*/
/*SPECIFICA SEMANTICA*/
/*numero_nipoti(T, l) -> n*/
/*Precondizione: T diverso da Δ (albero vuoto) e contaNodi(T) >= l*/
/*Postcondizione: se T diverso da Δ e contaNodi(T)>=l, allora restituisce n, cioè il numero di nodi che si trovano a distanza 2 da l*/
int numero_nipoti(Btree T, item l);