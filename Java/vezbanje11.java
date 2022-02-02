package vezbanje;

import java.util.Scanner;

public class vezbanje11 {
    public static void main(String[]args){
        //11. Prikazati sumu parnih brojeva do n.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi broj:");
        int n=sc.nextInt();
        int suma=0;
        for(int i=1;i<=n;i++)
            if(i%2==0){
                suma=suma+i;
            }
        System.out.println("Suma parnih brojeva koji cine uneti broj je "+suma+".");
    }
}
