package vezbanje;

import java.util.Scanner;

public class vezbanje33 {
    public static void main(String[]args){
        //33. Napisati da li je broj paran ili neparan.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi broj:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Nula je neutralan broj.");
        }else if(n%2==0){
            System.out.println("Vas broj je paran broj.");
        }else{
            System.out.println("Vas broj je neparan.");
        }
    }
}
