#include "item.h"
typedef struct c_queue *queue;
queue newQueue(void);
int emptyQueue(queue q);
item dequeue(queue q);
int enqueue(item val, queue q);
void printQueue(queue q);
int sizeQueue(queue q);
queue cloneQueue(queue q);

// funzioni esame
int vicini(queue q, item a, item b);
void salta_la_coda(queue q, item i);
