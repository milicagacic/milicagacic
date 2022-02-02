package vezbanje;

import java.util.Scanner;

public class vezbanje49 {
    public static void main(String[]args){
        //49.Napraviti void metodu "Ime", u njoj odstampajte ime, tu metodu samo pozvati u Main metodi
        //Napraviti String metodu "Prezime" (nije void), u njoj samo uraditi inicijalizaciju prezimena u neki string
        //i odraditi return za taj string. U Main metodi odstampati metodu Prezime
        ime();
        System.out.println(prezime());



    }
    public static void ime(){
        System.out.println("Milica");
    }
    public static String prezime(){
        String prezime="Gacic";
        return prezime;
    }
}
