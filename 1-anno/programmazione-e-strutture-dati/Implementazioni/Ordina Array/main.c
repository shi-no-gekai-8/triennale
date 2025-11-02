#include <stdio.h>
#include <stdlib.h>
#include "vettore.h"

int main(int argc, char *argv[])
{
    if (argc < 4)
    {
        printf("Numero parametri non corretto");
        return 1;
    }
    else
    {
        int n = atoi(argv[1]);
        int *a = calloc(n, sizeof(int));
        if (a == NULL)
        {
            printf("Memoria insufficiente\n");
        }
        else
        {
            printf("Caricamento dei dati dal file di input...\n");
            finput_array(argv[2], a, n);
            printf("Ordinamento dell'array...\n");
            ordina_array(a, n);
            printf("Scrittura dei dati nel file di output...\n");
            foutput_array(argv[4], a, n);
            free(a);
            return 0;
        }
    }
}