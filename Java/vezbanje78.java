package vezbanje;

public class vezbanje78 {
    public static void main(String[] args) {
        //78.Napravi mi 4 profila
        System.out.println(profili(0));
        System.out.println(profili(1));
        System.out.println(profili(2));
        System.out.println(profili(3));


    }

    public static String profili(int x) {
        String[] ime = {"Milos", "Marko", "Andjela", "Milica"};
        String[] prezime = {"Jovanovic", "Mandic", "Ilic", "Gacic"};
        int[] godine = {23, 27, 50, 24};

        String[] profil = new String[4];

        profil[0] = ime[0] + " " + prezime[0] + " " + godine[0];
        profil[1] = ime[1] + " " + prezime[1] + " " + godine[1];
        profil[2] = ime[2] + " " + prezime[2] + " " + godine[2];
        profil[3] = ime[3] + " " + prezime[3] + " " + godine[3];

        return profil[x];
    }
}
