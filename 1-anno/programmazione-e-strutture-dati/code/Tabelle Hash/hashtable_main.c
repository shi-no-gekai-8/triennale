#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "hashtable.h"
#include "item.h"

void printMenu()
{
    printf("\n--- Menu Operazioni sulla Hashtable ---\n");
    printf("1. Inserisci elemento\n");
    printf("2. Cerca elemento\n");
    printf("3. Cancella elemento\n");
    printf("4. Stampa tabella hash\n");
    printf("5. Calcola fattore di carico\n");
    printf("6. Mostra dimensione della tabella\n");
    printf("0. Esci\n");
    printf("Scegli un'opzione: ");
}

int main()
{
    hashtable h = newHashtable();
    int choice;
    char key[50];
    int intero1, intero2;
    item *foundItem;

    if (!h)
    {
        printf("Errore: impossibile creare la tabella hash.\n");
        return 1;
    }

    do
    {
        printMenu();
        scanf("%d", &choice);
        getchar(); // Consuma il newline lasciato da scanf

        switch (choice)
        {
        case 1: // Inserisci elemento
            printf("Inserisci chiave: ");
            fgets(key, 50, stdin);
            key[strcspn(key, "\n")] = '\0'; // Rimuove il newline dalla chiave
            printf("Inserisci valore intero1: ");
            scanf("%d", &intero1);
            printf("Inserisci valore intero2: ");
            scanf("%d", &intero2);
            if (insertHash(h, newItem(key, intero1, intero2)))
            {
                printf("Elemento inserito con successo.\n");
            }
            else
            {
                printf("Errore: chiave già esistente o inserimento fallito.\n");
            }
            break;

        case 2: // Cerca elemento
            printf("Inserisci chiave da cercare: ");
            fgets(key, 50, stdin);
            key[strcspn(key, "\n")] = '\0'; // Rimuove il newline dalla chiave
            foundItem = searchHash(h, key);
            if (foundItem)
            {
                printf("Elemento trovato: Key = %s, Intero1 = %d, Intero2 = %d\n",
                       foundItem->key, foundItem->intero1, foundItem->intero2);
            }
            else
            {
                printf("Elemento non trovato.\n");
            }
            break;

        case 3: // Cancella elemento
            printf("Inserisci chiave da cancellare: ");
            fgets(key, 50, stdin);
            key[strcspn(key, "\n")] = '\0'; // Rimuove il newline dalla chiave
            foundItem = hashDelete(h, key);
            if (foundItem)
            {
                printf("Elemento cancellato: Key = %s\n", foundItem->key);
                free(foundItem->key);
                free(foundItem);
            }
            else
            {
                printf("Errore: elemento non trovato.\n");
            }
            break;

        case 4: // Stampa tabella hash
            printHash(h);
            break;

        case 5: // Calcola fattore di carico
            printf("Fattore di carico: %.2f\n", loadFactor(h));
            break;

        case 6: // Mostra dimensione della tabella
            printf("Dimensione della tabella: %d\n", sizeHash(h));
            break;

        case 0: // Esci
            printf("Uscita in corso...\n");
            break;

        default:
            printf("Scelta non valida, riprova.\n");
        }
    } while (choice != 0);

    destroyHash(h); // Libera memoria della tabella hash
    return 0;
}
