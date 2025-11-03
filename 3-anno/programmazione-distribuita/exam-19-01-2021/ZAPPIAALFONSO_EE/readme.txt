Cognome e Nome: ZAPPIA ALFONSO
Breve descrizione riassuntiva delle modifiche: dopo aver visionato attentamente il programma scritto durante la prova scritta, mi sono reso conto di alcune imprecisioni. Nel compito scritto
potrebbe trovare una lettera "c" come riferimento all'oggetto di tipo "Ministri" al posto della lettera "m". Si tratta di una svista, infatti la sera prima mi ero esercitato sulla traccia
di Sanremo, rimasta ben impressa nella mia mente, in cui era usata proprio la lettera "c". All'interno della prova scritta sono stati omessi tutti gli import e molto del codice che viene
normalmente autogenerato dal Netbeans è stato omesso, ma comunque specificato tramite commento. Per differenziare gli eventi ho inserito gli opportuni qualificatori, omessi all'interno della
prova a causa del poco tempo rimasto. Sono stati risolti anche problemi a livello di naming, infatti ho notato che nella prova scritta, in alcuni punti, i nomi non concordavano tra di loro.
Nella prova scritta ho creato soltanto tre oggetti persistenti di tipo ministro, ma nel progetto funzionante troverà altri due oggetti, scritti per questioni di testing.
Ovviamente, ci tengo a dire che all'interno del progetto funzionante troverà anche la struttura corretta del progetto, che all'interno dell'esame è stata omessa.
--------------------------------------
PROGETTO = GovernoEJB
FILE = DatabasePopulator.java
Linee 37/38: sono stati creati due nuovi oggetti persistenti per favorire il testing di JMS

FILE: Ministri.java
Linea 142: ho rimosso l'annotazione @GeneratedValue, che mi creava automaticamente l'id. Per quanto fosse una soluzione ottimale, creava molti problemi durante il testing di JMS, dato che
ad ogni deploy l'id cambiava continuamente. Per questo ho deciso di inserirlo manualmente al momento della creazione dell'oggetto persistente.
Dalla Linea 31 a 39: ho omesso sempre il ":" all'interno delle query
Nel file, poi, sono stati cambiati alcuni nomi delle variabili, per favorirne la comprensione e ho fatto generare automaticamente dall'IDE di Netbeans il toString, il costruttore vuoto e
il costruttore pieno e i vari metodi di getters e setters, che mi è risultato impossibile scrivere all'interno della prova per via del tempo a disposizione.
Linea 38: avevo messo gia il numero "2" in input quando non era opportuno.

FILE: MinistriEJB.java
Linea 26-Linea 31-Linea 36: sostituito la lettera "c" con la lettera "m", per i motivi spiegati all'interno della breve descrizione riassuntiva.
Linea 74: sbagliata l'impostazione del metodo all'interno della prova scritta, poiché non prende parametri e deve restituire una lista anziché un singolo risultato
Linea 80: sbagliata l'impostazione del metodo all'interno della prova scritta, poiché deve prendere un numero come parametro

FILE: DatabasePopulator.java
Linea 26: corretta la dicitura di "properties", scritta in maniera errata nella prova scritta.
Linea 31: sono stati creati altri due oggetti persistenti "m4" ed "m5", in più rispetto a quelli normalmente chiesti dall'esame, per favorire il testing del client JMS. Ovviamente, poi 
questi due oggetti sono stati debitamente aggiunto al "populateDB" e al "clearDB"

FILE: EuropeistaQualifier.java / RecoveryFoundQualifier.java
All'interno della prova scritta ho completamente omesso i qualifier, che servivano effettivamente a preservare gli eventi e anche a disambiguarli. 

FILE: NoticeEuropeista.java / NoticeEventUpdate.java / NoticeRecoveryFound.java
Sono stati cambiati i nomi di questi file e sono stati aggiunti i rispettivi qualificatori

FILE: MinistriMDB.java
Linea 23: sono state corretti le iniezioni di dipendenza per non creare interferenza.
Linea 34: aggiunto il cast a MessageWrapper
Dalla linea 35 a 43: all'interno della prova scritta, tutti i vari controlli non erano sincronizzati tra di loro oppure scritti come si deve. Quindi sono andato opportunamente a correggere
i controlli all'interno degli if, in modo che potessero funzionare correttamente e garantire la buona riuscita degli eventi tramite i metodi "fire()"
Linea 46: ho dimenticato di chiamare il metodo "updateMinistro" per modificare i dati.
Linea 49: ho cambiato la metodologia di cattura dell'eccezione, creando un Logger.
--------------------------------------
PROGETTO: MinistriClientStd
FILE: MinistriClientStd.java
Linea 22: è stata rimossa l'annotazione @Inject non necessaria
Linea 24: è stato aggiunto il "throws NamingException" necessario per il buon funzionamento del client
Linea 26: è stato aggiunto il cast al lookup con l'interfaccia Remote.
Linea 30: ho dimenticato di aggiungere il numero limite di sottosegretari che doveva essere preso in input.
Linea 37: ho dimenticato di creare l'invocazione che prenda in input il parametro di tipo Partito.
Linea 43: ho dimenticato di creare l'invocazione che prenda in input il parametro di tipo Partito.
Linea 52: ho dimenticato di creare l'invocazione che legge il numero limite di dipendenti preso in input.
--------------------------------------
PROGETTO: MinistriJMSClient
FILE: MinistriJMSClient.java
Linea 21: ho dimenticato di inserire il metodo main che serve poi a lanciare il client, con l'aggiunta del "throws NamingException"
Linea 23: è stato aggiunto il cast al lookup con la ConnectionFactory.
Linea 24: cambiato il nome della destinazione da "destionation" a "topic"
Linea 25: ho dimenticato di passare i parametri che servono a costruire l'oggetto "MessageWrapper".

FILE: MessageWrapper.java
Linea 18: avevo aggiunto una variabile Partito, ma non era assolutamente necessaria
Nel file, poi, sono stati cambiati alcuni nomi delle variabili, per favorirne la comprensione e ho fatto generare automaticamente dall'IDE di Netbeans il toString, il costruttore vuoto e
il costruttore pieno e i vari metodi di getters e setters, che mi è risultato impossibile scrivere all'interno della prova per via del tempo a disposizione.



