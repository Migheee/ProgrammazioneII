public class Date {
    int day;
    int month;
    int year;

    // La variabile 'format' è una costante: il modificatore 'final' impedisce che venga modificata dopo l'inizializzazione.
    // Inoltre, è 'static' perché è condivisa da tutte le istanze della classe: non ha senso avere un formato diverso per ogni oggetto Date.
    static final String format = "dd/mm/yyyy";

    // Costruttore: inizializza i campi day, month e year con i valori forniti
    public Date(int aDay, int aMonth, int aYear) {
        day = aDay;
        month = aMonth;
        year = aYear;
    }

    // Metodo d'istanza: stampa la data in formato semplice (giorno/mese/anno)
    String print() {
        return day + "/" + month + "/" + year;
    }

    // Metodo statico: restituisce il numero di giorni del mese specificato
    // Poiché non ha bisogno di accedere ai dati di un oggetto specifico, è dichiarato static
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
                days = 28; // Anno bisestile non gestito in questo esempio
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }
}
