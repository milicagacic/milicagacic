package Pastebin7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        System.out.println("Unesite mesec rodjenja (brojem): ");
        int mesec = sc.nextInt();
        System.out.println("Unesite dan rodjenja (brojem): ");
        int dan = sc.nextInt();

        if (mesec == 1) {
            if (dan <= 20) {
                System.out.println("Ovaj datum rodjenja odgovara znaku jarca.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku vodolije.");

        } else if (mesec ==2) {
            if (dan <= 19) {
                System.out.println("Ovaj datum rodjenja odgovara znaku vodolije.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku ribe.");
        } else if (mesec ==3) {
            if (dan <= 20) {
                System.out.println("Ovaj datum rodjenja odgovara znaku ribe.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku ovna.");
        } else if (mesec ==4) {
            if (dan <= 21) {
                System.out.println("Ovaj datum rodjenja odgovara znaku ovna.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku bika.");
        } else if (mesec ==5) {
            if (dan <= 21) {
                System.out.println("Ovaj datum rodjenja odgovara znaku bika.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku blizanaca.");
        } else if (mesec ==6) {
            if (dan <= 22) {
                System.out.println("Ovaj datum rodjenja odgovara znaku blizanaca.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku raka.");
        } else if (mesec ==7) {
            if (dan <= 22) {
                System.out.println("Ovaj datum rodjenja odgovara znaku raka.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku lava.");
        } else if (mesec ==8) {
            if (dan <= 22) {
                System.out.println("Ovaj datum rodjenja odgovara znaku lava.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku device.");
        } else if (mesec ==9) {
            if (dan <= 22) {
                System.out.println("Ovaj datum rodjenja odgovara znaku device.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku vage.");
        } else if (mesec ==10) {
            if (dan <= 23) {
                System.out.println("Ovaj datum rodjenja odgovara znaku vage.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku skorpije.");
        } else if (mesec ==11) {
            if (dan <= 22) {
                System.out.println("Ovaj datum rodjenja odgovara znaku skorpije.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku strelca.");
        } else if (mesec ==12) {
            if (dan <= 21) {
                System.out.println("Ovaj datum rodjenja odgovara znaku strelca.");
            } else System.out.println("Ovaj datum rodjenja odgovara znaku jarca.");
        }

    }
}
