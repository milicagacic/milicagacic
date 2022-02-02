package vezbanje81;

import java.util.Scanner;
//81.Napraviti program koji od korisnika trazi da unese duzinu i sirinu pravougaonika i koji u posebnoj klasi izracunava obim i povrsinu tog pravougaonika.
// Raditi sa geterima i seterima!
public class PravougaonikTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu pravougaonika: ");
        double duzina = sc.nextDouble();
        System.out.println("Unesite sirinu pravougaonika: ");
        double sirina = sc.nextDouble();

        Pravougaonik prav = new Pravougaonik(duzina, sirina);

        System.out.println("Duzina pravougaonika je: " + prav.getDuzina());
        System.out.println("Sirina pravougaonika je: " + prav.getSirina());
        System.out.println("Obim pravougaonika je: " + prav.obim());
        System.out.println("Povrsina pravougaonika je: " + prav.povrsina());
    }

}
