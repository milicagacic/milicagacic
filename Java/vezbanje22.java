package vezbanje;

import java.util.Scanner;

public class vezbanje22 {
    public static void main(String[]args){
       //22.Na standardni ulaz korisnik treba da unese dva cela broja.Na standardni izlaz u zasebnim redovima treba napisati
        // zbir,razliku,proizvod,kolicnik i ostatak deljenja prvog broja drugim tim redom.
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisite dva cela broja:");
        int a=sc.nextInt(),b=sc.nextInt();
        int zbir=a+b;
        System.out.println("Zbir ova dva broja je: "+zbir);
        int razlika=a-b;
        System.out.println ("Razlika ova dva broja je " + razlika);
        int proizvod=a*b;
        System.out.println("Proizvod ova dva broja je "+proizvod);
        if(a==0 || b==0){
            System.out.println("Ne mozemo deliti nulom.");
        } else {
            int kolicnik = a / b;
            System.out.println("Kolicnik ova dva broja je " + kolicnik);
            int ostatak = a % b;
            System.out.println("Ostatak pri deljenju prvog broja drugim je " + ostatak);
        }
    }
}
