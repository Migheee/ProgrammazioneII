/*
 * IMMUTABILITÀ, FINAL E PASSAGGIO DEI PARAMETRI
 *
 * 1. Immutabilità
 *
 * - L’**immutabilità** significa che lo **stato interno di un oggetto rimane costante
 *   dopo la sua creazione**.
 * - Esempio classico: la classe **String**.
 *
 *   String name = "Samuel";                   // 1
 *   String newName = name.replace("uel", ""); // 2
 *
 *   System.out.println(newName); // 3 → Output: "Sam"
 *   System.out.println(name);    // 4 → Output: "Samuel"
 *
 * - Come si nota, il metodo `replace` **non modifica l’oggetto originale** `name`,
 *   ma restituisce un **nuovo oggetto**.
 * - Le **classi immutabili** forniscono quindi **solo metodi di lettura** (read-only),
 *   impedendo modifiche allo stato interno.
 *
 * 2. La parola chiave `final`
 *
 * - La keyword **`final`** permette di **congelare una variabile** al suo
 *   **valore di inizializzazione**.
 * - Esempio:
 *
 *   final Person sam = new Person("Sam"); // 1
 *
 *   // Dopo questa dichiarazione, il riferimento `sam` **non può essere cambiato**
 *   // cioè non è possibile assegnargli un nuovo oggetto.
 *   sam = new Person("Joe"); // Non consentito
 *
 *   // Attenzione: solo il riferimento è immutabile;
 *   // lo stato interno dell’oggetto può comunque essere modificato.
 *   sam.name = "Joe"; //  Consentito
 *
 * - Sintesi:
 *   - `final` → blocca **il riferimento** a un oggetto o il valore di una variabile primitiva.
 *   - Non rende **immutabile l’oggetto stesso**.
 *
 * Nota: le classi immutabili e l’uso di `final` sono concetti diversi ma spesso
 * complementari. Le classi immutabili impediscono modifiche allo stato interno,
 * mentre `final` impedisce di cambiare il riferimento.
 *
 * 3. Rendere i campi di un oggetto immutabile
 *
 * - Per creare un oggetto realmente immutabile, i campi devono essere dichiarati `final`
 *   e inizializzati **all’interno del costruttore**.
 *
 *   class Person {
 *       private final String name; // campo immutabile
 *
 *       Person(String name) {
 *           this.name = name;       // inizializzazione nel costruttore
 *       }
 *
 *       public String getName() {
 *           return name;            // getter consentito
 *       }
 *
 *      // setter del nome non consentito
 *   }
 *
 * - Con questa struttura:
 *   - Il campo `name` è **immutabile** dopo la creazione dell’oggetto.
 *   - È possibile solo **leggerne il valore** tramite il getter, ma non modificarlo.
 *
 * 4. Passaggio dei parametri ai metodi (Pass-by-value)
 *
 * - In Java, i parametri vengono sempre passati **per valore**.
 * - Esempio con tipo primitivo:
 *
 *   class Clazz {
 *       void aMethod() {
 *           int x = 5;
 *           int y = increment(x);
 *           System.out.println(x + " : " + y); // stampa "5 : 6"
 *       }
 *
 *       int increment(int n) {
 *           return ++n;
 *       }
 *   }
 *
 * - `x` e `n` sono variabili diverse: il metodo riceve **una copia del valore**.
 * - Per i tipi primitivi, questo significa che il valore originale **non viene modificato**.
 * - Per gli oggetti, viene passata **una copia del riferimento**, quindi:
 *   - Si può modificare lo **stato interno** dell’oggetto.
 *   - Non si può cambiare il **riferimento originale**.
 *
 *   Esempio con oggetti:
 *
 *       void modify(Person p) {
 *           p.name = "Joe";   // modifica lo stato interno
 *           p = new Person(); // non cambia il riferimento originale
 *       }
 *
 *   - NOTA: in C si ottiene lo stesso comportamento passando come parametro attuale &variable
 *
 * 5. Esempio concreto con oggetti (pass-by-value)
 *
 *   class Clazz {
 *       void aMethod() {
 *           Person samuel = new Person("Samuel");
 *           Person sam = shortenName(samuel);
 *           System.out.println(samuel + " : " + sam);
 *       }
 *
 *       Person shortenName(Person p) {
 *           p.name = p.name.substring(0, 3); // modifica lo stato interno
 *           return new Person(p.name);        // restituisce un nuovo oggetto
 *       }
 *   }
 *
 * - `samuel` e `p` sono riferimenti diversi allo stesso oggetto originale.
 * - Modificare lo stato interno tramite `p` cambia l’oggetto originale (`samuel`).
 * - Creare e restituire un nuovo oggetto permette di avere una copia modificata senza cambiare il riferimento originale.
 *
 * 6. Riepilogo tra oggetti mutabili e immutabili
 *
 *                       Mutable Objects                       Immutable Objects
 * Modificabilità      Possono essere cambiati dopo la creazione  Rimangono costanti dopo la creazione
 * Sicurezza thread    Può richiedere sincronizzazione          Intrinsecamente sicuri
 * Predicibilità       Meno comprensibili                       Più facili da debug
 * Prestazioni         Generalmente più lente                   Generalmente più efficienti
 */

