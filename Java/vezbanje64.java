package vezbanje;

public class vezbanje64 {
    public static void main(String[]args){
        //64. Ispisati svaki treci element u obrnutom redosledu. Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
        int[] niz={1,2,3,4,5,6,7,8,9,0,23,65,78,56};
        svakiTreci(niz);
    }
    public static void svakiTreci(int[]x){
        for(int i=x.length-1;i>=0&&i<x.length;i=i-3){
            System.out.println(x[i]);
        }
    }
}
