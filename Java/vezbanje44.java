package vezbanje;

public class vezbanje44 {
    public static void main(String[]args){
        //44.Ispisati najmanji broj niza ako su clanovi niza od 1 do 100
        //Dodatak - Ispisati razliku izmedju minimuma i maximuma
        //Dodatak - Koja je prosecna vrednost niza?
        int[] niz={1,56,98,76,45,25,100};
        int min=101;
        int max=0;
        double suma=0;
        for(int i=0;i<niz.length;i++) {
            if (niz[i] < min) {
                min = niz[i];
            }
        }
        System.out.println("Minimum je "+min);
        for(int i=0;i<niz.length;i++) {
            if(niz[i]>max) {
                max = niz[i];
            }


        }
        System.out.println("Maksimum je "+max);
        System.out.println("Razlika izmedju maximuma i minimuma je "+(max-min));
        for(int i=0;i<niz.length;i++){
            suma=suma+niz[i];
        }
        double prosek=suma/niz.length;
        System.out.println("Prosecna vrednost je "+prosek);

    }
}
