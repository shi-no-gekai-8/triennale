#include <stdio.h>
#include "btree.h"
#include "item.h"

int main()
{
    Btree T = newBtree(); // L'albero inizialmente vuoto
    int scelta, sceltaFunzioneEsame;

    // Albero per la funzione foglieK
    Btree foglieKTree = consBtree(10,
                                  consBtree(5,
                                            consBtree(3, NULL, NULL),
                                            consBtree(7,
                                                      consBtree(6, NULL, NULL),
                                                      NULL)),
                                  consBtree(15,
                                            consBtree(12, NULL, NULL),
                                            consBtree(20, NULL, NULL)));

    // Alberi per la funzione strutturalmenteUguali
    Btree SET1 = consBtree(1,
                           consBtree(2, NULL, NULL),
                           consBtree(3, NULL, NULL));
    Btree SET2 = consBtree(4,
                           consBtree(5, NULL, NULL),
                           consBtree(6, NULL, NULL));

    Btree NSET1 = consBtree(1,
                            consBtree(2,
                                      consBtree(4, NULL, NULL),
                                      NULL),
                            consBtree(3, NULL, NULL));
    Btree NSET2 = consBtree(4,
                            consBtree(5, NULL, NULL),
                            consBtree(6,
                                      consBtree(7, NULL, NULL),
                                      NULL));

    // Alberi per la funzione sommaUguali
    Btree LRSS1 = consBtree(15,
                            consBtree(7,
                                      consBtree(3, NULL, NULL),
                                      consBtree(4, NULL, NULL)),
                            consBtree(7,
                                      consBtree(2, NULL, NULL),
                                      consBtree(5, NULL, NULL)));

    Btree NLRSS1 = consBtree(10,
                             consBtree(5,
                                       consBtree(2, NULL, NULL),
                                       consBtree(3, NULL, NULL)),
                             consBtree(6,
                                       consBtree(2, NULL, NULL),
                                       consBtree(4, NULL, NULL)));

    // Albero per la funzione figliDestri
    Btree RST = consBtree(10,
                          consBtree(5,
                                    consBtree(3, NULL, NULL),
                                    NULL),
                          consBtree(15,
                                    NULL,
                                    consBtree(20,
                                              NULL,
                                              consBtree(25, NULL, NULL))));
    Btree CT = consBtree(10,
                         consBtree(5, NULL, NULL),
                         consBtree(20,
                                   consBtree(15, NULL, NULL),
                                   NULL));
    Btree NT = consBtree(10,
                         consBtree(20,
                                   consBtree(40,
                                             consBtree(70, NULL, NULL),
                                             consBtree(80, NULL, NULL)),
                                   consBtree(50,
                                             consBtree(90, NULL, NULL),
                                             consBtree(100, NULL, NULL))),
                         consBtree(30,
                                   consBtree(60, NULL, NULL),
                                   NULL));

    printf("Gestione albero binario\n");
    do
    {
        printf("\nMenu:\n");
        printf("1. Creare un albero binario\n");
        printf("2. Stampare l'albero in pre-ordine\n");
        printf("3. Stampare l'albero in post-ordine\n");
        printf("4. Stampare l'albero in ordine simmetrico (in-order)\n");
        printf("5. Conta i nodi dell'albero.\n");
        printf("6. Funzioni speciali dell'esame\n");
        printf("0. Uscire\n");
        printf("Scegli un'opzione: ");
        scanf("%d", &scelta);

        switch (scelta)
        {
        case 1: // Creare un albero binario
            T = inputBtree(0);
            printf("Albero creato con successo.\n");
            break;

        case 2: // Stampare in pre-ordine
            if (emptyBtree(T))
                printf("L'albero è vuoto.\n");
            else
            {
                printf("Visita in pre-ordine:\n");
                preOrder(T);
                printf("\n");
            }
            break;

        case 3: // Stampare in post-ordine
            if (emptyBtree(T))
                printf("L'albero è vuoto.\n");
            else
            {
                printf("Visita in post-ordine:\n");
                postOrder(T);
                printf("\n");
            }
            break;

        case 4: // Stampare in ordine simmetrico (in-order)
            if (emptyBtree(T))
                printf("L'albero è vuoto.\n");
            else
            {
                printf("Visita in ordine simmetrico:\n");
                inOrder(T);
                printf("\n");
            }
            break;
        case 5:
            printf("Questo albero ha in totale %d nodi.\n", contaNodi(CT));
            break;

        case 6: // Funzioni dell'esame
            printf("Che funzione vuoi eseguire?\n");
            printf("1. Funzione _foglieK_\n");
            printf("2. Funzione _strutturalmenteUguali_\n");
            printf("3. Funzione _somma_uguali_\n");
            printf("4. Funzione _contaFigliDestri_\n");
            printf("5. Funzione numero_nipoti\n");
            scanf("%d", &sceltaFunzioneEsame);

            switch (sceltaFunzioneEsame)
            {
            case 1:
                printf("Conta foglie oltre K (K=1): %d\n", foglieK(foglieKTree, 1));
                break;
            case 2:
                printf("Mostrerò prima due alberi strutturalmente uguali.\n");
                outputBtree(SET1);
                printf("\n");
                outputBtree(SET2);
                printf("\n");
                printf("SET1 e SET2: %s\n", strutturalmenteUguali(SET1, SET2) ? "Uguali" : "Diversi");
                printf("Ora, due alberi che non sono strutturalmente uguali.\n");
                outputBtree(NSET1);
                printf("\n");
                outputBtree(NSET2);
                printf("\n");
                printf("NSET1 e NSET2: %s\n", strutturalmenteUguali(NSET1, NSET2) ? "Uguali" : "Diversi");
                break;
            case 3:
                printf("Mostrerò un albero la cui somma dei sottoalberi destri e sinistri è uguale.\n");
                outputBtree(LRSS1);
                printf("\n");
                printf("LRSS1: %s\n", uguale_somma_dx_sx(LRSS1) ? "Somme uguali" : "Somme diverse");
                printf("Mostrerò un albero la cui somma dei sottoalberi destri e sinistri è diversa.\n");
                outputBtree(NLRSS1);
                printf("\n");
                printf("NLRSS1: %s\n", uguale_somma_dx_sx(NLRSS1) ? "Somme uguali" : "Somme diverse");
                break;
            case 4:
                printf("Ecco l'albero presentato per questa funzione.\n");
                outputBtree(RST);
                printf("RST ha %d figli destri.\n", figli_destri(RST));
                break;
            case 5:
                printf("Ecco l'albero che prenderemo in considerazione.\n");
                outputBtree(NT);
                printf("Controlliamo il numero di nipoti di primo grado a partire dal livello 20: \n");
                printf("Il numero di nipoti dal livello 20 è: %d.\n", numero_nipoti(NT, 20));
                break;
            default:
                printf("Opzione non valida.\n");
            }
            break;

        case 0: // Uscire
            printf("Uscita dal programma.\n");
            break;

        default:
            printf("Opzione non valida.\n");
        }
    } while (scelta != 0);

    return 0;
}
