package domaci2;

public class Main {

        public static void main(String[] args) {
            String nizImena[]={"Anita", "Marija", "Bojana", "Milica", "Angelina"};
            Imena("Marija", nizImena);
            Imena("Petar", nizImena);

        }

        public static void Imena(String ime, String[] nizImena) {
            boolean imaImena=false;
            for (int i=0;i< nizImena.length;i++)
                if (ime.equals(nizImena[i])) {
                    System.out.println("U nizu postoji ime "+ime);
                    imaImena=true;
                }
            if (imaImena==false)
                System.out.println("U nizu ne postoji ime "+ime);
        }
    }

