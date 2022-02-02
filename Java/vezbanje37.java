package vezbanje;

import java.util.Scanner;

public class vezbanje37 {
    public static void main(String[]args){
        //37. Napraviti ispis Od -14 do 2n
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisati neki pozitivan celi broj:");
        int n=sc.nextInt();
        for(int i=-14;i<=n*2;i++)
            System.out.println(i);
    }
}
