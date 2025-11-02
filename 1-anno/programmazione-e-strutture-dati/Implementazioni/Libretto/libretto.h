#ifndef LIBRETTO_H
#define LIBRETTO_H
#include "list.h"
#include "item.h"

// definizione del tipo libretto come puntatore
typedef struct libretto *libretto;

/**
 * @brief Crea un nuovo libretto con i dati dello studente
 *
 * @param mat Matricola dello studente (intero)
 * @param cogn Cognome dello studente (stringa)
 * @param nom Nome dello studente (stringa)
 * @return Un puntatore al nuovo libretto creato
 */
libretto newLibretto(int mat, char *cogn, char *nom);

/**
 * @brief Aggiunge un esame al libretto
 *
 * @param l Puntatore al libretto
 * @param es Esame da aggiungere
 * @return Il libretto aggiornato
 */
libretto addEsame(libretto l, item es);

/**
 * @brief Restituisce la lista degli esami contenuti nel libretto.
 * @param l Puntatore al libretto.
 * @return Una lista degli esami (di tipo lista).
 */
list dammiEsami(libretto l);

/**
 * @brief Cerca un esame nel libretto in base al nome.
 * @param l Puntatore al libretto.
 * @param nome_es Nome dell'esame da cercare (stringa).
 * @return L'esame trovato (di tipo item), oppure NULL se non esiste.
 */
item cercaEsame(libretto l, char *nome_es);

#endif // LIBRETTO_H