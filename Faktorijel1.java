package vezbanje;

import java.util.Scanner;

public class vezbanje21 {
    public static void main(String[]args){
        //21.Napraviti program koji ce za uneti pozitivni broj ispisati faktorijel tog broja
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj:");
        int n=sc.nextInt();
        int fakt=1;
        for(int i=1;i<=n;i++)
            fakt=fakt*i;
        System.out.println("Faktorijel unetog broja je "+fakt+".");

    }
}
