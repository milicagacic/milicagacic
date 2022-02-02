package Pastebin2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0,
        "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite neki ceo broj");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Pozitivan.");
        } else if (n < 0) {
            System.out.println("Negativan.");
        } else if (n == 0) {
            System.out.println("Neutralan.");
        }

    }
}
