package vezbanje;

import java.util.Scanner;

public class vezbanje63 {
    public static void main(String[]args){
        //63. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Primer: [1, 2, 3, 4, 5] -> 1 3 5
        // Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti ceo pozitivan broj n:");
        int n=sc.nextInt();
        int[] niz=new int[n];
        System.out.println("Uneti cele brojeve:");
        for(int i=0;i<niz.length;i++){
            niz[i]=sc.nextInt();
        }
        System.out.println("Svaki drugi element niza je: ");
        svakiDrugi(niz);
    }
    public static void svakiDrugi(int[]x){
        for(int i=0;i<x.length;i=i+2){
            System.out.println(x[i]);
        }
    }
}
