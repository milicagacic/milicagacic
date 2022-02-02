package vezbanje;

import java.util.Scanner;

public class vezbanje74 {
    public static void main(String[]args){
        //74.Napisite program koji, koristeci WHILE petlju, racuna zbir unetih brojeva (svi brojevi su tipa int), sve dok korisnik ne unese 0
        //Primer ispisa resenja:
        //Molim vas unesite 1. broj
        //4
        //Trenutni zbir je 4
        //Molim vas unesite 2. broj
        //5
        //Trenutni zbir je 9
        //Molim vas unesite 3. broj
        //0
        //Uneli ste 0 Kraj programa
        Scanner sc=new Scanner(System.in);
        int zbir=0;
        int i=0;
        System.out.println("Unesite neki celi broj:");
        int n=sc.nextInt();
        while(n>0){
            zbir=zbir+n;
            System.out.println("Trenutni zbir je: "+zbir);
            System.out.println("Unesite neki celi broj:");
            n=sc.nextInt();
            i++;
        }
    }
}
