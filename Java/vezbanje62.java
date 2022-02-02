package vezbanje;

import java.util.Scanner;

public class vezbanje62 {
    public static void main(String[]args){
        //62.Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite ceo pozitivan broj n:");
        int n=sc.nextInt();
        int[]niz=new int[n];
        int suma=0;
        for(int i=0;i<niz.length;i++){
            System.out.println("Unesite ceo broj:");
            niz[i]=sc.nextInt();
            suma=suma+niz[i];
        }
        System.out.println("Suma ovih brojeva je "+suma+".");
    }
}
