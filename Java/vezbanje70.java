package vezbanje;

import java.util.Scanner;

public class vezbanje70 {
    public static void main(String[]args){
        //70.Preko skenera uneti broj, u drugoj metodi izracunati faktorijel tog broja i odstampati ga.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi broj:");
        int n=sc.nextInt();
        faktorijel(n);
    }
    public static void faktorijel(int n){
        int faktorijel=1;
        for(int i=1;i<=n;i++){
            faktorijel=faktorijel*i;
        }
        System.out.println(faktorijel);
    }
}
