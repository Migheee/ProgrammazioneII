public class BirthDay {
    private static Date date = new Date(1,1,1970);
    private static BirthDay instance; // dichiaro la classe senza inizializzarla

    private BirthDay() {  } //NOTA: è da mettere, sennò il compilatore mette il costruttore di default che non è privato}
    
    public static BirthDay getInstance(){
        if(instance == null) instance = new BirthDay(); // qui possiamo chiamare il costruttore perche i metodi privati d
        return instance;                                // i una classe possono essere creati all' interno di una classe

    }

    public Date getDay(){
        return date;
    } 
}
