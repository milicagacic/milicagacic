package Pastebin9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Kreiramo svoj profil u ovom zadatku
        Svako za sebe kroz skener treba da unese ime, prezime, godine
        Koristeci uneti pol,odgovoriti na pitanje da li ste rodjeni iz Srbije
        Koristeci double uneti svoj prosek ocena iz srednje skole
        Koristeci if, program treba da vrati podatke na osnovu proseka da li ste bili odlicni, vrlo dobri, dobri, dovoljni ili nedovoljni
        Na kraju odstampati i odgovor da li je godina vaseg rodjenja bila prestupna
                */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vase ime i prezime,broj godina.");
        String ime = sc.next();
        String prezime = sc.next();
        int godine = sc.nextInt();
        System.out.println("Izaberite Vas pol z/m: ");
        String pol=sc.next();
        System.out.println("Da li ste rodjeni u Srbiji?");
        String rodjeni=sc.next();

        System.out.println(ime +" "+ prezime+"," + godine+" godina," + pol +" pol,"+ rodjeni+ " rodjen/a u Srbiji.");

        System.out.println("Napisite Vas prosek u skoli.");
        double prosek = sc.nextDouble();

        if (prosek < 0) {
            System.out.println("Prosek ne sme biti negativan");
        } else if (prosek >= 0 && prosek < 1.5) {
            System.out.println("Bili ste nedovoljan djak");
        } else if (prosek >= 1.5 && prosek < 2.5) {
            System.out.println("Bili ste dovoljan djak");
        } else if (prosek >= 2.5 && prosek < 3.5) {
            System.out.println("Bili ste dobar djak");
        } else if (prosek >= 3.5 && prosek < 4.5) {
            System.out.println("Bili ste vrlo dobar djak");
        } else if (prosek >= 4.5 && prosek <= 5) {
            System.out.println("Bili ste odlican djak");
        } else if (prosek > 5) {
            System.out.println("Prosek moze biti do 5.00");
        }
        int godiste = 2021 - godine;
        if (godiste%4==0) {
            System.out.println("Godina kada ste rodjeni je prestupna");
        } else {
            System.out.println("Godina kada ste rodjeni NIJE prestupna");
        }

    }
}