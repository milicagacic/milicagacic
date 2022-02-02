package vezbanje;

import java.util.Scanner;

public class Vezbanje6 {
    public static void main(String[] args) {
        //6. Napisati program koji izbacuje koji je dan u nedelji kad korisnik unese odgovarajuci broj.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite redni broj vaseg dana u nedelji:");
        int brojDana = sc.nextInt();
        switch (brojDana) {
            case (1):
                System.out.println("Vas dan je ponedeljak.");
                break;
            case (2):
                System.out.println("Vas dan je utorak.");
                break;
            case (3):
                System.out.println("Vas dan je sreda.");
                break;
            case (4):
                System.out.println("Vas dan je cetvrtak.");
                break;
            case (5):
                System.out.println("Vas dan je petak.");
                break;
            case (6):
                System.out.println("Vas dan je subota.");
                break;
            case (7):
                System.out.println("Vas dan je nedelja.");
                break;
            default:
                System.out.println("Morate uneti broj od 1 do 7.");
        }
    }
}
