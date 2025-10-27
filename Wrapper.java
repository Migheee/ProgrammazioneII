/*
 * ORIENTAMENTO AGLI OGGETTI PURO E CLASSI WRAPPER
 *
 * 1. Orientamento agli oggetti puro
 * - In un linguaggio puro OO esistono solo classi e oggetti.
 * - Per motivi di efficienza, Java utilizza anche tipi primitivi (int, float, ecc.).
 *
 * 2. Classi wrapper
 * - Le classi wrapper sono versioni oggetto dei tipi primitivi.
 * - Permettono di eseguire conversioni tra tipi diversi e di trattare valori primitivi come oggetti.
 *
 * Tipi primitivi e classi wrapper:
 *   byte    → Byte
 *   short   → Short
 *   int     → Integer
 *   long    → Long
 *   float   → Float
 *   double  → Double
 *   char    → Character
 *   boolean → Boolean
 *
 * - I costruttori delle classi wrapper creano oggetti che contengono un valore primitivo.
 * - Tutte le classi wrapper sono definite nel package java.lang.
 *
 * 3. Esempi di wrapper
 *   // Boxing: avvolgere un valore primitivo in un oggetto
 *   Integer wi = new Integer(3);
 *   Double wd = new Double(2.1);
 *
 *   // Unboxing: estrarre il valore primitivo dall'oggetto
 *   int i = wi.intValue();
 *   double d = wd.doubleValue();
 *
 *   // wi e wd sono riferimenti ad oggetti che contengono valori primitivi
 *
 * 4. Conversioni comuni
 *   int i;
 *   Integer wi = new Integer(i);   // da int a Integer
 *   i = wi.intValue();             // da Integer a int
 *
 *   String s;
 *   s = String.valueOf(i);         // da int a String
 *   wi = Integer.valueOf(s);       // da String a Integer
 *   i = Integer.parseInt(s);       // da String a int
 *   s = wi.toString();             // da Integer a String
 *
 * 5. Autoboxing e unboxing automatico
 * - Dal Java 5, il compilatore gestisce automaticamente il boxing e l'unboxing:
 *   Integer wi = new Integer(2);
 *   int j = 0;
 *   j = wi + 5;   // invece di j = wi.intValue() + 5;
 *   wi = 3;       // invece di wi = new Integer(3);
 *   wi = j;       // invece di wi = new Integer(j);
 *
 * Nota: new Integer() è deprecato a partire da Java 9.
 *
 * METODI UTILITY DELLE CLASSI WRAPPER
 *
 * 1. Le classi wrapper forniscono metodi utility statici
 * - La classe Character, ad esempio, include metodi utili come:
 *   isLetter(), isDigit(), isSpaceChar(), ...
 *   toUpperCase(), toLowerCase(), ...
 *
 * Esempio:
 *   Character wc1 = 'g'; // usare "g" darebbe errore di compilazione
 *   Character wc2 = Character.toUpperCase(wc1);
 *
 *   System.out.println(wc2); // Output: 'G'
 *   System.out.println(wc1); // Output: 'g'
 *
 * 2. Come le stringhe
 * - Le classi wrapper sono contenitori di valori, simili agli oggetti String.
 * - Gli oggetti delle classi wrapper sono **immutabili**, proprio come gli oggetti String.
 * - Tutte le classi wrapper forniscono un metodo toString().
 *
 * Esempio:
 *   int j = 3;
 *   Integer wi = j; // viene creato un nuovo oggetto Integer '3', wi lo punta
 *   wi = 7;         // viene creato un nuovo oggetto Integer '7', wi lo punta
 *
 *
 *   Ecco la traduzione pronta come commento Java:
 *
 * CONFRONTO TRA OGGETTI WRAPPER
 *
 * - Con le classi wrapper, l'operatore `==` **controlla l'uguaglianza dei riferimenti**,
 *   non dei valori contenuti.
 * - Per confrontare i valori, utilizzare il metodo incorporato `equals()`.
 *   int x = 3; 
 *   Integer wx = x; 
 *   int y = 3; 
 *
 * CONFRONTI TRA TIPI PRIMITIVI E CLASSI WRAPPER
 *
 * int x = 3;            // tipo primitivo
 * Integer wx = x;       // autoboxing: crea un oggetto Integer contenente 3
 * int y = 3;            // tipo primitivo
 * Integer wy = y;       // autoboxing: crea un altro oggetto Integer contenente 3
 * Integer wi = new Integer(3); // crea un nuovo oggetto Integer esplicitamente
 *
 * Confronti:
 *
 * x == y           → true  
 *   // confronto tra valori primitivi, quindi restituisce true
 *
 * wx == wi         → false
 *   // confronto tra riferimenti: wi è un oggetto nuovo, quindi non è lo stesso oggetto
 *
 * wx == wy         → true o false
 *   // confronto tra riferimenti: il risultato dipende dal caching degli Integer (-128..127)
 *
 * wx.equals(wy)    → true
 *   // confronto tra valori contenuti negli oggetti, sempre true
 *
 * wx.equals(wi)    → true
 *   // confronto tra valori contenuti negli oggetti, sempre true
 *
 * Nota:
 * - Per confrontare valori numerici contenuti in oggetti wrapper, usare sempre equals().
 * - L'operatore == confronta i riferimenti degli oggetti, non il contenuto.
 */


