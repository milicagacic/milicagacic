package DomaciGlumci;

import java.util.Scanner;

public class GlumciTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime glumca");
        String ime = sc.next();
        System.out.println("Unesite njegovo prezime");
        String prezime = sc.next();
        System.out.println("Unesite njegov/njen pol: ");
        char pol = sc.next().charAt(0);
        System.out.println("Unesite njegove godine");
        int godine = sc.nextInt();
        System.out.println("Unesite ocenu glumca: ");
        double ocena = sc.nextDouble();
        System.out.println("Unesite njegovo poreklo: ");
        String poreklo = sc.next();

        Glumac glumac1 = new Glumac (ime,prezime,pol,godine,ocena,poreklo);

        System.out.println("Unesite njegovo ime");
        String ime1 = sc.next();
        System.out.println("Unesite njegovo prezime");
        String prezime1 = sc.next();
        System.out.println("Unesite njegov pol: ");
        char pol1 = sc.next().charAt(0);
        System.out.println("Unesite njegove godine");
        int godine1 = sc.nextInt();
        System.out.println("Unesite ocenu glumca: ");
        double ocena1 = sc.nextDouble();
        System.out.println("Unesite njegovo poreklo: ");
        String poreklo1 = sc.next();

        Glumac glumac2 = new Glumac (ime1,prezime1,pol1,godine1,ocena,poreklo1);

        System.out.println(glumac1);
        System.out.println(glumac2);


        //Preko skenera sam unosila iskljucivo radi vezbe
        //Sto se booleana tice, pokusavala sam, ali na kraju nisam resila
        //Jedino mi je palo na pamet da u skeneru ipisem ako je glumac iz srbije da pisu true, ako nije da pisu false
        //pa onda da preko if ako je true pisem jeste ako je false pisem nije.
        //nisam znala kako da definisem da ako je Srbija da je true i da onda nesto ispisem
        //ili ako je neka druga zemlja da prepozna kao false i pise nesto drugo.




    }
}
