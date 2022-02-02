package vezbanje;

import java.util.ArrayList;

public class arrayliste {
    //2. Array liste
    //Kreirajte array listu nekog vaseg interesovanje (npr sport)
    //-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
    //-iz liste dohvatite 3. element liste i ispisite
    //-promenite naziv prvog elementa
    //-uklonite 5. element
    //-ispisite velicinu vase liste
    //-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste
    public static void main(String[] args) {
        ArrayList<String> ples = new ArrayList<>();
        ples.add("Balet");
        ples.add("Salsa");
        ples.add("Tango");
        ples.add("Orijentalni ples");
        ples.add("Moderni balet");
        ples.add("Folklor");
        ples.add("Swing");
        System.out.println(ples);


        System.out.println("Treci element iz ove liste je: " + ples.get(2));

        ples.set(0, "Moderni balet");
        System.out.println("Menjam naziv prvog elementa u : " + ples.get(0));

        System.out.println("Uklanjam 5 element iz niza");
        ples.remove(4);
        System.out.println(ples);


        System.out.println("Velicina liste je: " + ples.size());

        System.out.println(" ");
        System.out.println("Elementi ove liste su: ");
        for (int i = 0; i < ples.size(); i++) {
            String element = ples.get(i);
            System.out.println((i + 1) + " " + element);
        }

        System.out.println("\n");
    }
}
