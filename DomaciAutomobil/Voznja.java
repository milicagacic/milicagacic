package DomaciAutomobil;

import Osoba.Osoba;

public class Voznja {

    public static void main(String[] args) {


        Osoba osoba1 = new Osoba("Milica", "Gacic", 1997, 163);
        Osoba osoba2 = new Osoba("Marko", "Mandic", 1995, 190);
        Osoba osoba3 = new Osoba("Milos", "Petrovic", 1959, 187);
        Osoba osoba4 = new Osoba("Andjela", "Jovicic", 1978, 170);

        //Ove 4 osobe su tu zato sto vozilo moze da ima 4 vlasnika,
        // Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
        // Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.



        Automobil auto1 = new Automobil("Tesla", "Model S", osoba1);
        Automobil auto2 = new Automobil("Tesla", "Model 3", osoba4);
        Automobil auto3 = new Automobil("Tesla", "Model X", osoba2);


        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);




    }
}
