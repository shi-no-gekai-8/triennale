#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "libretto.h"
#include "list.h"
#include "item.h"

void printEsami(list esami);

int main()
{
    libretto lib = NULL;
    int scelta, matricola;
    char nome[50], cognome[50], nomeEsame[50];
    int voto;
    char data[11];
    item esame;
    printf("Gestione Libretto Universitario\n");
    printf("-------------------------------\n");

    do
    {
        printf("\nScegli un'operazione:\n");
        printf("1. Crea un nuovo libretto.\n");
        printf("2. Aggiungi un esame.\n");
        printf("3. Visualizza tutti gli esami.\n");
        printf("4. Cerca un esame per nome.\n");
        printf("0. Esci\n");
        printf("Scelta: ");
        scanf("%d", &scelta);

        switch (scelta)
        {
        case 1:
            if (lib != NULL)
            {
                printf("Un libretto esiste già. Vuoi sovrascriverlo? (1=Si, 0=No): ");
                int conferma;
                scanf("%d", &conferma);
                if (!conferma)
                {
                    break;
                }
            }
            printf("Inserisci i dati dello studente:\n");
            printf("Matricola: ");
            scanf("%d", &matricola);
            printf("Cognome: ");
            scanf("%s", cognome);
            printf("Nome: ");
            scanf("%s", nome);
            lib = newLibretto(matricola, cognome, nome);
            printf("Libretto creato con successo!\n");
            break;
        case 2:
            if (lib != NULL)
            {
                printf("Crea un libretto prima di aggiungere esami.\n");
                break;
            }
            printf("Inserisci i dati dell'esame:\n");
            printf("Nome esame: ");
            scanf("%s", nomeEsame);
            printf("Voto: ");
            scanf("%d", &voto);
            printf("Data (gg/mm/aaaa): ");
            scanf("%s", data);
            esame = newItem(nomeEsame, voto, data);
            lib = addEsame(lib, esame);
            printf("Esame aggiunto con successo.\n");
            break;
        case 3:
            if (lib == NULL)
            {
                printf("Nessun libretto creato.\n");
                break;
            }
            printf("Esami nel libretto:\n");
            list esami = dammiEsami(lib);
            if (emptyList(esami))
            {
                printf("Nessun esame registrato.\n");
            }
            else
            {
                printEsami(esami);
            }
            break;
        case 4:
            if (lib == NULL)
            {
                printf("Crea un libretto prima di cercare esami.\n");
                break;
            }
            printf("Inserisci il nome dell'esame da cercare: ");
            scanf("%s", nomeEsame);
            esame = cercaEsame(lib, nomeEsame);
            if (esame != NULL)
            {
                printf("Esame trovato: ");
                printItem(esame);
                printf("\n");
            }
            else
            {
                printf("Esame non trovato.\n");
            }
            break;
        case 0:
            printf("Uscita in corso ....\n");
            break;
        default:
            printf("Scelta non valida. Riprova.\n");
            break;
        }
    } while (scelta != 0);
    return 0;
}
void printEsami(list esami)
{
    while (!emptyList(esami))
    {
        item esame = getFirst(esami);
        printItem(esame);
        esami = tailList(esami);
    }
}