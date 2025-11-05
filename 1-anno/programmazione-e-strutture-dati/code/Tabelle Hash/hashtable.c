#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "item.h"
#include "hashtable.h"

hashtable newHashtable(void)
{
    int i;
    hashtable h = (hash *)malloc(sizeof(hash));
    h->size = H_SIZE;
    h->table = (item **)calloc(H_SIZE, sizeof(item *));
    return h;
}

int insertHash(hashtable h, item *elem)
{
    int idx;
    item *head, *curr;
    idx = hashFun(elem->key, h->size);
    curr = head = h->table[idx];
    while (curr)
    {
        if (strcmp(curr->key, elem->key) == 0)
        {
            return 0; // Chiave già esistente
        }
        curr = curr->next;
    }
    elem->next = head;
    h->table[idx] = elem;
    return 1;
}
item *hashDelete(hashtable h, char *key)
{
    int idx;
    item *prev, *curr, *head, *temp;
    idx = hashFun(key, h->size);
    prev = curr = head = h->table[idx];
    while (curr)
    {
        if (!strcmp(curr->key, key))
        {
            if (curr == head)
            {
                h->table[idx] = curr->next;
            }
            else
            {
                prev->next = curr->next;
            }
            return (curr);
        }
        prev = curr;
        curr = curr->next;
    }
    return NULL;
}

void destroyHash(hashtable h)
{
    int i;
    for (i = 0; i < h->size; i++)
    {
        deleteList(h->table[i]);
    }
    free(h->table);
    free(h);
    return;
}

static void deleteList(struct item *p)
{
    if (p == NULL)
    {
        return;
    }
    deleteList(p->next);
    free(p);
    return;
}

unsigned int hashFun(const char *key, int size)
{
    unsigned long hash = 5381;
    int c;
    while ((c = *key++))
    {
        hash = ((hash << 5) + hash) + c;
    }
    return hash % size;
}

item *searchHash(hashtable h, const char *key)
{
    if (!h || !key)
    {
        return NULL;
    }
    int idx = hashFun(key, h->size);
    item *curr = h->table[idx];
    while (curr)
    {
        if (strcmp(curr->key, key) == 0)
        {
            return curr;
        }
        curr = curr->next;
    }
    return NULL;
}

int sizeHash(hashtable h)
{
    if (!h)
    {
        return 0;
    }
    int count = 0;
    for (int i = 0; i < h->size; i++)
    {
        item *curr = h->table[i];
        while (curr)
        {
            count++;
            curr = curr->next;
        }
    }
    return count;
}

void printHash(hashtable h)
{
    if (!h)
    {
        printf("La tabella hash è vuota.\n");
        return;
    }
    for (int i = 0; i < h->size; i++)
    {
        printf("Indice %d: ", i);
        item *curr = h->table[i];
        if (!curr)
        {
            printf("NULL\n");
            continue;
        }
        while (curr)
        {
            printf("[Chiave: %s, Intero1: %d, Intero2: %d] -> ", curr->key, curr->intero1, curr->intero2);
            curr = curr->next;
        }
        printf("NULL\n");
    }
}

float loadFactor(hashtable h)
{
    if (!h || h->size == 0)
    {
        return 0.0;
    }
    int numElements = sizeHash(h);
    return (float)numElements / h->size;
}