import java.util.Scanner;
//Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
// tako sto se ivice prostorije ucitavaju preko konzole.
// (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).

public class Sintaksa1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Uneti duzinu jednog zida:");
        float a = sc.nextFloat();

        System.out.println("Uneti duzinu drugog zida:");
        float b = sc.nextFloat();


        System.out.println("Uneti visinu prostorije:");
        float c = sc.nextFloat();

        System.out.println("Povrsina zidova sobe je " + 2*(a*c+b*c));
    }
}
