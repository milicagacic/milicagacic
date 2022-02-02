package vezbanje84;

public class AutomobilTest {
    public static void main(String[] args) {
            // pozvace se public Automobil(String marka, String zemljaPorekla, int godinaProizvodnje, double kilometraza)
            Automobil auto1 = new Automobil("BMW", "Nemacka", 2016, 12000);

            // pozvace se public Automobil(String marka, String zemljaPorekla, int godinaProizvodnje)
            Automobil auto2 = new Automobil("Pezo", "Francuska", 2015);

            // pozvace se public Automobil(String marka, String zemljaPorekla, String godinaProizvodnje, double kilometraza){
            Automobil auto3 = new Automobil("Mercedes", "Nemacka", "2016", 12000);

            System.out.println(auto1);
            System.out.println(auto2);
            System.out.println(auto3);
        }
}
