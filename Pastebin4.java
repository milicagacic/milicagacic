package Pastebin4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

        System.out.println("Unesite negativan, ceo broj: ");
        int n = sc.nextInt();

        for (int i = 0; n<=i;n++) {
            System.out.println(n);
        }

    }
}
