package vezbanje;

import java.util.Scanner;

public class vezbanje53 {
    public static void main(String[]args) {
        //53. Napraviti digitron koji prima double i ispisuje resenje odgovarajuce operacije.
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisati neki realan broj i upisati jos jedan realni broj:");
        double z = sc.nextDouble();
        double x = sc.nextDouble();
        System.out.println("Rezultat sabiranja je " + (z + x));
        System.out.println("Rezultat oduzimanja je " + (z - x));
        System.out.println("Rezultat mnozenja je " + (z * x));
        if (z != 0 && x != 0) {
            System.out.println("Rezultat deljenja je " + (z / x));
            System.out.println("Ostatak deljenja prvog broja drugim je " + (z % x));
        } else {
            System.out.println("Ne mozemo deliti nulom.");
        }
    }



}
