#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

void finput_array(char *file_name, int a[], int n)
{
    FILE *fd = fopen(file_name, "r");
    if (fd == NULL)
    {
        printf("Errore in apertura del file %s\n", file_name);
        exit(1);
    }

    for (int i = 0; i < n; i++)
    {
        int res = fscanf(fd, "%d", &a[i]);
        if (res != 1) // Verifica se la lettura è andata a buon fine
        {
            printf("Errore nella lettura del numero nell'array (formato errato o fine file raggiunta)\n");
            break;
        }
    }

    fclose(fd);
}

void ordina_array(int *a, int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] > a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}

void foutput_array(char *file_name, int a[], int n)
{
    char cwd[1024];

#ifdef _WIN32
    if (GetCurrentDirectory(sizeof(cwd), cwd) == 0)
    {
        printf("Impossibile ottenere la directory corrente su Windows\n");
    }
    else
    {
        printf("Directory di lavoro corrente (Windows): %s\n", cwd);
    }
#else
    if (getcwd(cwd, sizeof(cwd)) != NULL)
    {
        printf("Directory di lavoro corrente: %s\n", cwd);
    }
    else
    {
        printf("Impossibile ottenere la directory corrente\n");
    }
#endif

    FILE *fd = fopen(file_name, "w");
    if (fd == NULL)
    {
        printf("Errore in apertura del file %s\n", file_name);
        exit(1);
    }

    for (int i = 0; i < n; i++)
    {
        fprintf(fd, "%d\n", a[i]);
    }

    fflush(fd); // Forza la scrittura nel file prima di chiuderlo
    fclose(fd);

    printf("File di output creato con successo.\n");
}