/*#include <stdio.h>
#include <stdlib.h>
#include "btree.h"
#include "esame.h"

int main(void)
{
    Btree T = newBtree();
    Btree leftChild = consBtree(2, NULL, NULL);
    Btree rightChild = consBtree(3, NULL, NULL);
    T = consBtree(1, leftChild, rightChild);
    int k;
    printf("Inserisci il valore di k (livello delle foglie da contare): ");
    scanf("%d", &k);
    int risultato = foglieK(T, k);
    printf("Numero di foglie al livello %d: %d\n", k, risultato);
    return 0;
}

*/