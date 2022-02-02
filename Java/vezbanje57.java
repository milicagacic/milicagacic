package vezbanje;

import java.util.Scanner;

public class vezbanje57 {

    public static void main(String[] args) {
	//57.Korisnik unosi ime i prezime (jedan String), ime predmeta (String) i prosecnu ocenu istog (double). Validni predmeti su:
        //    {Srpski, Engleski, Matematika, Fizika, Hemija, Fizicko, Biologija, Istorija, Geografija}
        //	Na standardni izlaz ispisati poruku:
        //	"{ime i prezime} je {atribut} iz {kategorija predmeta}, jer je imao/la prosecnu ocenu {prsoecnu ocenu} iz predmeta {ime predmeta}",
        //	gde je atribut:
        //	1.) "veoma dobar/ra", ako je prosecna ocena iznad 3.5
        //	2.) "dobar/ra", ako je prosecna ocena izmedju 2.5 i 3.5
        //	3.) "veoma los/a", ako je prsoecna ocena ispod 2.5
        //	kategorija predmeta:
        //	1.) "prirodnih nauka" - Matematika, Fizika, Hemija
        //	2.) "jezika" - Srpski, Engleski
        //	3.) "opstih predmeta" - Biologoija, Istorija, Geografija
        //	Dakle, za unos:
        //	- "Ana Brankovic", "Biologija", 4.2
        //	poruka bi izgledala:
        //	"Ana Brankovic je veoma dobar/ra iz opstih predmeta, jer je imao/la prosecnu ocenu 4.2 iz predmeta Biologija"
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite ime i prezime:");
        String ime=sc.next(),prezime=sc.next();
        System.out.println("Unesite ime predmeta i prosecnu ocenu tog predmeta:");
        String predmet=sc.next();
        double ocena=sc.nextDouble();
        String prosek=" ";
        String nauka=" ";
        if(ocena>3.5){
        prosek="veoma dobar/ra";
    } else if(ocena>=2.5 && ocena<=3.5){
        prosek="dobar/ra";
    } else {
        prosek="veoma los/a";
    }
        if(predmet.equals("Matematika") || predmet.equals("Fizika") || predmet.equals("Hemija") ){
            nauka="prirodnih nauka";
            System.out.println(ime+" "+prezime+" je "+prosek+" iz "+nauka+" jer je imao/la prosecnu ocenu "+ocena+" iz predmeta "+predmet+".");
        } else if(predmet.equals("Srpski")|| predmet.equals("Engleski")){
            nauka="jezika";
            System.out.println(ime+" "+prezime+" je "+prosek+" iz "+nauka+" jer je imao/la prosecnu ocenu "+ocena+" iz predmeta "+predmet+".");
        } else if(predmet.equals("Biologija")|| predmet.equals("Istorija")|| predmet.equals("Geografija")){
            nauka="opstih predmeta";
            System.out.println(ime+" "+prezime+" je "+prosek+" iz "+nauka+" jer je imao/la prosecnu ocenu "+ocena+" iz predmeta "+predmet+".");
        } else {
            System.out.println("Izabrali ste nepostojaci predmet!");
        }




    }
}
