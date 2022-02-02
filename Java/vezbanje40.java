package vezbanje;

import java.util.Scanner;

public class vezbanje40 {
    public static void main(String[]args){
        //40. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        //	"Dobrodosao u {x}. razred, {ime} {prezime}",
        //	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
        //    poruku od:
        //	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite ime,prezime i godinu rodjenja:");
        String ime=sc.next(), prezime=sc.next();
        int godRodj=sc.nextInt();
        int god=2021-godRodj;
        if(god<7){
            System.out.println(ime+" "+prezime+" tek treba da zapocne obrazovanje.");
        }
        //ovde se radi ocigledno pod pretpostavkom da se u skolu polazi sa 7 godina,nije naznacenno!!
        switch(god){
            case(7): System.out.println("Dobrodosao/la u prvi razred "+ime+" "+prezime+".");
            break;
            case(8): System.out.println("Dobrodosao/la u drugi razred "+ime+" "+prezime+".");
            break;
            case(9): System.out.println("Dobrodosao/la u treci razred "+ime+" "+prezime+".");
            break;
            case(10): System.out.println("Dobrodosao/la u cetvrti razred "+ime+" "+prezime+".");
            break;
            case(11): System.out.println("Dobrodosao/la u peti razred "+ime+" "+prezime+".");
            break;
            case(12): System.out.println("Dobrodosao/la u sesti razred "+ime+" "+prezime+".");
            break;
            case(13): System.out.println("Dobrodosao/la u sedmi razred "+ime+" "+prezime+".");
            break;
            case(14): System.out.println("Dobrodosao/la u osmi razred "+ime+" "+prezime+".");
            break;
            case(15): System.out.println("Dobrodosao/la u deveti razred "+ime+" "+prezime+".");
            break;
            case(16): System.out.println("Dobrodosao/la u deseti razred "+ime+" "+prezime+".");
            break;
            case(17): System.out.println("Dobrodosao/la u jedanaesti razred "+ime+" "+prezime+".");
            break;
            case(18): System.out.println("Dobrodosao/la u dvanaesti razred "+ime+" "+prezime+".");
            break;
            default:
                 System.out.println(ime+" "+prezime+" je zavrsio/la skolu.");
                break;
        }


    }
}
