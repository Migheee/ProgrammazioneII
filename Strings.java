// In Java, una stringa è un'istanza della classe String.
//
// Creazione di stringhe
// ------------------------
// 1. Stringa vuota:
//    String str = new String();
//
// 2. Stringa con contenuto:
//    String str = new String("a string");
//
// 3. Notazione letterale (più comune e consigliata):
//    String str = "";
//    String str = "myString";
//
//   Le stringhe definite con le virgolette ("...") sono costanti internate:
//       cioè salvate in un'area speciale della memoria (String Pool).
//       Se due stringhe hanno lo stesso valore letterale, puntano allo stesso oggetto.
//
//   Le stringhe in Java NON sono array di caratteri.
//     Tuttavia, puoi accedere ai singoli caratteri con charAt().
//
//   Le stringhe sono IMMUTABILI:
//     - Ogni volta che le modifichi (es. concatenazione), si crea un nuovo oggetto.
//     - Per modifiche intensive, è meglio usare StringBuilder o StringBuffer.
//
//   Il confronto tra stringhe:
//     - == confronta i riferimenti (puntatori)
//     - equals() confronta il contenuto
//
// Esempio completo:

public class Strings {
    public static void main(String[] args) {
        String empty = new String();           // stringa vuota
        String str = "str";                    // letterale stringa (usa il String Pool)

        System.out.println("len(empty): " + empty.length());
        System.out.println("len(\"str\"): " + str.length());
        System.out.println("Secondo carattere di str: " + str.charAt(1));

        String same = new String("str");       // nuovo oggetto (non nel pool)
        System.out.println("str == same: " + (str == same)); // false (riferimenti diversi)

        String verySame = str;                 // punta allo stesso oggetto
        System.out.println("str == verySame: " + (str == verySame)); // true

        // equals() confronta il contenuto
        System.out.println("str.equals(same): " + str.equals(same)); // true

        String copy = new String(same);        // altra copia distinta in memoria
        System.out.println("copy: " + copy);

        // Concatenazione di stringhe
        String concatenated = "stringa" + same;
        System.out.println("Concatenata: " + concatenated);

        // Accesso a un singolo carattere (da 0 a length - 1)
        System.out.println("Carattere alla posizione 1: " + str.charAt(1));

	// Attenzione al seguente caso
	String s = "hello";
	String t = "hello";
	System.out.println("s == t" + (s == t)); // da true
	// Le stringhe letterali (cioè scritte tra doppi apici "..." senza usare l'operatore new) vengono archiviate nel “String Pool”,
	// una zona speciale della memoria dove Java conserva un’unica copia di ogni stringa letterale.

	// Ulteriori metodi: .subString(int start, int end) e .replace(char old, char new)
	String parola = "Programmazione";

        // Estrae i caratteri da indice 0 (incluso) a 7 (escluso)
        String parte1 = parola.substring(0, 7); // "Program"

        // Estrae da indice 7 fino alla fine della stringa
        String parte2 = parola.substring(7); // "mazione"

        System.out.println("substring(0, 7): " + parte1);
        System.out.println("substring(7): " + parte2);

	String frutto = "banana";

        // Sostituisce tutti i caratteri 'a' con 'o'
        String modificata = frutto.replace('a', 'o');  //bonono

	// Per creare stringhe mutabili esiste StringBuilder, classe che crea un oggetto che contiene una stringa mutabile
	String strEx= "abc";
	strEx = strEx + "def"; //non concatenazione, ma nuovo oggetto

	StringBuilder sb = new StringBuilder("abc");
	sb.append("def"); //sb viene modificato, stesso puntatore ma oggetto diverso
	System.out.println(sb.toString());
    }
}



