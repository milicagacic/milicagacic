package domaci.domaci1412;

import java.util.Scanner;

/*27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
        Primer: [1, 2, 3, 4, 5] -> 1 3 5
        27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.*/
public class SvakiDrugiElNiza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da unesete?");
        int[] nizBrojeva = new int[sc.nextInt()];

        System.out.println("Unesi clanove niza: ");

        for (int i = 0; i < nizBrojeva.length; i++) {
            nizBrojeva[i] = sc.nextInt();
        }
        System.out.println("Svaki drugi element niza: ");
        svakiDrugi(nizBrojeva);

    }
    public static void svakiDrugi(int[] x){
        for(int i = 0; i < x.length; i = i + 2){
            System.out.println(x[i]);
        }
    }
}
