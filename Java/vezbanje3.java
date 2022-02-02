package vezbanje;

import java.util.Scanner;

public class vezbanje3 {
    //Korisnik treba da unese 2 brojai unese operaciju saberi,oduzmi,pomnozi ili podeli.
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisite dva cela broja:");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Izaberite jednu od datih operacija:saberi,oduzmi,pomnozi ili podeli.");
        String operacija=sc.next();
        if(operacija.equals("saberi")){
            int rezultat=a+b;
            System.out.println("Rezultat ova dva broja je "+rezultat+".");
        }else if(operacija.equals("oduzmi")){
            int rezultat=a-b;
            System.out.println("Rezultat ova dva broja je "+rezultat+".");
        }else if(operacija.equals("pomnozi")){
            int rezultat=a*b;
            System.out.println("Rezultat ova dva broja je "+rezultat+".");
        }else if(operacija.equals("podeli")) {
            if (a == 0 || b == 0) {
                System.out.println("Ne mozemo deliti sa nulom.");
            } else {
                int rezultat = a / b;
                System.out.println("Rezultat ova dva broja je " + rezultat + ".");
            }
        }else{
            System.out.println("Morate izabrati jednu od ponudjenih operacija.");
        }
    }
}
