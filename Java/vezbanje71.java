package vezbanje;

import java.util.Scanner;

public class vezbanje71 {
    public static void main(String[]args){
        //71.Napisati program koji od korisnika zahteva da unese duzinu niza,od korisnika zahteva da unese sve elemente,
        // zatim isisati niz koji je kornisk uneo za ispis niza takodje napisati metodu. Napisati metodu koja kao argument prima niz,
        // a kao povratnu vrednost vraca niz koji je obrnut,dakle ako posaljemo niz 1, 2, 3, 4 metoda treba da vrati niz 4, 3, 2, 1,zatim ispisati obrnuti niz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite duzzinu niza i njegove elemente:");
        int n=sc.nextInt();
        int [] niz=new int[n];
        for(int i=0;i<niz.length;i++){
            niz[i]=sc.nextInt();
        }ispisNiza(niz);
        nis(niz);
        System.out.println("Obrnuti niz izgleda ovako: ");
        for(int i=0;i<nis(niz).length;i++) {
            System.out.println(nis(niz)[i]);
        }
    }
    public static int[] nis(int[] niz){
        int[]nis=new int[niz.length];
        for(int i=0,j=niz.length-1;i<niz.length;i++,j--){
            nis[j]=niz[i];
        }
        return nis;
    }
    public static void ispisNiza(int[]niz){
        System.out.println("Niz koji ste uneli izgleda ovako: ");
        for(int i=0;i<niz.length;i++) {
            System.out.println(niz[i]);
        }

    }
}
