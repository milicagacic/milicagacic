package vezbanje;

import java.util.Scanner;

public class vezbanje56 {
    public static void main(String[] args) {
        //56.Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double). [Ovaj zadatak je dosta komplikovan!]
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti pozitivan ceo broj:");
        int n = sc.nextInt();
        double min=0,max=0;
        for (int i =0; i<n; i++) {
            System.out.println("Unesite realni broj:");
          double x = sc.nextDouble();
          if(i==0){
              min=max=x;
          }
          if(x>max){
              max=x;
          }
          if(x<min){
              min=x;
          }



        }
        System.out.println("Najmanji broj je: "+min+"\n Najveci broj je: "+max);
    }
}