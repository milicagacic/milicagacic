package Pastebin8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        // "Dobrodosao u {x}. razred, {ime} {prezime}",
        // pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
        // A ako korisnik nije djak ispisati jednu odgovarajucu
        //    poruku od:
        // "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

        System.out.println("Unesite vase ime:");
        String ime = sc.nextLine();
        System.out.println("Unesite vase prezime:");
        String prezime = sc.nextLine();
        System.out.println("Unesite godinu rodjenja:");
        int godina = sc.nextInt();

        if (godina > 2014) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        } else if (godina<2003) {
            System.out.println(ime + " " + prezime + " zavrsio skolu.");
        } else if (godina == 2003) {
            System.out.println("Dobrodosao u 12 razred, "+ ime + " " + prezime );
        } else if (godina == 2004) {
            System.out.println("Dobrodosao u 11 razred, "+ ime + " " + prezime );
        } else if (godina == 2005) {
            System.out.println("Dobrodosao u 10 razred, "+ ime + " " + prezime);
        } else if (godina == 2006) {
            System.out.println("Dobrodosao u 9 razred, "+ ime + " " + prezime );
        } else if (godina == 2007) {
            System.out.println("Dobrodosao u 8 razred, "+ ime + " " + prezime );
        } else if (godina == 2008) {
            System.out.println("Dobrodosao u 7 razred, "+ ime + " " + prezime );
        } else if (godina == 2009) {
            System.out.println("Dobrodosao u 6 razred, "+ ime + " " + prezime );
        } else if (godina == 2010) {
            System.out.println("Dobrodosao u 5 razred, "+ ime + " " + prezime );
        }else if (godina == 2011) {
            System.out.println("Dobrodosao u 4 razred, "+ ime + " " + prezime );
        } else if (godina == 2012) {
            System.out.println("Dobrodosao u 3 razred, "+ ime + " " + prezime);
        } else if (godina == 2013) {
            System.out.println("Dobrodosao u 2 razred, "+ ime + " " + prezime );
        } else if (godina == 2014) {
            System.out.println("Dobrodosao u 1 razred, "+ ime + " " + prezime );
        }
    }
}
