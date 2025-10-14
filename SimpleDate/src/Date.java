public class Date {
    int day;
    int month;
    int year;

    // 'format' è una costante, dichiarata con 'final' per impedirne la modifica dopo l'assegnazione.
    // È anche 'static' perché non ha senso che ogni oggetto Date abbia una propria copia del formato:
    // è un'informazione comune a tutte le istanze della classe.
    static final String format = "dd/mm/yyyy";

    // Costruttore della classe: inizializza i campi 'day', 'month' e 'year' con i valori passati.
    // La parola chiave 'this' serve per distinguere i campi dell'oggetto dalle variabili locali/parametri.
    public Date(int day, int month, int year) {
        this.day = day;     // 'this.day' si riferisce al campo dell'oggetto
        this.month = month;
        this.year = year;
    }

    // Metodo d'istanza: restituisce la data nel formato "giorno/mese/anno"
    // Può accedere ai campi 'day', 'month' e 'year' perché è un metodo non statico.
    String print() {
        return day + "/" + month + "/" + year;
    }

    // Metodo statico: restituisce il numero di giorni per un dato mese.
    // Non essendo legato a un'istanza, non può accedere ai campi 'day', 'month' o 'year'.
    static int daysPerMonth(int month) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // Non considera gli anni bisestili in questo esempio.
            default:
                return 31;
        }
    }
}
