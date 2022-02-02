package vezbanje;

import java.util.Scanner;

public class vezbanje45 {
    public static void main(String[]args){
        //45.  Napraviti niz od 5 elemenata, svaki element uneti preko skenera
      int[] niz=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Unesite 5 celih brojeva:");
      for(int i=0;i<niz.length;i++){
          niz[i]=sc.nextInt();
      }
      System.out.println("Uneti brojevi su: ");
      for(int i=0;i<niz.length;i++){
          System.out.println(niz[i]);
      }

    }
}
