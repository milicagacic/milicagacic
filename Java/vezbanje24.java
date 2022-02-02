package vezbanje;

import java.util.Scanner;

public class vezbanje24 {
    public static void main(String[]args) {
        //24.Za unet negativan ceo broj n,ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite negativan ceo broj:");
        int n=sc.nextInt();
        while(n>0){
            System.out.println("Trebao nam je negativan broj,unesite broj ponovo:");
            n=sc.nextInt();
        }
        for(int i=n;i<=0;i++)
            System.out.println(i);
    }
}
