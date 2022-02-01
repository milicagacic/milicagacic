package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Grananja2: Sintaksa1 uraditi ponovo,
        // koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina
        // (kakvi celi brojevi moraju da budu visina, sirina i duzina?)
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite vrednost duzine zida izracunate u centimetrima: ");
        double a2 = sc.nextDouble();
        if (a2 >= 100) {
            System.out.println("Unesite vrednost duzine drugog zida izracunate u centimetrima ");
            double b2 = sc.nextDouble();
            if (b2 >= 100) {
                System.out.println("Unesite vrednost visine zida izracunate u centimetrima: ");
                double c2 = sc.nextDouble();
                if (c2 >= 100) {
                    double povrsina2 = 2 * (a2 * c2 + b2 * c2 + a2 * b2);
                    System.out.println("Povrsina zidova sobe je: " + povrsina2 + "cm.");
                } else {
                    System.out.println("Uneta vrednost je premala za duzinu zida!");
                }
            } else {
                System.out.println("Uneta vrednost je premala za duzinu zida!");
            }

        } else {
            System.out.println("Uneta vrednost je premala za duzinu zida!");
        }
    }
}
