package domaci.domaci1412;
/*30. -//-. Izracunati proizvod elemenata tog niza.
        Primer: [2, 4] -> 8
        30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.*/

public class ProizvodElemenata {
    public static void main(String[] args) {

        int[] nizBrojeva = {10, 7, 4, 1};
        System.out.println( "Proizvod elemenata niza je " + proizvodNiza(nizBrojeva) + ".");
    }
    public static int proizvodNiza(int[] x){
        int proizvod = 1;
        for(int i = 0; i < x.length; i++){
            proizvod = proizvod * x[i];
        }
        return proizvod;
    }
}
