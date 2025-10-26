public class Date {

    //enum Language { IT, US }
    //si possono dichiarare sia all'interno (classe innestata) o all'esterno della classe (standalone)

    private int day;
    private int month;
    private int year;
    static final String FORMAT_IT = "dd/mm/yyyy";
    static final String FORMAT_US = "mm/dd/yyyy";
    private Language lang;
    private static final String[] MONTHS_IT = { "gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre" };
    private static final String[] MONTHS_US = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    // 'format' è una costante, dichiarata con 'final' per impedirne la modifica dopo l'assegnazione.
    // È anche 'static' perché non ha senso che ogni oggetto Date abbia una propria copia del formato:
    // è un'informazione comune a tutte le istanze della classe.
    static final String format = "dd/mm/yyyy";

    // Costruttore della classe: inizializza i campi 'day', 'month' e 'year' con i valori passati.
    // La parola chiave 'this' serve per distinguere i campi dell'oggetto dalle variabili locali/parametri.
    public Date(int day, int month, int year) {
        this.day = day;     // 'this.day' si riferisce al campo dell'oggetto, serve per avere il puntatore di se stessi
        this.month = month;
        this.year = year;
        verify();
        lang = Language.IT;
    }

    public Date(int day, int month) {
        this(day, month, 2025); // default year
    }

    public Date(Date other) { // copy constructor
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
        verify();
        lang = other.lang;
    }

    void verify() {
        if (year < 0 || month < 1 || month > 12) // year and month check
            System.out.println("Illegal date!");
        else if (day < 1 || day > daysPerMonth(month)) // day check
            System.out.println("Illegal date!");
    }

    // Metodo d'istanza: restituisce la data nel formato "giorno/mese/anno"
    // Può accedere ai campi 'day', 'month' e 'year' perché è un metodo non statico.
    String print() {
        return day + "/" + month + "/" + year;
    }

    // Metodo statico: restituisce il numero di giorni per un dato mese.
    // Non essendo legato a un'istanza, non può accedere ai campi 'day', 'month' o 'year'.
    static int daysPerMonth(int month) {
        int days;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28; // Non considera gli anni bisestili in questo esempio.
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }

    // getters
    public int getDay() { return day; }
    public int getMonth() { return day; }
    public int getYear() { return day; }
    public Language getlang() { return lang; }

    // setters
    public void setDay(int day) {
        this.day = day;
        verify();
    }

    public void setMonth(int month) {
        this.month = month;
        verify();
    }

    public void setYear(int year) {
        this.year = year;
        verify();
    }

    public void setAmerican() { lang = Language.US; }
    public void setItalian() { lang = Language.IT; }

    // methods
    public String getMonthAsString() {
        if (lang == Language.IT) return MONTHS_IT[month - 1];
        else return MONTHS_US[month - 1];
    }

    public String printFormat() {
        if (lang == Language.IT) return FORMAT_IT;
        else return FORMAT_US;
    }

    public String toString() {
        if (lang == Language.IT) return day + "/" + month + "/" + year;
        else return month + "/" + day + "/" + year;
    }

    public String prettyPrint() {
        if (lang == Language.IT) return day + " " + MONTHS_IT[month - 1] + " " + year;
        else return MONTHS_US[month - 1] + " " + day + ", " + year;
    }

    public String toStringSimple() {
        return day + "/" + month + "/" + year;
    }
}

