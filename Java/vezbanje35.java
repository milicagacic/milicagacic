package vezbanje;

import java.util.Scanner;

public class vezbanje35 {
    public static void main(String[]args){
        //35. Ispisati sve brojeve od 0 do n.
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisati neki celi pozitivan broj:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
            System.out.println(i);

    }
}
