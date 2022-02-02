package vezbanje81;

public class Pravougaonik {
    private double duzina;
    private double sirina;

    public Pravougaonik(double duzina, double sirina) {
        this.duzina = duzina;
        this.sirina = sirina;
    }

    public double getDuzina() {
        return duzina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    //metoda koja racuna obim ovog pravougaonika, i vraca vrednost koju izracuna
    public double obim(){
        double o = 2 * duzina + 2 * sirina;
        return o;
    }

    //metoda koja racuna povrsinu ovog pravougaonika, i vraca vrednost koju izracuna
    public double povrsina(){
        double p = duzina * sirina;
        return p;
    }




}
