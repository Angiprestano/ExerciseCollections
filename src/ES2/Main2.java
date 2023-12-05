package ES2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
    }

    private static void generaListaCasuale(List<Integer> listaCasuale, int numberChoose) {
        Random random = new Random();

        for (int i = 0; i < numberChoose; i++) {
            listaCasuale.add(random.nextInt(101));
        }
        System.out.println("Lista casuale:" + listaCasuale);

    }
}
