#include <stdio.h>
#include <stdlib.h>
#include "list.h"
#include "item.h"

struct node
{
    item value;
    struct node *next;
};

list newList(void)
{
    return NULL;
}

int emptyList(list l)
{
    return l == NULL;
}

list consList(item val, list l)
{
    struct node *nuovo;
    nuovo = malloc(sizeof(struct node));
    if (nuovo != NULL)
    {
        nuovo->value = val;
        nuovo->next = l;
        l = nuovo;
    }
    return l;
}

list tailList(list l)
{
    list temp;
    if (l != NULL)
    {
        temp = l->next;
    }
    else
    {
        temp = NULL;
    }
    return temp;
}

item getFirst(list l)
{
    item e;
    if (l != NULL)
    {
        e = l->value;
    }
    else
    {
        e = NULLITEM;
    }
    return e;
}

int sizeList(list l)
{
    int n = 0;
    while (!emptyList(l))
    {
        n++;
        l = tailList(l);
    }
    return n;
}

int posItem(list l, item val)
{
    int pos = 0;
    int found = 0;
    while (!emptyList(l) && !found)
    {
        if (eq(getFirst(l), val))
        {
            found = 1;
        }
        else
        {
            pos++;
            l = tailList(l);
        }
    }
    if (!found)
    {
        pos = -1;
    }
    return pos;
}

item getItem(list l, int pos)
{
    item e;
    int i = 0;
    if (pos < 0)
    {
        return NULLITEM;
    }
    while (i < pos && !emptyList(l))
    {
        i++;
        l = tailList(l);
    }
    if (!emptyList(l))
    {
        e = getFirst(l);
    }
    else
    {
        e = NULLITEM;
    }
    return e;
}

list reverseList(list l)
{
    list rev;
    item val;
    rev = newList();
    while (!emptyList(l))
    {
        val = getFirst(l);
        rev = consList(val, rev);
        l = tailList(l);
    }
    return rev;
}

void output_list(list l)
{
    int i = 0;
    item val;
    while (!emptyList(l))
    {
        val = getFirst(l);
        printf("Elemento di posizione: %d: ", i);
        output_item(val);
        printf("\n");
        l = tailList(l);
        i++;
    }
}
list input_list(int n)
{
    item val;
    list l = newList();
    for (int i = 0; i < n; i++)
    {
        printf("Elemento di posizione %d: ", i);
        input_item(&val);
        l = consList(val, l);
    }
    return reverseList(l);
}

int insertList(list *l, int pos, item val)
{
    int i = 0;
    list prec = *l, nuovo;
    if (pos == 0)
    {
        *l = consList(val, *l);
        return 1;
    }
    while (i < pos - 1 && prec != NULL)
    {
        prec = prec->next;
        i++;
    }
    if (prec == NULL)
    {
        return 0;
    }
    nuovo = malloc(sizeof(struct node));
    if (nuovo == NULL)
    {
        printf("Errore di allocazione.\n");
        return 0;
    }
    nuovo->value = val;
    nuovo->next = prec->next;
    prec->next = nuovo;
    return 1;
}

int removeList(list *l, int pos)
{
    int i = 0;
    list prec = *l, temp;
    if (pos == 0)
    {
        if (*l == NULL)
        {
            return 0;
        }
        temp = *l;
        *l = (*l)->next;
        free(temp);
        return 1;
    }
    while (i < pos - 1 && prec != NULL)
    {
        prec = prec->next;
        i++;
    }
    if (prec == NULL || prec->next == NULL)
    {
        return 0;
    }
    temp = prec->next;
    prec->next = temp->next;
    free(temp);
    return 1;
}

// funzione esame
//  item centrale
item centrale(list l)
{
    if (emptyList(l))
    {
        return NULLITEM;
    }
    list slow = l;
    list fast = l;
    int pos = 0;
    while (fast != NULL && tailList(fast) != NULL)
    {
        slow = tailList(slow);
        fast = tailList(tailList(fast));
        pos++;
    }
    return getItem(l, pos);
}

// inverti estremi
list inverti_estremi(list l)
{
    if (emptyList(l) || emptyList(tailList(l)))
    {
        return l;
    }
    item primo = getFirst(l);
    item ultimo = getFirst(reverseList(l));
    list senza_primo_ultimo = tailList(reverseList(tailList(l)));
    list nuova_lista = consList(ultimo, senza_primo_ultimo);
    return consList(primo, nuova_lista);
}