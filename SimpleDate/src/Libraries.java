// Le librerie in Java, non sono altro che classi.
// esempi sono: java.lang, java.io (supporto I/O), java.awt (Supporto GUI), java.util (Funzioni di Utilità) 
// Per importare una libreria, usare import
// Eg: import java.util.* (con * si importano tutte le classi); or import java.util.Scanner;
// La libreria java.lang è importata di default dal compilatore
// Le librerie devono essere visibili e disponibili al classpath. 
// In generale java cerca le librerie nel fs, ad esempio nella directory corrente o nei path indicati nel classpath


import java.util.Scanner; //standard library. 

public class Libraries{

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in); //System.in è un oggetto della libreria standard che si aggancia a STDIN
		String userName = myScanner.nextLine();

		System.out.println("The username is: " + userName);
		myScanner.close();
	}
}

