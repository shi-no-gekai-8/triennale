#include <stdio.h>
#include <stdlib.h>
#include "item.h"
#include "stack.h"
#define STARTSIZE 50
#define ADDSIZE 20
struct c_stack
{
    item *vet;
    int size;
    int top;
};
stack newStack(void)
{
    stack s = malloc(sizeof(struct c_stack));
    if (s == NULL)
    {
        return NULL;
    }
    s->vet = malloc(STARTSIZE * sizeof(item));
    if (s->vet == NULL)
    {
        free(s);
        return NULL;
    }
    s->size = STARTSIZE;
    s->top = 0;
    return s;
}
int emptyStack(stack s)
{
    return s->top == 0;
}
int push(item val, stack s)
{
    if (s->top == s->size)
    {
        item *tmp = realloc(s->vet, (s->size + ADDSIZE) * sizeof(item));
        if (tmp == NULL)
        {
            return 0;
        }
        s->vet = tmp;
        s->size += ADDSIZE;
    }
    s->vet[s->top] = val;
    (s->top)++;
    return 1;
}
int pop(stack s)
{
    if (s->top == 0)
    {
        return 0;
    }
    (s->top)--;
    return s->vet[s->top];
}
item top(stack s)
{
    item e;
    if (s->top > 0)
    {
        e = s->vet[s->top - 1];
    }
    else
    {
        e = NULLITEM;
    }
    return e;
}
void printStack(stack s)
{
    for (int i = s->top - 1; i >= 0; i--)
    {
        output_item(s->vet[i]);
        printf("\n");
    }
}
void freeStack(stack s)
{
    if (s != NULL)
    {
        free(s->vet);
        free(s);
    }
}

stack cloneStack(stack s)
{
    stack clone = newStack();
    if (clone == NULL)
    {
        return NULL;
    }
    for (int i = 0; i < s->top; i++)
    {
        push(s->vet[i], clone);
    }
    return clone;
}
int findItem(stack s, item elem)
{
    if (emptyStack(s))
    {
        return 0;
    }

    stack temp = newStack();
    int found = 0;

    // Itera su tutti gli elementi senza alterare lo stack originale
    while (!emptyStack(s))
    {
        item current = top(s);
        if (eq(current, elem))
        {
            found = 1;
        }
        push(temp, current);
        pop(s);
    }

    // Ripristina lo stack originale
    while (!emptyStack(temp))
    {
        push(s, top(temp));
        pop(temp);
    }

    freeStack(temp);
    return found;
}
// funzioni esame
//  int duplicati

int duplicati(stack s1, stack s2)
{
    int count = 0; // Variabile per contare il numero di elementi duplicati tra s1 e s2.
    stack clones1 = newStack();
    stack clone2s1 = newStack();
    stack clones2 = newStack();
    stack clone2s2 = newStack();
    stack tmp = newStack();
    // Creazione di stack temporanei per evitare modifiche ai stack originali s1 e s2:
    // - `clones1` e `clone2s1` servono per clonare il contenuto di `s1`.
    // - `clones2` e `clone2s2` servono per clonare il contenuto di `s2`.
    // - `tmp` serve per manipolazioni temporanee durante i confronti.
    while (!emptyStack(s1))
    {
        item a = top(s1);
        pop(s1);
        push(a, clones1);
        push(a, clone2s1);
    }
    // Questo ciclo svuota lo stack `s1` originale:
    // - Ogni elemento viene estratto con `top(s1)` e poi rimosso con `pop(s1)`.
    // - Gli elementi vengono copiati sia in `clones1` (per i confronti) sia in `clone2s1` (per ripristinare `s1` alla fine)
    while (!emptyStack(s2))
    {
        item b = top(s2);
        pop(s2);
        push(b, clones2);
        push(b, clone2s2);
    }
    // Questo ciclo svuota lo stack `s2` originale:
    // - Gli elementi vengono copiati sia in `clones2` (per i confronti) sia in `clone2s2` (per ripristinare `s2` alla fine)
    while (!emptyStack(clones1))
    {
        item c = top(clones1);
        pop(clones1);
        // Questo ciclo esplora ogni elemento di `clones1` (che rappresenta una copia di `s1`).

        while (!emptyStack(clones2))
        {
            item d = top(clones2);
            pop(clones2);
            push(d, tmp);
            // Confronta l'elemento corrente di `clones1` (`c`) con ogni elemento di `clones2`.
            // Gli elementi di `clones2` vengono estratti e spostati nello stack temporaneo `tmp`.
            if (eq(c, d))
            {
                count++;
            }
            // Se i due elementi `c` e `d` sono uguali (determinato dalla funzione `eq`), incrementa il contatore `count`
        }
        while (!emptyStack(tmp))
        {
            item f = top(tmp);
            pop(tmp);
            push(f, clones2);
        }
        // Ripristina gli elementi nello stack `clones2` dallo stack temporaneo `tmp`, così `clones2` può essere riutilizzato per il confronto successivo
    }

    while (!emptyStack(clone2s1))
    {
        item g = top(clone2s1);
        pop(clone2s1);
        push(g, s1);
    }
    // Ripristina lo stack originale `s1` copiando gli elementi da `clone2s1`

    while (!emptyStack(clone2s2))
    {
        item h = top(clone2s2);
        pop(clone2s2);
        push(h, s2);
    }
    // Ripristina lo stack originale `s2` copiando gli elementi da `clone2s2`.

    return count;
}

// funzione inverti_a_partire_da
stack inverti_a_partire_da(stack s, item i)
{
    if (emptyStack(s))
    {
        return newStack();
    }
    if (!findItem(s, i))
    {
        printf("Elemento non trovato.\n");
        return s;
    }
    stack tmp = newStack();
    stack toInvert = newStack();
    int found = 0;
    while (!emptyStack(s))
    {
        item current = top(s);
        pop(s);
        if (eq(current, i))
        {
            found = 1;
            push(tmp, current);
            break;
        }
        push(tmp, current);
    }
    while (!emptyStack(s))
    {
        push(toInvert, top(s));
        pop(s);
    }
    stack result = newStack();
    while (!emptyStack(tmp))
    {
        push(result, top(tmp));
        pop(tmp);
    }
    while (!emptyStack(toInvert))
    {
        push(result, top(toInvert));
        pop(toInvert);
    }
    freeStack(tmp);
    freeStack(toInvert);
    return result;
}

// rimuovi duplicati consecutivi
void remove_consecutives_duplicates(stack s)
{
    if (emptyStack(s))
    {
        return;
    }
    stack tempStack = newStack();
    item lastItem = pop(s);
    push(lastItem, tempStack);
    while (!emptyStack(s))
    {
        item currentItem = pop(s);
        if (!eq(currentItem, lastItem))
        {
            push(currentItem, tempStack);
            lastItem = currentItem;
        }
    }
    while (!emptyStack(tempStack))
    {
        push(s, pop(tempStack));
    }
    freeStack(tempStack);
}