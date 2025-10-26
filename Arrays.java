/*
Array in Java

Un array è una sequenza ordinata di variabili dello stesso tipo, accessibili mediante un indice (numero naturale).

In Java, tutte le variabili che fanno parte di un array hanno lo stesso tipo.
È possibile avere array di tipo primitivo (int, float, double, boolean) oppure di tipo riferimento (puntatori a oggetti).
In Java, tutto è un oggetto, ad eccezione dei tipi primitivi; pertanto, gli array di oggetti non contengono gli oggetti stessi, ma puntatori a essi.
Un array è un oggetto che contiene puntatori; gli oggetti associati all'array risiedono in un'altra locazione di memoria.
La dimensione dell'array è definita a runtime, quindi viene allocata e calcolata dinamicamente durante l'esecuzione della classe. Tuttavia, una volta istanziato, la lunghezza dell'array non può più essere modificata. Si ha quindi una creazione dinamica dell'array, ma non una gestione dinamica della sua dimensione.
L'indice dell'array parte da 0.
Gli array in Java sono oggetti allocati nello heap (memoria dinamica del processo), e pertanto necessitano di un'allocazione di memoria.
A livello di dichiarazione, dichiarare un array equivale a dichiarare un puntatore:
       int[] arr;
In questo caso, arr è una reference a un oggetto (puntatore a una sequenza di interi). Anche se il tipo è primitivo, si tratta sempre di un puntatore ad un oggetto.
Quando si inizializza l'array, un nuovo oggetto viene creato nello heap. Il puntatore restituito viene assegnato alla variabile arr, rendendola utilizzabile come oggetto.
Essendo una reference a un oggetto, il valore di default della variabile è null.
Non è necessario specificare la dimensione alla dichiarazione, poiché si sta dichiarando solo un puntatore. La dimensione verrà specificata al momento dell'inizializzazione.
Entrambe le notazioni int[] arr; e int arr[]; sono consentite e equivalenti in Java.
L'inizializzazione di un array avviene tramite l'operatore new.
Esempio:
       float[] arr = new float[10];
Alloca un array di float con 10 elementi.
È possibile inizializzare la dimensione in modo dinamico:
       int size = 7;
       float[] arr = new float[size];
L'operatore new alloca uno spazio sufficientemente grande per ospitare size_arr * sizeof(array_type).
Un array può essere inizializzato direttamente al momento della dichiarazione:
       int[] nums = new int[]{2, 3, 5};
In questo caso non è necessario definire la dimensione.
Al momento dell'inizializzazione, gli elementi dell'array vengono inizializzati con i valori di default del tipo di dato associato all'array.

    Anche la seguente notazione (equivalente ) a quella precedente è consentita
    int[] nums = [2,3,5];
    Anche se poi starà al Parser della JVM a tradurre questa notazione in quella precedente

    Per quanto riguarda invece Oggetti (o comunque tipi di dati non di default)
    Car[] cars = {new Car("red"), myCar};

    In questo caso al primo elemento verrà restituita la reference (puntatore) dell'oggetto appena istanziato

    ACESSO IN MEMORIA: Avviene come nel C, ossia con le parentesi []
    int primes = {2,3,5};
    primes[1] ---> 2 (La JVM fa una derefence del puntatore e va accedere al secondo oggetto dell'array primes)

    A livello di compilazione non c'è un check sul bound degli array
    primes[6] ---> La JVM lancierà un'eccezione

    Per scrivere un elemento in un array si usano sempre le parentesi quadre
    Car[] cars = new Car[3]; viene allocato lo spazio per 3 oggetti di tipo Car
    cars[1] = new Car("red"); //cars points to [null, Car@3ft2f4, null]
    

    ARRAY OPERATIONS: Ogni array ha uno pseudo campo length
    int primes = {2,3,5};
    System.out.println(primes.length)  // output sarà 4


    Se l'array non è stato inizializzato (oppure null), la lunghezza non è accessibile

    Come per gli oggetti, se testiamo l'uguaglianza con == stiamo controllando l'uguaglianza sui reference
    int[] a1 = {1,2,3}, a2 = {1,2,3};
    a1 == a2 è false
    E nemmeno il metodo equals non funziona, perchè non va a guaradare elemento per elemento, ma bensì un confronto dei puntatori contenuti nei due array

    Però si può usare java.util che ci permette di fare una comparazione con Arrays.equals(arr1, arr2) che controlla l'uguaglianza degli elementi degli array. 

    Lo stesso si applica per il metood toString(), non si va a stampare il contenuto, ma bensì una versione sottoforma di puntatore dell'array
    
    int[] a1 = {1,2,3}, a2 = {1,2,3};
    System.out.println(a1.toString()); ---> [I@6ce3r232]

    Ma, anche in questo caso nel package java.util package esiste un metodo toString() human-readable
    System.out.println(Arrays.toString(arr)); ---> [1,2,3]

    Enhanced for Loop (tipo foreach in C#)
    for(Type var : IterExpr)
    Esempio:
    for(String arg : args)   //args è un array di stringhe, arg è una variabile di tipo Stringa
        System.out.println(args);

    Lo scopo della variabile arg è il codice del ciclo for (come i dichiarata e inizializzata in un ciclo for)
    L' Enhanced for appena visto è equivalente al seguente for
    for(int i = 0; i < args.length; i++){
        String arg = args[i];
        System.out.println(arg);
    }

    

    MULTIDIMENSIONAL ARRAY
    String[][] table = new String[2][3]; // array di due elementi dove ogni elemento è un array di 3 elementi


    table ---------
                   |
                 ______
                |______|-----------------------
                |______|------                 |
                             |                 |                
                              ______           |
                             | null |          |
                             | null |          |
                             | null |         ______
                                             | null |
                                             | null |
                                             | null | -----> | str | (se un oggetto viene inizializzato)


    Gli array multidimensionali non sono salvati in locazioni contigue di memoria
    Non abbiamo località spaziale negli array multidimensionali
    VANTAGGI
    1. Swap di righe molto più semplice
    Esempio:
    temp = matrix[0];
    matrix[0] = matrix[1];
    matrix[1] = temp;
    2. Gli array multidimensionali hanno lunghezza variabile
        int[][] pyramid new int[3][];
        pyramid[0] = new int[1];            [null]
        pyramid[1] = new int[2];          [null,null]
        pyramid[2] = new int[3];        [null,null,null]


    In generale, array multidimensionali non posso essere comparati con ==, equals(), Arrays.equals()
    Lo stesso capita con i metodi toString(), Arrays.toString();

    Per stampare, quindi
        
    for(int[] row : matrix)
        System.out.println(Arrays.toString(row);

    

*/

