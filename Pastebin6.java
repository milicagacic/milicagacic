package Pastebin6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ispisati proizvod prvih n celih brojeva [1, n].

        System.out.println("Unesite neki broj: ");
        int n = sc.nextInt();

        int proizvod = 1;

        for (int i = 1; i<=n;i++) {
            proizvod = proizvod * i;
        }
        System.out.println(proizvod);

    }
}
