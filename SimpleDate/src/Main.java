import java.util.Scanner;

public class Main {
    // static: Un metodo statico è legato alla **classe** e non a una specifica **istanza**.
    // Viene utilizzato quando si deve eseguire un'operazione che **non dipende dai dati specifici di un oggetto**.
    // In altre parole, i metodi e i campi statici sono condivisi da tutte le istanze della classe.

    // I campi **non statici** (d'istanza), invece, sono specifici per ogni oggetto creato da quella classe.

    // ⚠️ Attenzione:
    // - Un metodo **statico** può accedere **solo** a campi e metodi statici.
    // - Non può accedere direttamente a campi o metodi non statici (d'istanza), perché non ha riferimento a un oggetto.
    //
    // - I metodi **non statici**, invece, possono accedere sia a campi statici che non statici.

    // args: lista di stringhe che contengono gli argomenti che possono essere passati a riga di comando
    public static void main(String[] args) {
        Date today = new Date(14, 10, 2025);       // Creazione di un'istanza della classe Date
        System.out.println(today.print());         // Chiamata a un metodo d'istanza
        System.out.println(Date.daysPerMonth(5));  // Chiamata a un metodo statico della classe Date
        // Anche se non lo abbiamo definito, esso già esiste e restituisce:
        // objType@addr
        System.out.println(today.toString());
        String str = new String("ciao");
        // Alcuni metodi possono essere **sovrascritti** (overriding), definendo quindi un comportamento diverso rispetto a quello di default
        System.out.println(str);

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Day: ");
	int day = sc.nextInt();

	System.out.println("Enter a Month: ");
        int month = sc.nextInt();

	System.out.println("Enter a Year: ");
        int year = sc.nextInt();

	Date date = new Date(day, month, year);
	System.out.println(date.toString());

	sc.close();
    }
}

