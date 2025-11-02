
#include "item.h"
typedef struct node *list;
list newList(void);
int emptyList(list l);
list tailList(list l);
list consList(item val, list l);
item getFirst(list l);
int sizeList(list l);
int posItem(list l, item val);
item getItem(list l, int pos);
list reverseList(list l);
void output_list(list l);
list input_list(int n);
int insertList(list *l, int pos, item val);
int removeList(list *l, int pos);