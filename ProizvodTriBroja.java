package domaci.domaci1412;

import java.util.Scanner;

//31. Napisati funkciju koja racuna proizvod 3 broja.

public class ProizvodTriBroja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi tri broja: ");
        int prviBroj = sc.nextInt();
        int drugiBroj = sc.nextInt();
        int treciBroj = sc.nextInt();

        System.out.print("Proizvod tri uneta broja je: ");
        System.out.println(proizvodTriBroja(prviBroj, drugiBroj, treciBroj));
    }
    public static int proizvodTriBroja(int x, int y, int z){
        int proizvod = x * y * z;
        return proizvod;
    }
}
