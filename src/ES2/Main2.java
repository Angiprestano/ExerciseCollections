package ES2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero causale da 1 a 100");
        int numberChoose = scanner.nextInt();

        List<Integer> listaCasuale = new ArrayList<>();
        generaListaCasuale(listaCasuale, numberChoose);
        
        List<Integer> listaNumeriInvertiti = new ArrayList<>(listaCasuale);
        crealistaNumeriInvertiti(listaNumeriInvertiti);
    }

    private static void crealistaNumeriInvertiti(List<Integer> listaNumeriInvertiti) {
        Collections.reverse(listaNumeriInvertiti);
        listaNumeriInvertiti.addAll(new ArrayList<>(listaNumeriInvertiti));
        System.out.println("Lista numeri invertiti: " + listaNumeriInvertiti);
    }

    private static void generaListaCasuale(List<Integer> listaCasuale, int numberChoose) {
        Random random = new Random();

        for (int i = 0; i < numberChoose; i++) {
            listaCasuale.add(random.nextInt(101));
        }
        System.out.println("Lista casuale:" + listaCasuale);
        numberP (listaCasuale);
        Collections.sort(listaCasuale);
        System.out.println("Lista ordinata" + listaCasuale);

    }

    private static void numberP(List<Integer> listaCasuale) {
        System.out.println("Ecco i numeri pari:");
        for (int i = 0; i < listaCasuale.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(listaCasuale.get(i));
               }
            }
        }
    }
