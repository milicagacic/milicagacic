package vezbanje;

import java.util.Scanner;

public class vezbanje51 {

    public static void main(String[] args) {
        //51. U Main metodi treba proslediti godine i ispisati da li je osoba punoletna ili ne,
        ////koristiti drugu metodu za racunanje
        punoletna(11);
        punoletna(17);
        punoletna(18);
        punoletna(19);
        punoletna(33);


    }
    public static String punoletna(int x){
        String da="Korisnik je punoletan,";
        String ne="Korisnik je maloletan,";
        if(x<18){
            System.out.println(ne+"ima "+x+" godina.");
            return ne;
        }else{
            System.out.println(da+"ima "+x+" godina.");
            return da;
        }

    }

}
