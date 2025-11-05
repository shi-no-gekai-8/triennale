#include <stdio.h>
#include <stdlib.h>
#include "punto.h"

void input_punti(punto a[], int n);
int coppie_vicine(punto a[], int n, float d);
int main()
{
    float d;
    int n, m;
    punto *a;
    do
    {
        printf("Numero di punti da caricare (numero intero positivo): ");
        scanf("%d", &n);
    } while (n < 1);
    a = malloc(n * sizeof(punto));
    input_punti(a, n);
    printf("Inserisci distanza: ");
    scanf("%f", &d);
    m = coppie_vicine(a, n, d);
    printf("Numero di coppie di punti con distanza");
    printf(" minore di %f: %d\n", d, m);
    return 0;
}
void input_punti(punto a[], int n)
{
    int i;
    float x, y;
    for (i = 0; i < n; i++)
    {
        printf("Ascissa punto %d: ", i);
        scanf("%f", &x);
        printf("Ordinata punto %d: ", i);
        scanf("%f", &y);
        a[i] = creaPunto(x, y);
    }
}

int coppie_vicine(punto a[], int n, float d)
{
    int i, j, m;
    m = 0;
    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (distanza(a[i], a[j]) < d)
            {
                m++;
            }
        }
    }
    return m;
}