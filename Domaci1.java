package vezbanje;

import java.util.Scanner;

public class vezbanje54 {
    public static void main(String[]args){
        //54.Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double). [Ovaj zadatak je dosta komplikovan!]
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti ceo pozitavn broj:");
        int n=sc.nextInt();
        double suma=0;
        int brUnosa=0;
        while(brUnosa<n){
            System.out.println("Uneti ceo realan broj:");
            double broj=sc.nextDouble();
            suma=suma+broj;
            brUnosa++;
        }
        System.out.println("Suma ovih brojeva je " +suma);
    }
}
