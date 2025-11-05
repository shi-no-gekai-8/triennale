/*
int foglieK(Btree T, int k)
{
    if (T == NULL || k < 0)
    {
        printf("Albero vuoto, impossibile procedere.\n");
        return 0;
    }
    return contaFoglieAlLivello(T, k, 0);
}
static int contaFoglieAlLivello(Btree T, int k, int livello)
{
    if (T == NULL)
    {
        return 0;
    }
    if (livello == k)
    {
        if (figlioSX(T) == NULL && figlioDX(T) == NULL)
        {
            return 1;
        }
        return 0;
    }
    return contaFoglieAlLivello(figlioSX(T), k, livello + 1) + contaFoglieAlLivello(figlioDX(T), k, livello + 1);
}

*/