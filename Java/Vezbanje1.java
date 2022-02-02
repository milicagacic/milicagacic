package vezbanje;

import java.util.Scanner;

public class Vezbanje1 {
    public static void main(String[]args){
        //1. Ako je a vece od b ispisati rezultat a-b. Ako je b vece od a ispisati rezultat b-a. Ako su jednaki ispisati string "Oni su jednaki".
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti 2 cela broja: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            int rezultat=a-b;
            System.out.println("Rezultat ova dva broja je "+rezultat+".");
        } else if(a<b){
            int rezultat=b-a;
            System.out.println("Rezultat ova dva broja je "+rezultat+".");
        } else {
            System.out.println("Oni su jednaki.");
        }
    }
}
