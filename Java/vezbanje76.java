package vezbanje;

import java.util.Scanner;

public class vezbanje76 {
    public static void main(String[]args){
        //76. NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu.Proizvoljno napravite niz od 10 brojeva,korisnik unosi broj koji zeli da prebroji u nizu,
        // niz je tipa int. Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
        //Primeri ispisa u konzoli
        //2
        //Broj 2 se pojavljuje 3. puta u nasem nizu brojeva
        //Primer ispisa kad se unese broj koji ne postoji u nizu brojeva
        //Unesite broj koji zelite da prbrojimo u nizu brojeva:
        //8
        //Broj 8 se ne pojavljuje u nasem nizu
        Scanner sc=new Scanner(System.in);
        int[] niz={1,2,3,4,5,6,7,8,9,10,3};
        System.out.println("Unesite neki pozitivan celi broj:");
        int n=sc.nextInt();
        funkcija(n,niz);

    }
    public static void funkcija(int n, int[] niz){
        int broj=0;
        for(int i=0;i<niz.length;i++) {
            if (n == niz[i]) {
                broj++;
            }
        }
        if(broj>0) {
            System.out.println("Ovaj broj se pojavljuje u nasem nizu " + broj + " puta.");
        } else {
            System.out.println("Ovaj broj se ne pojavljuje u nasem nizu.");
        }

    }
}
