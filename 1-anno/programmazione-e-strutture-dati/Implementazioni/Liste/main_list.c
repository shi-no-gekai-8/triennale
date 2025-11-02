#include <stdio.h>
#include "list.h"
#include "item.h"
int main()
{
    list l = newList();
    list l1, result1 = newList();
    int scelta, pos;
    item val;
    do
    {
        printf("\n--- Menu Lista ---\n");
        printf("1. Aggiungi elemento (consList)\n");
        printf("2. Rimuovi elemento (removeList)\n");
        printf("3. Inserisci elemento in posizione (insertList)\n");
        printf("4. Visualizza lista (output_list)\n");
        printf("5. Inverti lista (reverseList)\n");
        printf("6. Dimensione della lista (sizeList)\n");
        printf("7. Trova posizione di un elemento (posItem)\n");
        printf("8. Ottiene elemento in posizione (getItem)\n");
        printf("9. Esegui funzione di esame: item centrale:\n");
        printf("10. Esegui funzione dell'esame (inverti estremi)\n");
        printf("0. Esci\n");
        printf("Scegli un'opzione\n");
        scanf("%d", &scelta);
        switch (scelta)
        {
        case 1:
            printf("Inserisci valore: ");
            input_item(&val);
            l = consList(val, l);
            break;
        case 2:
            printf("Inserisci posizione da rimuovere: ");
            scanf("%d", &pos);
            if (removeList(&l, pos))
            {
                printf("Elemento rimosso con successo.\n");
            }
            else
            {
                printf("Errore: posizione non valida o lista vuota.\n");
            }
            break;
        case 3:
            printf("Inserisci posizione: ");
            scanf("%d", &pos);
            printf("Inserisci valore: ");
            input_item(&val);
            if (insertList(&l, pos, val))
            {
                printf("Elemento inserito con successo.\n");
            }
            else
            {
                printf("Errore: posizione non valida.\n");
            }
            break;
        case 4:
            printf("Contenuto della lista:\n");
            output_list(l);
            break;
        case 5:
            l = reverseList(l);
            printf("Lista invertita con successo.\n");
            break;
        case 6:
            printf("Dimensione della lista: %d\n", sizeList(l));
            break;
        case 7:
            printf("Inserisci valore da cercare: ");
            input_item(&val);
            pos = posItem(l, val);
            if (pos >= 0)
            {
                printf("Elemento trovato nella posizione %d\n", pos);
            }
            else
            {
                printf("Elemento non trovato.\n");
            }
            break;
        case 8:
            printf("Inserisci posizione: ");
            scanf("%d", &pos);
            val = getItem(l, pos);
            if (val != NULLITEM)
            {
                printf("Elemento in posizione %d: ", pos);
                output_item(val);
                printf("\n");
            }
            else
            {
                printf("Errore: posizione non valida.\n");
            }
            break;
        case 9:
            l = newList();
            l = consList(50, l);
            l = consList(40, l);
            l = consList(30, l);
            l = consList(20, l);
            l = consList(10, l);
            val = centrale(l);
            if (val != NULLITEM)
            {
                printf("Elemento centrale della lista: ");
                output_item(val);
                printf("\n");
            }
            else
            {
                printf("Errore lista vuota.\n");
            }
            break;
        case 10:
            l1 = consList(50, l1);
            l1 = consList(40, l1);
            l1 = consList(30, l1);
            l1 = consList(20, l1);
            l1 = consList(10, l1);
            printf("Lista originale (caso 1): ");
            output_list(l1);
            result1 = inverti_estremi(l1);
            printf("Risultato: \n");
            output_list(result1);
            break;

        case 0:
            printf("Uscita...\n");
            break;
        default:
            printf("Operazione non valida.\n");
        }
    } while (scelta != 0);
    return 0;
}