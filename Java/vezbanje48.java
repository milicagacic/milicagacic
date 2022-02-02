package vezbanje;

import java.util.Scanner;

public class vezbanje48 {
    public static void main(String[]args){
        //48. Napisati program gde korisnik unosi brojeve preko skenera sve dok ne ponovi dva ista unosa
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite cele brojeve:");
        int[]brojevi=new int[sc.nextInt()];
        brojevi[0]=sc.nextInt();
        for(int i=1;i<brojevi.length;i++){
            brojevi[i]=sc.nextInt();
            if(brojevi[i]==brojevi[i-1]){
                System.out.println("Nazalost ponovili ste dva ista unosa!");
                break;

            }
        }

    }
}
