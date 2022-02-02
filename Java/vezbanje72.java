package vezbanje;

import java.util.Scanner;

public class vezbanje72 {
    public static void main(String[]args){
        //72.Napisite niz od 10 elemenata i koristeci FOR petlju pronadjite najveci broj u nizu,niz je tipa int,Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}.
        int[] niz={1,2,3,4,5,6,7,8,9,10};
        int max=0;
        for(int i=0;i<niz.length;i++){
            if(niz[i]>max){
                max=niz[i];
            }
        }
        System.out.println("Najveci broj u nizu je "+max);
    }
}
