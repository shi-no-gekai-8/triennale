#include <stdio.h>
#include <stdlib.h>
#include "queue.h"
#include "item.h"

void printMenu()
{
    printf("\n*** MENU ***\n");
    printf("1. Creare una nuova coda\n");
    printf("2. Verificare se la coda è vuota\n");
    printf("3. Inserire un elemento nella coda (enqueue)\n");
    printf("4. Rimuovere un elemento dalla coda (dequeue)\n");
    printf("5. Stampare il contenuto della coda\n");
    printf("7. Funzione esame (vicini)\n");
    printf("8. Funzione esame salta la coda.\n");
    printf("6. Uscire\n");
    printf("Scegli un'opzione: ");
}

int main()
{
    queue q = NULL;
    int scelta;
    int continua = 1;
    item val;

    // funzione vicini
    item a, b;

    while (continua)
    {
        printMenu();
        scanf("%d", &scelta);

        switch (scelta)
        {
        case 1: // Creare una nuova coda
            if (q != NULL)
            {
                printf("La coda esiste già. Libera la memoria prima di crearne una nuova.\n");
            }
            else
            {
                q = newQueue();
                if (q != NULL)
                {
                    printf("Coda creata con successo.\n");
                }
                else
                {
                    printf("Errore nella creazione della coda.\n");
                }
            }
            break;

        case 2: // Verificare se la coda è vuota
            if (q == NULL)
            {
                printf("La coda non è stata ancora creata.\n");
            }
            else
            {
                if (emptyQueue(q))
                {
                    printf("La coda è vuota.\n");
                }
                else
                {
                    printf("La coda non è vuota.\n");
                }
            }
            break;

        case 3: // Inserire un elemento nella coda (enqueue)
            if (q == NULL)
            {
                printf("La coda non è stata ancora creata.\n");
            }
            else
            {
                printf("Inserisci un valore da aggiungere alla coda: ");
                input_item(&val);
                if (enqueue(val, q))
                {
                    printf("Elemento aggiunto con successo.\n");
                }
                else
                {
                    printf("Errore nell'aggiunta dell'elemento.\n");
                }
            }
            break;

        case 4: // Rimuovere un elemento dalla coda (dequeue)
            if (q == NULL)
            {
                printf("La coda non è stata ancora creata.\n");
            }
            else
            {
                val = dequeue(q);
                if (val != NULLITEM)
                {
                    printf("Elemento rimosso: ");
                    output_item(val);
                    printf("\n");
                }
                else
                {
                    printf("Errore: la coda è vuota.\n");
                }
            }
            break;

        case 5: // Stampare il contenuto della coda
            if (q == NULL)
            {
                printf("La coda non è stata ancora creata.\n");
            }
            else
            {
                printQueue(q);
            }
            break;

        case 6: // Uscire
            if (q != NULL)
            {
                q = NULL;
            }
            printf("Uscita dal programma.\n");
            continua = 0;
            break;
        case 7:
            if (q == NULL)
            {
                printf("La coda non è stata ancora creata. Creazione automatica della coda...\n");
                q = newQueue();
                if (q == NULL)
                {
                    printf("Errore nella creazione della coda.\n");
                    break;
                }
            }
            enqueue(1, q);
            enqueue(4, q);
            enqueue(9, q);
            enqueue(1, q);
            enqueue(9, q);
            enqueue(1, q);
            enqueue(1, q);
            enqueue(9, q);
            printf("Inserisci l'item a: ");
            scanf("%d", &a);
            printf("Inserisci l'item b: ");
            scanf("%d", &b);
            printf("%d e %d sono consecutivi %d volte.", a, b, vicini(q, a, b));
            break;
        case 8:
            if (q == NULL)
            {
                printf("La coda non è stata ancora creata. Creazione automatica della coda...\n");
                q = newQueue();
                if (q == NULL)
                {
                    printf("Errore nella creazione della coda.\n");
                    break;
                }
            }
            enqueue(1, q);
            enqueue(4, q);
            enqueue(9, q);
            enqueue(1, q);
            enqueue(9, q);
            enqueue(1, q);
            enqueue(10, q);
            enqueue(9, q);
            printf("Ecco la coda originale.\n");
            printQueue(q);
            printf("Adesso, metto l'elemento 10 in testa.\n");
            salta_la_coda(q, 10);
            printf("Ecco la coda con 10 in testa.\n");
            printQueue(q);
            break;
        default:
            printf("Scelta non valida. Riprova.\n");
        }
    }

    return 0;
}
