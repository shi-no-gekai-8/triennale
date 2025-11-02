#include <stdio.h>
#include <stdlib.h>
#include "pqueue.h"

void menu()
{
    printf("\n--- MENU ---\n");
    printf("1. Inserisci un elemento nella coda (insert)\n");
    printf("2. Ottieni il massimo dalla coda (getMax)\n");
    printf("3. Elimina il massimo dalla coda (deleteMax)\n");
    printf("4. Verifica se la coda è vuota (emptyPQ)\n");
    printf("5. Ottieni la dimensione della coda (sizePQ)\n");
    printf("6. Controlla se la coda è piena (isFullPQ)\n");
    printf("7. Cancella tutti gli elementi (clearPQ)\n");
    printf("8. Stampa tutti gli elementi nella coda (printPQ)\n");
    printf("9. Distruggi la coda e termina il programma (destroyPQ)\n");
    printf("10. Funzione esame (givePriority).\n");
    printf("Scegli un'opzione: ");
}

int main()
{
    PQueue q = newPQ(); // Creazione di una nuova coda
    if (!q)
    {
        printf("Errore nella creazione della coda!\n");
        return 1;
    }

    int scelta, key;

    while (1)
    {
        menu();
        scanf("%d", &scelta);

        switch (scelta)
        {
        case 1:
            printf("Inserisci un elemento da aggiungere: ");
            scanf("%d", &key);
            if (insert(q, key))
            {
                printf("Elemento %d inserito con successo.\n", key);
            }
            else
            {
                printf("Errore: Coda piena o non valida.\n");
            }
            break;

        case 2:
            if (emptyPQ(q))
            {
                printf("La coda è vuota.\n");
            }
            else
            {
                printf("Massimo elemento nella coda: %d\n", getMax(q));
            }
            break;

        case 3:
            if (deleteMax(q))
            {
                printf("Massimo elemento rimosso con successo.\n");
            }
            else
            {
                printf("Errore: La coda è vuota o non valida.\n");
            }
            break;

        case 4:
            if (emptyPQ(q))
            {
                printf("La coda è vuota.\n");
            }
            else
            {
                printf("La coda NON è vuota.\n");
            }
            break;

        case 5:
            printf("Numero di elementi nella coda: %d\n", sizePQ(q));
            break;

        case 6:
            if (isFullPQ(q))
            {
                printf("La coda è piena.\n");
            }
            else
            {
                printf("La coda NON è piena.\n");
            }
            break;

        case 7:
            clearPQ(q);
            printf("Coda svuotata.\n");
            break;

        case 8:
            printf("Elementi nella coda: ");
            printPQ(q);
            break;

        case 9:
            destroyPQ(q);
            printf("Coda distrutta. Fine programma.\n");
            return 0;
        case 10:
            printf("Aumento la priorità di tutti gli elementi tranne il massimo.\n");
            givePriority(q);
            break;

        default:
            printf("Opzione non valida. Riprova.\n");
            break;
        }
    }
}
