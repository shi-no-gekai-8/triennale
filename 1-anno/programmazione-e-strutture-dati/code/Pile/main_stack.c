#include <stdio.h>
#include <stdlib.h>
#include "item.h"
#include "stack.h"

void menu()
{
    printf("\n--- MENU ---\n");
    printf("1. Push\n");
    printf("2. Pop\n");
    printf("3. Top\n");
    printf("4. Print Stack\n");
    printf("5. Find Item\n");
    printf("6. Clone Stack\n");
    printf("7. Esegui funzioni esame.\n");
    printf("8. Exit\n");
    printf("Choose an option: ");
}

int main()
{
    stack s = newStack();
    if (s == NULL)
    {
        printf("Error: Unable to create stack.\n");
        return 1;
    }
    // stack per funzione esame
    stack IMS = newStack();
    push(1, IMS);
    push(2, IMS);
    push(3, IMS);
    push(4, IMS);
    push(5, IMS);

    stack RCDS = newStack();
    push(3, RCDS);
    push(3, RCDS);
    push(2, RCDS);
    push(2, RCDS);
    push(2, RCDS);
    push(5, RCDS);
    push(5, RCDS);
    push(4, RCDS);

    int choice;
    int sceltaesame;
    do
    {
        menu();
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
        { // Push
            printf("Enter value to push: ");
            item val;
            input_item(&val);
            if (push(val, s))
            {
                printf("Item pushed successfully.\n");
            }
            else
            {
                printf("Error: Unable to push item.\n");
            }
            break;
        }

        case 2:
        { // Pop
            if (pop(s))
            {
                printf("Item popped successfully.\n");
            }
            else
            {
                printf("Error: Stack is empty.\n");
            }
            break;
        }

        case 3:
        { // Top
            item t = top(s);
            if (t != NULLITEM)
            {
                printf("Top item: ");
                output_item(t);
                printf("\n");
            }
            else
            {
                printf("Stack is empty.\n");
            }
            break;
        }

        case 4:
        { // Print Stack
            printf("Stack contents:\n");
            printStack(s);
            break;
        }

        case 5:
        { // Find Item
            printf("Enter value to find: ");
            item elem;
            input_item(&elem);
            if (findItem(s, elem))
            {
                printf("Item found in stack.\n");
            }
            else
            {
                printf("Item not found in stack.\n");
            }
            break;
        }

        case 6:
        { // Clone Stack
            stack clone = cloneStack(s);
            if (clone != NULL)
            {
                printf("Cloned stack contents:\n");
                printStack(clone);
                freeStack(clone);
            }
            else
            {
                printf("Error: Unable to clone stack.\n");
            }
            break;
        }
        case 7:
            printf("Scegli quale funzione eseguire.\n");
            printf("1. Inverti gli elementi a partire da uno.\n");
            printf("2. Rimuovi dallo stack tutti i duplicati consecutivi.\n");
            scanf("%d", &sceltaesame);
            switch (sceltaesame)
            {
            case 1:
                printf("Ecco lo stack originale.\n");
                printStack(IMS);
                stack inverso = inverti_a_partire_da(IMS, 3);
                printf("Stack invertito.\n");
                printStack(inverso);
                break;
            case 2:
                printf("Ecco lo stack originale.\n");
                printStack(RCDS);
                remove_consecutives_duplicates(RCDS);
                printStack(RCDS);
                break;
            default:
                printf("Scelta sbagliata");
            }

        case 8: // Exit
            printf("Exiting...\n");
            break;

        default:
            printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 7);

    freeStack(s);
    return 0;
}

/*
    stack s1 = newStack();
    stack s2 = newStack();
    int n, m;
    printf("Quanti elementi vuoi inserire nel primo stack?\n");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("Inserisci item: ");
        item a;
        input_item(&a);
        push(a, s1);
    }

    printf("Quanti elementi vuoi inserire nel secondo stack?\n");
    scanf("%d", &m);
    for (int i = 0; i < m; i++)
    {
        printf("Inserisci item: ");
        item b;
        input_item(&b);
        push(b, s2);
    }
    printf("Gli elementi duplicati sono %d.\n", duplicati(s1, s2));
}
*/