package vezbanje;

import java.util.Scanner;

public class Vezbanje27 {

    public static void main(String[] args) {
	//27.Napraviti program koji izracunava dupli faktorijel.
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisati neki broj:");
        int n=sc.nextInt();
        int fakt=1;
        for(int i=n;i>=1;i-=2)
            fakt*=i;
        System.out.println(fakt);

    }
}
