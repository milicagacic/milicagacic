package vezbanje;

import java.util.Scanner;

public class vezbanje68 {
    public static void main(String[]args) {
       //68. Napraviti niz u main metodi.U drugoj metodi kreirati niz koji se sastoji od elemenata deljivih sa 3 iz prethodnog niza (iz main metode).
      int[] niz={1,2,3,33,38,32,36,30};
      int[] niz2=drugiNiz(niz);
      for(int i=0;i<niz2.length;i++){
          System.out.println(niz2[i]);
      }
    }
    public static int[] drugiNiz(int [] niz){
        int broj=0;
        for(int i=0;i<niz.length;i++){
            if(niz[i]%3==0){
                broj=broj+1;
            }
        }
        int br=0;
        int[] novi=new int[broj];
        for(int i=0;i<niz.length;i++){
            if(niz[i]%3==0){
                novi[br]=niz[i];
                br++;
            }
        }
        if(br==0){
            System.out.println("Niz nema brojeve deljive sa 3.");
        }
        return novi;
    }

}

