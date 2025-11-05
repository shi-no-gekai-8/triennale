#include "item.h"
typedef struct c_stack *stack;
stack newStack(void);
int emptyStack(stack s);
int pop(stack s);
int push(item val, stack s);
item top(stack s);
void printStack(stack s);
void freeStack(stack s);
stack cloneStack(stack s);
int findItem(stack s, item elem);

// funzioni esame
int duplicati(stack s1, stack s2);

// inverti a partire da
/*SPECIFICA SINTATTICA*/
/* inverti_a_partire_da(stack, item) -> stack*/
/*SPECIFICA SEMANTICA*/
/*inverti_a_partire_da(s, i) -> s1*/
/*Precondizione: s diverso da nil (stack vuoto)*/
/*Postcondizione: se s diverso da nil, allora inverte tutti gli elementi a partire da i e restituisce un nuovo stack s1 che contiene gli elementi del precedente, più gli elementi a partire da i invertiti*/
stack inverti_a_partire_da(stack s, item i);

// rimuovi duplicati consecutivi
/*SPECIFICA SINTATTICA*/
/* remove_consecutive_duplicates(stack) -> stack*/
/*SPECIFICA SEMANTICA*/
/*remove_consecutive_duplicates(s) -> s1/
/*Precondizione: s diverso da nil (stack vuoto) e devono essere presenti elementi duplicati*/
/*Postcondizione: se s diverso da nil e se ci sono elementi duplicati, restituisce un nuovo stack senza duplicati*/
void remove_consecutives_duplicates(stack s);