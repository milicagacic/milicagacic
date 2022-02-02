package vezbanje;

import java.util.Scanner;

public class vezbanje26 {
    public static void main(String[] args){
        //26. Napraviti program koji izracunava faktorijel i za uneti negativan ili pozitivan broj.
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti neki celi broj:");
        int n=sc.nextInt();
        int fakt=1;
        if(n<0){
            for(int i=n;i<=-1;i++)
                fakt=fakt*i;
        } else if(n>0){
            for(int i=1; i<=n;i++)
                fakt=fakt*i;
        }
        System.out.println("Faktorijel ovog broja je "+fakt);
    }
}
