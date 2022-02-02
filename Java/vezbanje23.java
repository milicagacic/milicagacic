package vezbanje;

import java.util.Scanner;

public class vezbanje23 {
    public static void main(String[] args){
        //23.Korisnik unosi novac kojim raspolaze sa racuna i cenu nekog artikla.
        // Na standardni izlaz ispisati koliko artikala korisnik moze da kupi.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite kolicinu novca kojim raspolazete:");
        double novac=sc.nextDouble();
        System.out.println("Unesite cenu izabranog proizvoda:");
        double proizvod=sc.nextDouble();
        int kolicina=0;
        while(novac>proizvod){
            novac=novac-proizvod;
            kolicina++;

        }
        System.out.println("Preostalo novca je "+novac+".");
        System.out.println("Mozete da kupite "+kolicina+" proizvoda.");
    }
}
