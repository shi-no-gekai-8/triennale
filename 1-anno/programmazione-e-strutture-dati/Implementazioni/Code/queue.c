#include <stdio.h>
#include <stdlib.h>
#include "item.h"
#include "queue.h"

struct node
{
    item value;
    struct node *next;
};

struct c_queue
{
    struct node *head, *tail;
    int numel;
};

queue newQueue(void)
{
    struct c_queue *q;
    q = malloc(sizeof(struct c_queue));
    if (q == NULL)
    {
        return NULL;
    }
    q->numel = 0;
    q->head = NULL;
    q->tail = NULL;
    return q;
}

int emptyQueue(queue q)
{
    if (q == NULL)
    {
        return -1;
    }
    return q->numel == 0;
}

int enqueue(item val, queue q)
{
    if (q == NULL)
    {
        return -1;
    }
    struct node *nuovo;
    nuovo = malloc(sizeof(struct node));
    if (nuovo == NULL)
    {
        return 0;
    }
    nuovo->value = val;
    nuovo->next = NULL;
    if (q->head == NULL)
    {
        q->head = nuovo;
    }
    else
    {
        q->tail->next = nuovo;
    }
    q->tail = nuovo;
    (q->numel)++;
    return 1;
}

item dequeue(queue q)
{
    if (q == NULL)
    {
        return NULLITEM;
    }
    if (q->numel == 0)
    {
        return NULLITEM;
    }
    item result = q->head->value;
    struct node *temp = q->head;
    q->head = q->head->next;
    free(temp);
    if (q->head == NULL)
    {
        q->tail = NULL;
    }
    (q->numel)--;
    return result;
}

void printQueue(queue q)
{
    if (q == NULL)
    {
        printf("La coda non esiste.\n");
        return;
    }
    struct node *current = q->head;
    printf("Queue: ");
    while (current != NULL)
    {
        output_item(current->value);
        printf(" - ");
        current = current->next;
    }
    printf("\n");
}
int sizeQueue(queue q)
{
    if (q == NULL || emptyQueue(q))
    {
        return 0; // La coda è vuota o non esiste
    }

    int size = 0;
    struct node *current = q->head;

    while (current != NULL)
    {
        size++;
        current = current->next;
    }

    return size;
}

queue cloneQueue(queue q)
{
    queue tmp = newQueue();
    queue clone = newQueue();
    while (!emptyQueue(q))
    {
        item itm = dequeue(q);
        enqueue(itm, tmp);
        enqueue(itm, clone);
    }
    q->head = tmp->head;
    q->tail = tmp->tail;
    q->numel = tmp->numel;
    return clone;
}

// funzioni esame
// int vicini
int vicini(queue q, item a, item b)
{
    int count = 0;
    queue q1 = cloneQueue(q);
    queue q2 = cloneQueue(q);
    if (emptyQueue(q))
    {
        return 0;
    }
    dequeue(q1);
    while (!emptyQueue(q1))
    {
        item i1 = dequeue(q2);
        item i2 = dequeue(q1);
        if (i2 == a && i1 == b)
        {
            count++;
        }
    }
    return count;
}

// funzione salta la coda
void salta_la_coda(queue q, item i)
{
    queue temp = newQueue();
    if (temp == NULL)
    {
        return;
    }
    while (!emptyQueue(q))
    {
        enqueue(dequeue(q), temp);
    }
    enqueue(i, q);
    while (!emptyQueue(temp))
    {
        enqueue(dequeue(temp), q);
    }
}