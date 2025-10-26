import java.util.Scanner; // Import necessario per utilizzare la classe Scanner (input da tastiera)

public class MainDate {

    // static: Un metodo statico è legato alla **classe** e non a una specifica **istanza**.
    // Viene utilizzato quando si deve eseguire un'operazione che **non dipende dai dati specifici di un oggetto**.
    // In altre parole, i metodi e i campi statici sono condivisi da tutte le istanze della classe.

    // I campi **non statici** (d'istanza), invece, sono specifici per ogni oggetto creato da quella classe.

    //   Attenzione:
    // - Un metodo **statico** può accedere **solo** a campi e metodi statici.
    // - Non può accedere direttamente a campi o metodi non statici (d'istanza), perché non ha riferimento a un oggetto.
    //
    // - I metodi **non statici**, invece, possono accedere sia a campi statici che non statici.

    // args: lista di stringhe che contengono gli argomenti che possono essere passati a riga di comando
    public static void main(String[] args) {

        Date d1 = new Date(7, 1, 2025);
        Date d2 = new Date(20, 2);
        Date d3 = new Date(d2);

        d2.setAmerican(); // set format to US

        System.out.println(d1.toString() + " " + d1.printFormat());
        System.out.println(d2.toString() + " " + d2.printFormat());
        System.out.println(d3.toString() + " " + d3.printFormat());

        System.out.println(d1.prettyPrint());
        System.out.println(d2.prettyPrint());
        System.out.println(d3.prettyPrint());

        //
        Date[] dates = { d1, d2, d3, new Date(14, 2, 2024) };

        // stampa le date in ordine inverso
        for (int i = dates.length - 1; i >= 0; i--)
            System.out.println(dates[i].toString() + ": " + dates[i].getMonthAsString());

        // stampa le date in ordine normale
        for (Date date : dates)
            System.out.println(date.toString() + ": " + date.getMonthAsString());

        // Esempi aggiuntivi di utilizzo dei metodi
        Date today = new Date(14, 10, 2025);       // Creazione di un'istanza della classe Date
        System.out.println(today.print());         // Chiamata a un metodo d'istanza
        System.out.println(Date.daysPerMonth(5));  // Chiamata a un metodo statico della classe Date
        // Anche se non lo abbiamo definito, esso già esiste e restituisce:
        // objType@addr
        System.out.println(today.toString());
        String str = new String("ciao");
        // Alcuni metodi possono essere **sovrascritti** (overriding), definendo quindi un comportamento diverso rispetto a quello di default
        System.out.println(str);

        // Acquisizione di una data da tastiera
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

