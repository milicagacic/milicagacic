package vezbanje;

import java.util.Scanner;

public class vezbanje32 {

    public static void main(String[] args) {
        // 32. Sve dok korsnik ne unese pozitivan broj, traziti da korisnik ponovo unosi broj.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite celi pozitivan broj:");
        int n=sc.nextInt();
        while(n<0){
            System.out.println("Molim vas unesite ceo pozityivan broj:");
            n=sc.nextInt();
        }
        System.out.println("Bravo uneli ste pozitivan broj.");

    }
}
