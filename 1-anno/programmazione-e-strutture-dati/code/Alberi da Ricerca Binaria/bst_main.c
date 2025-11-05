#include <stdio.h>
#include <locale.h>
#include "bst.h"
#include "item.h"

int main()
{
    setlocale(LC_ALL, ""); // Per supportare caratteri locali, se necessario
    BST tree = newBST();   // Creazione dell'albero vuoto
    int scelta;
    item elemento;

    printf("Gestione di un Albero di Ricerca Binario (BST)\n");

    do
    {
        printf("\nMenu:\n");
        printf("1. Inserire un elemento\n");
        printf("2. Cancellare un elemento\n");
        printf("3. Verificare se un elemento è presente\n");
        printf("4. Stampare l'albero (in-order)\n");
        printf("5. Verifica se l'albero è perfettamente bilanciato\n");
        printf("0. Uscire\n");
        printf("Scegli un'opzione: ");
        scanf("%d", &scelta);

        switch (scelta)
        {
        case 1: // Inserire un elemento
            printf("Inserisci l'elemento da aggiungere: ");
            input_item(&elemento); // Funzione per leggere l'input di un elemento
            tree = insert(tree, elemento);
            printf("Elemento inserito correttamente.\n");
            break;

        case 2: // Cancellare un elemento
            if (emptyBST(tree))
            {
                printf("L'albero è vuoto. Nessun elemento da cancellare.\n");
            }
            else
            {
                printf("Inserisci l'elemento da cancellare: ");
                input_item(&elemento);
                tree = deleteNode(tree, elemento);
                printf("Se presente, l'elemento è stato rimosso.\n");
            }
            break;

        case 3: // Verificare se un elemento è presente
            if (emptyBST(tree))
            {
                printf("L'albero è vuoto.\n");
            }
            else
            {
                printf("Inserisci l'elemento da cercare: ");
                input_item(&elemento);
                if (contains(tree, elemento))
                {
                    printf("Elemento trovato nell'albero.\n");
                }
                else
                {
                    printf("Elemento non presente nell'albero.\n");
                }
            }
            break;

        case 4: // Stampare l'albero (in-order)
            if (emptyBST(tree))
            {
                printf("L'albero è vuoto.\n");
            }
            else
            {
                printf("Elementi dell'albero (in ordine):\n");
                inOrder(tree); // Stampa in-order dell'albero
                printf("\n");
            }
            break;
        case 5:
            if (emptyBST(tree))
            {
                printf("L'albero è vuoto.\n");
            }
            else
            {
                printf("L'albero è perfettamente bilanciato? %s\n", isBilanciato(tree) ? "Sì" : "No");
            }
            break;

        case 0: // Uscire
            printf("Uscita dal programma.\n");
            break;

        default:
            printf("Opzione non valida. Riprova.\n");
        }
    } while (scelta != 0);

    return 0;
}
