// Creazione di un oggetto di tipo Clazz
// Clazz myClazz = new Clazz();

/*
 * Cosa accade dietro le quinte:
 * 1. Viene allocata memoria nell'heap, sufficiente per contenere un oggetto di tipo Clazz.
 * 2. Viene creato un riferimento (che punta alla memoria appena allocata) e assegnato a myClazz.
 * 3. Tutti i campi dell’oggetto puntato da myClazz vengono inizializzati.
 * 4. Viene chiamato il costruttore della classe Clazz sull’oggetto puntato da myClazz.
 */

/*
 * ----------------------------
 * COSTRUTTORI DI CLASSE
 * ----------------------------
 * Un costruttore è un metodo speciale che:
 * - Ha lo stesso nome della classe.
 * - Non ha valore di ritorno (nemmeno "void").
 * - Viene eseguito solo al momento della creazione di un’istanza della classe.
 * - Serve per inizializzare i campi della classe in modo personalizzato.
 */

public class JavaClass {

    int day;
    int year;
    int month;

    // Costruttore principale: inizializza tutti i campi
    // Da un costruttore è possibile chiamare metodi di una classe
    public JavaClass(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    /*
     * È possibile chiamare un costruttore all'interno di un altro costruttore.
     * NOTA: i costruttori devono avere firme (parametri) diverse.
     */
    public JavaClass(int day, int month) {
        this(day, month, 2025); // Chiama il costruttore principale
    }

    // Costruttore di copia: crea un nuovo oggetto copiando i campi da un altro oggetto
    public JavaClass(JavaClass other) {
        this.day = other.day;
        this.year = other.year;
        this.month = other.month;
    }

    /*
     * Anche se non viene definito esplicitamente, Java fornisce automaticamente
     * un costruttore di default (senza parametri) che inizializza i campi
     * della classe con valori predefiniti.
     *
     * Tuttavia, se il programmatore definisce almeno un costruttore,
     * il costruttore di default NON viene più generato automaticamente.
     */
    
    // Metodo che restituisce la data formattata come stringa
    String print() {
        return day + "/" + month + "/" + year;
    }

    // Sovrascrive toString() per restituire una rappresentazione leggibile dell'oggetto
    @Override
    public String toString() {
        return print();
    }

    // Se un tipo di ritorno viene scritto, il metodo non è un costruttore

}

