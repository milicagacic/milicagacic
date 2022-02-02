package vezbanje82;

import java.util.Scanner;

public class KrugTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite poluprecnik kruga: ");
        double poluprecnik = sc.nextDouble();

        Krug kr1 = new Krug(poluprecnik);

        System.out.println("Poluprecnik kruga je: " + kr1.getPoluprecnik());
        System.out.println("Obim kruga je: " + kr1.obim());
        System.out.println("Povrsina kruga je: " + kr1.povrsina());

        System.out.println("Unesite novi poluprecnik kruga: ");
        double noviPoluprecnik = sc.nextDouble();
        kr1.setPoluprecnik(noviPoluprecnik);

        System.out.println("Poluprecnik kruga je: " + kr1.getPoluprecnik());
        System.out.println("Obim kruga je: " + kr1.obim());
        System.out.println("Povrsina kruga je: " + kr1.povrsina());
    }
}
