package vezbanje;

import java.util.Scanner;

public class vezbanje25 {
    public static void main(String[] args) {
       //25. Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,koji je strogo manji od njega (dakle t < n),
        // sumu svih pozitivnih celih brojeva od 1 do tog broja, broja t.

        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti ceo pozitivan broj:");
        int n=sc.nextInt();
        int suma=0;
        while(n<0){
            System.out.println("Uneti ceo POZITIVAN broj:");
            n=sc.nextInt();
        }
        for(int t=1;t<n;t++)
            suma=suma+t;
        System.out.println("Suma brojeva broja t je "+suma);

    }


}

