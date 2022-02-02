package vezbanje;

import java.util.Scanner;

public class vezbanje75 {
    public static void main(String[]args){
        //75. NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar.Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
        //1 evro je 0,0085 dinara
        //1 franak je 0,0093 dinara
        //1 dolar je 0,010 dinara
        //Ispise vrsiti iskljucivo iz main metode!Primeri ispisa u konzoli:
        //Molim vas unesite iznos u dinarima:
        //1200
        //Molim vas da unesete valutu u koju da konvertujemo dinare:
        //evro
        //1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti
        //Primer ispisa u konzoli kad se unese pogresna valuta
        //Molim vas unesite iznos u dinarima:
        //123
        //Molim vas da unesete valutu u koju da konvertujemo dinare:
        //zlato
        //Niste uneli dobru valutu
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite iznos u dinarima i valutu u koju zelite da ih konvertujete:");
        double din=sc.nextDouble();
        String valuta=sc.next();
        konvertovanje(din,valuta);
        System.out.println(din+" din. kad se prebaci u "+valuta+" iznosi "+konvertovanje(din,valuta)+" "+valuta+"a.");
    }
    public static double konvertovanje(double din,String valuta){
        double vrednost=0;

        if(valuta.equals("evro")){
            vrednost=din*0.0085;
        }else if(valuta.equals("franak")){
            vrednost=din*0.0093;
        }else if(valuta.equals("dolar")){
            vrednost=din*0.010;
        }else{
            System.out.println("Izabrali ste nepostojacu valutu.");
        }
        return vrednost;



    }
}
