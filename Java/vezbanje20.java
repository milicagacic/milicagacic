package vezbanje;

import java.util.Scanner;

public class vezbanje20 {
    public static void main(String[] args){
        //20.Nacrtaj jelku koristeci skener
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neki celi broj:");
        int n=sc.nextInt();
        String razmak=" ";
        String zvezdica="*";
        for(int i=n; i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print(razmak);
            } System.out.println(zvezdica);
            zvezdica=zvezdica+"**";
        }
    }
}
