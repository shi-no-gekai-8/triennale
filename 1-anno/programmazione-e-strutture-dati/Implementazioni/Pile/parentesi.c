#include <stdio.h>
#include <stdlib.h>
#include "item.h"
#include "stack.h"

#define MAX_S_SIZE 81

// Prototipi delle funzioni
int isBalanced(char *expr);
int isMatchingPair(char open, char close);

int main()
{
    char expr[MAX_S_SIZE];
    printf("Inserire un'espressione (senza spazi): ");
    scanf("%s", expr);

    if (isBalanced(expr))
    {
        printf("Parentesi bilanciate.\n");
    }
    else
    {
        printf("Parentesi sbilanciate.\n");
    }
    return 0;
}

int isBalanced(char *expr)
{
    stack S = newStack();
    int c, i = 0;
    item top_el;

    if (!expr)
    {
        return 1;
    }

    while (expr[i] != '\0')
    {
        c = expr[i];
        if (c == '(' || c == '[' || c == '{') // Push solo per parentesi aperte
        {
            push(chtoitem(c), S);
        }
        else if (c == ')' || c == ']' || c == '}') // Gestione parentesi chiuse
        {
            if (emptyStack(S))
            {
                return 0; // Parentesi chiusa senza corrispondente aperta
            }
            top_el = top(S);
            pop(S);
            if (!isMatchingPair(itemtoch(top_el), c))
            {
                return 0; // Non corrispondono
            }
        }
        i++;
    }

    // Se la pila è vuota alla fine, le parentesi sono bilanciate
    return emptyStack(S);
}
int isMatchingPair(char open, char close)
{
    return (open == '(' && close == ')') ||
           (open == '[' && close == ']') ||
           (open == '{' && close == '}');
}
