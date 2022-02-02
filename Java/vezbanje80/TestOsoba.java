package vezbanje;

import java.util.Scanner;

public class TestOsoba {

    public static void main(String[] args) {
	// 80.Napisati program koji od korisnika zahteva da unese imena,prezimena,godine rodjenja i visine za 2 osobe,zatim kreirati te 2 osobe i ispisati ih.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite ime i prezime prve osobe,njeno godiste i visinu: ");
        String imePrveOsobe=sc.next(),prezimePrveOsobe=sc.next();
        int godistePrveOsobe=sc.nextInt();
        double visinaPrveOsobe=sc.nextDouble();
        Osoba prva=new Osoba(imePrveOsobe,prezimePrveOsobe,godistePrveOsobe,visinaPrveOsobe);
        System.out.println("Ime prve osobe je "+prva.ime);
        System.out.println("Prezime prve osobe je "+prva.prezime);
        System.out.println("Godiste prve osobe je "+prva.godiste);
        System.out.println("Visina prve osobe je "+prva.visina);
        System.out.println("Unesite ime i prezime druge osobe,njeno godiste i visinu: ");
        String imeDrugeOsobe=sc.next(),prezimeDrugeOsobe=sc.next();
        int godisteDrugeOsobe=sc.nextInt();
        double visinaDrugeOsobe=sc.nextDouble();
        Osoba druga=new Osoba(imeDrugeOsobe,prezimeDrugeOsobe,godisteDrugeOsobe,visinaDrugeOsobe);
        System.out.println("Ime druge osobe je "+druga.ime);
        System.out.println("Prezime druge osobe je "+druga.prezime);
        System.out.println("Godiste druge osobe je "+druga.godiste);
        System.out.println("Visina druge osobe je "+druga.visina);
        
    }
}
