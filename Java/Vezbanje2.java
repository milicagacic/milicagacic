package vezbanje;

import java.util.Scanner;

public class Vezbanje2 {
    public static void main(String[]args){
        //2. Ako je broj deljiv sa 3 ispisati fizz,ako je deljiv sa 5 ispisati buzz,a ako je deljiv i sa 3 i sa 5 ispisati fizzbuzz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi broj:");
        int br=sc.nextInt();
        if(br%3==0 && br%5==0){
            System.out.println("fizzbuzz");
        }else if(br%3==0){
            System.out.println("fizz");
        } else if(br%5==0){
            System.out.println("buzz");
        }

    }
}
