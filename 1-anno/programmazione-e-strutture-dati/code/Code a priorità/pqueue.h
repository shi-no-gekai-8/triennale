typedef struct c_PQ *PQueue;
PQueue newPQ(void);
int emptyPQ(PQueue q);
int getMax(PQueue q);
int deleteMax(PQueue q);
int insert(PQueue q, int key);
int sizePQ(PQueue q);
void clearPQ(PQueue q);
int isFullPQ(PQueue q);
void printPQ(PQueue q);
void destroyPQ(PQueue q);

// funzioni aggiunte
void givePriority(PQueue q);