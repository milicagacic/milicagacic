package vezbanje;

public class vezbanje42 {
    public static void main(String[]args){
        //42.Staviti dane u nedelji u niz i ispisati ih
        //Dodatak - Napraviti niz broja dana u nedelji i ispisati pre naziva dana u nedelji
        String[] dani={"Ponedeljak","Utorak","Sreda","Cetvrtak","Petak","Subota","Nedelja"};
        int[] broj={1,2,3,4,5,6,7,8};
        for(int i=0;i<dani.length;i++) {
            System.out.println(broj[i]+".dan u nedelji je " + dani[i]+".");
        }

    }
}
