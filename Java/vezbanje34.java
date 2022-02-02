package vezbanje;

import java.util.Scanner;

public class vezbanje34 {
    public static void main(String[]args){
        //34. Napisati da li je broj Pozitivan, Negativan, Neutralan
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi broj:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Uneti broj je neutralan broj.");
        }else if(n<0){
            System.out.println("Uneti broj je negativan broj.");
        }else{
            System.out.println("Uneti broj je pozitivan broj.");
        }
    }
}
