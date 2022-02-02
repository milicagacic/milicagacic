package vezbanje;

import java.util.Scanner;

public class vezbanje61 {
    public static void main(String[]args) {
        //61.Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
        //Primer: [4, 2, 3, 5] -> 5 3 2 4
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi pozitivan broj n:");
        int n=sc.nextInt();
        System.out.println("Unesite neke cele brojeve:");
        int[]niz=new int[n];
        for(int i=0;i<niz.length;i++){
            niz[i]=sc.nextInt();
        }
        for(int i=niz.length-1;i>=0;i--){
            System.out.println(niz[i]);
        }
    }
}
