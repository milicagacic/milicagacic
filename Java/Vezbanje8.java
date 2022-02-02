package vezbanje;

import java.util.Scanner;

public class Vezbanje8 {
    public static void main(String[]args){
        //8. Napisati program koji obradjuje unete godine korisnika i izbacuje odgovor da li mogu da dobiju vozacku dozvolu.
        // Koristiti While Petlju.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite vase godine.");
        int godine=sc.nextInt();
        while(godine<100){
            if(godine<18){
                System.out.println("Imate "+godine+" godina,maloletni ste,nema vozacke dozvole za Vas.");
            } else if(godine>=18 && godine<=65){
                System.out.println("Imate "+godine+" godina,mozete dobiti vozacku dozvolu.");
            } else {
                System.out.println("Imate "+godine+" godina,ne mozete vise imati vozacku.");
            }
            godine++;
        }
    }
}
