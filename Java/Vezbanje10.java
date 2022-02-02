package vezbanje;

import java.util.Scanner;

public class Vezbanje10 {
    public static void main(String[]args){
       //10.Prikazati sumu brojeva do n.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi broj:");
        int n=sc.nextInt();
        int suma=0;
        for(int i=1;i<=n;i++)
            suma=suma+i;
        System.out.println("Suma svih brojeva koji cine uneti broj je "+suma+".");
    }
}
