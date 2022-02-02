package Pastebin9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi ceo broj.");

        int i = sc.nextInt();

        if (i > 0) {
            System.out.println("Broj je pozitivan");
        } else if (i == 0) {
            System.out.println("Broj je 0");
        } else if (i < 0) {
            System.out.println("Broj je negativan");
        }
    }
}
