package vezbanje;

import java.util.Scanner;

public class vezbanje36 {
    public static void main(String[]args){
        //36. Ispis od negativnog n do 0.
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisati negativan ceo broj:");
        int n=sc.nextInt();
        while(n>=0){
            System.out.println("Broj mora biti negativan!");
            n=sc.nextInt();
        }
        for(int i=n;i<=0;i++)
            System.out.println(i);
    }
}
