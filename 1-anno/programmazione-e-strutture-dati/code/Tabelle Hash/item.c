#include <stdlib.h>
#include <string.h>
#include "item.h"

item *newItem(const char *key, int intero1, int intero2)
{
    item *newElem = (item *)malloc(sizeof(item));
    if (!newElem)
    {
        return NULL;
    }
    newElem->key = strdup(key);
    if (!newElem->key)
    {
        free(newElem);
        return NULL;
    }
    newElem->intero1 = intero1;
    newElem->intero2 = intero2;
    newElem->next = NULL;
    return newElem;
}