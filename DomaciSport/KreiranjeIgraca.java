package DomaciSport;

public class KreiranjeIgraca {

    public static void main(String[] args) {


        Sportista igrac1 = new Sportista("Milica Gacic", "Kosarka", "Zemun", 11);
        Sportista igrac2 = new Sportista("Marko Mandic", "Tenis", "Zvezda", 19);
        Sportista igrac3 = new Sportista ("Viktor Stankovic", "Fudbal", "Partizan", 17);

        System.out.println(igrac1);
        System.out.println(igrac2);
        System.out.println(igrac3);

        igrac1.setKlub("Zemun");
        System.out.println(igrac1);







    }
}
