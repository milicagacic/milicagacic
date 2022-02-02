package vezbanje;

import java.util.Scanner;

public class Vezbanje5 {
    public static void main(String[]args){
        //5.Uneti neki broj i ispisati njegovu apsolutnu vrednost.
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti neki celi broj:");
        int a=sc.nextInt();
        if(a<0){
            a=a*(-1);
        }
        System.out.println("Apsolutna vrednost ovog broja je "+a+".");
    }
}
