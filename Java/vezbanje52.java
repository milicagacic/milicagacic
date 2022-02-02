package vezbanje;

import java.util.Scanner;

public class vezbanje52 {

    public static void main(String[] args) {
        // 52. Ispisati tablicu mnozenja jednocifrenih brojeva (dakle tabela 10x10, 81 u poslednjem polju)
        for(int i=1;i<10;i++){
            System.out.print(" "+i+"|");
            for(int j=1;j<10;j++){
                System.out.print(i*j+" ");
                if(i*j<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
