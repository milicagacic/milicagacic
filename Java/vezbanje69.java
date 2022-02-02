package vezbanje;

public class vezbanje69 {
    public static void main(String[]args){
        //69.U posebnoj metodi izracunati sumu parnih dvocifrenih brojeva.U drugoj metodi izracunatu sumu neparnih dvocifrenih brojeva.
        // U main metodi uporediti sume i odstampati koja suma je veca.
        int[] niz={22,24,26,28};
        sumaParnih(niz);
        int[] nis={21,23,25,27};
        sumaNeparnih(nis);
        if(sumaParnih(niz)>sumaNeparnih(nis)){
            System.out.println("Veca suma je suma parnih: "+sumaParnih(niz));
        } else if(sumaParnih(niz)<sumaNeparnih(nis)){
            System.out.println("Veca suma je suma neparnih:"+sumaNeparnih(nis));
        }

    }
    public static int sumaParnih(int[]niz){
        int suma=0;
        for(int i=0;i<niz.length;i++){
            suma=suma+niz[i];
        }
        return suma;
    }
    public static int sumaNeparnih(int [] nis){
        int suma=0;
        for(int i=0;i<nis.length;i++){
            suma=suma+nis[i];
        }
        return suma;
    }
}
