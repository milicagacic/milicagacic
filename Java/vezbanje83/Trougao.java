package vezbanje83;

public class Trougao {
    //83.Klasa trougao ima 3 polja koji predstavljaju stranice: stranicaA, stranicaB, stranicaC. Vrednost stranica je tipa double.
    // Napisati konstruktor, getter i setter metode za sve stranice i metode za racunanje obima i povrsine.
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    private boolean daLiJeTrougaoValidan(){
        // vrati true ako jeste
        // vrati false ako nije
        // trougao nije validan ako zbir duzina bilo koje 2 stranice je manji od duzine trece
        if(stranicaA <=0 || stranicaB <= 0 || stranicaC <=0){
            return false;
        }
        else if(stranicaA + stranicaB < stranicaC){
            return false;
        }
        else if(stranicaA + stranicaC < stranicaB){
            return false;
        }
        else if (stranicaB + stranicaC < stranicaA){
            return false;
        }
        else{
            return true;
        }
    }

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Pokusavate kreirati nevalidan trougao!");
        }
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Vase menjanje duzine straniceA je ucinilo ovaj trougao nevalidnim");
        }
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Vase menjanje duzine straniceB je ucinilo ovaj trougao nevalidnim");
        }
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Vase menjanje duzine straniceC je ucinilo ovaj trougao nevalidnim");
        }
    }

    // obim
    public double obim(){
        double o = stranicaA + stranicaB + stranicaC;
        return o;
    }

    // povrsina
    public double povrsina(){
        // heronov obrazac
        // prvi nacin
        //double s = (stranicaA + stranicaB + stranicaC) / 2;
        // drugi nacin preko poziva metode obim()
        double s = obim() / 2;
        double podKorenaVrednost = s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC);
        double p = Math.sqrt(podKorenaVrednost);
        return p;
    }
}
