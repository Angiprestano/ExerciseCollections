import ES1.Months;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Months Dicembre = new Months(31 , "Dicembre");
        Months Gennaio = new Months(31, "Gennaio");
        Months Febbraio = new Months(29, "Febbraio");


       Set<Months> monthsSet = new HashSet<>();
       monthsSet.add(Dicembre);
       monthsSet.add(Gennaio);
       monthsSet.add(Febbraio);
       System.out.println("Mese:" + " " + Dicembre);
       System.out.println("Parole duplicate:" + " " + Dicembre.getWords() + " " + Dicembre.getWords() + " " + Dicembre.getWords());
       System.out.println("Numero di parole: " + monthsSet.size());
       System.out.println("Elenco delle parole:" + " " + Dicembre.getWords() + " " + Gennaio.getWords() + " " + Febbraio.getWords());
    }
}