package vezbanje;

import java.util.Scanner;

    public class duplaPetlja {
        //1.Dupla petlja:
        //U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
        //(Primer ispisa:
        //Week: 1
        //Day: 1
        //Day: 2
        //Day: 3 //sve do Day: 7
        //Week: 2
        //Day: 1
        //Day: 2
        //Day: 3.......
        //Week: 3
        //Day: 1
        //Day: 2
        //Day: 3......)
        public static void main(String[] args) {
            System.out.println("Ispis dana u nedelji za 3 nedelje");

            for (int i = 1; i <= 3; i++) {
                System.out.println("Week: " + i);
                for (int x = 1; x <= 7; x++) {
                    System.out.println("Day: " + x);
                }
            }
        }
    }

