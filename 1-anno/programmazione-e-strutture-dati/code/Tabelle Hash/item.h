#define NULLITEM 0
typedef struct item
{
    char *key;
    int intero1, intero2;
    struct item *next;
} item;

item *newItem(const char *key, int intero1, int intero2);