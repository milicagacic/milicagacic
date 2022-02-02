package Pastebin5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 //Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

               Scanner sc = new Scanner(System.in);

                System.out.println("Unesite pozitivan, ceo broj: ");
                int n = sc.nextInt();

               for (int i = -14; i<=2*n;i++) {
                    System.out.println(i);
                }
    }
}
