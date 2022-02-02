package vezbanje;

import java.util.Scanner;

public class vezbanje38 {
    public static void main(String[]args){
        //38. Napisati proizvod brojeva od 1 do n
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti neki ceo broj:");
        int n=sc.nextInt();
        int proizvod=1;
        for(int i=1;i<=n;i++)
            proizvod*=i;
        System.out.println(proizvod);

    }
}
