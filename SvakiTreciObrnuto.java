package domaci.domaci1412;

import java.util.Scanner;

/*29. -//-. Ispisati svaki treci element u obrnutom redosledu.
        Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.*/
public class SvakiTreciObrnuto {
    public static void main(String[] args) {

        int[] nizBrojeva = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

       svakiTreciObrnuto(nizBrojeva);
    }

   public static void svakiTreciObrnuto(int[] x){
      for(int i = x.length - 1; i >=0 && i < x.length; i = i - 3){
           System.out.println(x[i]);

      }
    }
}
