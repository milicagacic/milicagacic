package vezbanje;

public class vezbanje65 {
    public static void main(String[]args){
        //65.Napisati funkciju koja racuna proizvod elemenata zadatog niza.
        int [] niz={1,2,3,4,5};
        racunanje(niz);
    }
    public static void racunanje(int[]x){
        int proizvod=1;
        for(int i=1;i<x.length;i++){
            proizvod=proizvod*x[i];
        }
        System.out.println("Proizvod niza je "+proizvod+".");

    }
}
