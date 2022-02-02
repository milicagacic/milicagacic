package vezbanje;

import java.util.Scanner;

public class Vezbanje7 {
    public static void main(String[]args){
        //7. Napisati program koji izbacuje odgovarajuci broj kada korisnik unese dan u ndelji
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisite recima dan u nedelji.");
        String danUNedelji=sc.next();
        switch(danUNedelji){
            case("ponedeljak"): System.out.println("Ovaj dan u nedelji je prvi po redu.");
            break;
            case("utorak"): System.out.println("Ovaj dan u nedelji je drugi po redu.");
            break;
            case("sreda"): System.out.println("Ovaj dan u nedelji je treci po redu.");
            break;
            case("cetvrtak"): System.out.println("Ovaj dan u nedelji je cetvrti po redu.");
            break;
            case("petak"): System.out.println("Ovaj dan u nedelji je peti po redu.");
            break;
            case("subota"): System.out.println("Ovaj dan u nedelji je sesti po redu.");
            break;
            case("nedelja"): System.out.println("Ovaj dan u nedelji je sedmi po redu.");
            break;
            default: System.out.println("Morate uneti naziv jednog dana u nedelji.");
        }
    }
}
