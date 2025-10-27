/*
 * MEMORIA DEL PROGRAMMA
 *
 * 1. Memoria Statica:
 *    - Utilizzata per gli elementi condivisi da tutte le istanze di una classe.
 *    - Esempi: definizioni di classi, campi statici, costanti.
 *    - La stessa copia della variabile è condivisa da tutte le istanze.
 *    - Viene creata al momento del caricamento della classe.
 *    - Le variabili statiche appartengono alla classe stessa, non ai singoli oggetti.
 *      Se un oggetto modifica una variabile statica, il cambiamento è visibile
 *      a tutti gli altri oggetti della stessa classe.
 *    - In contesti multithread può essere necessario sincronizzarne l’accesso
 *      (es. usando 'synchronized' in Java).
 *
 * 2. Heap Memory:
 *    - Utilizzata per gli elementi dipendenti dall’istanza di una classe.
 *    - Esempi: oggetti creati con l’operatore 'new'.
 *    - Gli oggetti rimangono nello heap finché non vengono rimossi dal garbage collector.
 *    - Le istanze dei campi vengono memorizzate nello heap al momento della creazione dell’oggetto.
 *
 * 3. Stack:
 *    - Utilizzato per gli elementi creati a runtime.
 *    - Esempi: variabili locali, parametri dei metodi, record di attivazione (frame dei metodi).
 *    - Ogni metodo o blocco crea nuove copie delle variabili locali.
 *    - Lo stack è LIFO: quando il metodo termina, le variabili locali vengono automaticamente distrutte.
 *    - Le variabili locali hanno visibilità a livello di blocco (block scope): visibili solo
 *      all’interno del blocco { ... } dove sono dichiarate.
 *
 * ESEMPIO DI CAMPPO STATICO E VARIABILE LOCALE:
 *
 * public class Clazz {
 *     static String s1; // riferimento allocato nella Static Memory
 *
 *     void aMethod() {
 *         String s2; // riferimento allocato nello Stack
 *         s2 = new String("Hello"); // l’oggetto String è allocato nello Heap
 *                                   // e s2 punta a quell’oggetto
 *     }
 * }
 *
 * VARIABILI STATICHE: inizializzazione e blocchi statici
 *
 * - Le variabili statiche possono essere inizializzate durante la dichiarazione con valori singoli.
 * - Inizializzazioni più complesse possono essere eseguite con blocchi statici:
 *
 *   static int[] arr; // deve essere dichiarato prima
 *   static {
 *       arr = new int[3];
 *       arr[0] = 1;
 *       arr[1] = 2;
 *       arr[2] = 0;
 *   }
 *
 * - I campi e i blocchi statici vengono gestiti dalla JVM nell’ordine in cui sono dichiarati.
 *
 * GARBAGE COLLECTOR
 *
 * - Il garbage collector libera automaticamente la memoria non utilizzata.
 * - Controlla periodicamente la memoria alla ricerca di riferimenti inattivi.
 * - Non influisce sulle variabili statiche e d’istanza.
 * - È possibile richiamarlo manualmente con System.gc().
 *
 * VARIABILI D’ISTANZA
 *
 * - Ogni oggetto ha una copia diversa delle variabili d’istanza.
 * - Vengono create e inizializzate alla creazione dell’oggetto.
 * - Non sono condivise tra oggetti della stessa classe.
 *
 * VARIABILI LOCALI
 *
 * - Esistono solo all’interno del metodo o del blocco in cui sono dichiarate.
 * - Vengono allocate nello stack al momento dell’invocazione del metodo.
 * - Distrutte automaticamente alla fine del metodo o blocco.
 *
 * SINGLETON PATTERN
 *
 * Il Singleton è un pattern creazionale che garantisce che una classe abbia una sola istanza e fornisce un punto di accesso globale a quella istanza.
 * 
 * Caratteristiche principali:
 * - Unica istanza: nessun altro oggetto della classe può essere creato.
 * - Accesso globale: la stessa istanza è accessibile ovunque nel programma.
 * - Controllo della creazione: il costruttore è reso privato per impedire istanziazioni esterne.
 *
 * Dal punto di vista insiemistico l'insieme contente l'istanza di una classe singleton è un singoletto (insieme con un solo elemento)
 *
 * L'implementazione avviene con un costruttore privato, così facendo solo all'interno della classe in cui è stato definito è possibile creare un oggetto Singleton.
 * Se si vuole creare un singleton da una classe diversa, è possibile attraverso un meotod pubblico e statico che solitamente è chiamato getIstance()

 */

