// hashtable.h
#define H_SIZE 50
#include "item.h" // Assicurati che "item.h" venga incluso correttamente

typedef struct hashtable
{
    item *table[H_SIZE];

} hashtable;
hashtable newHashtable(void);
int insertHash(hashtable h, item *elem);
item *hashDelete(hashtable h, char *key);
void destroyHashtable(hashtable h);
static void deleteList(struct item *p); // Questa funzione rimane, ma non crea conflitto con la definizione di "item"
int hashFun(char *k, int m);
unsigned int hashFun(const char *key, int size);
item *searchHash(hashtable h, const char *key);
int sizeHash(hashtable h);
void printHash(hashtable h);
float loadFactor(hashtable h);
