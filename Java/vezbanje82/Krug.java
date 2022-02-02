package vezbanje82;

public class Krug {

    private double poluprecnik;

    public Krug(double poluprecnik) {
        if(poluprecnik < 0){
            System.out.println("Greska! Uneli ste negativan poluprecnik.");
        }
        else{
            this.poluprecnik = poluprecnik;
        }
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        if(poluprecnik < 0){
            System.out.println("Greska! Uneli ste negativan poluprecnik.");
        }
        else{
            this.poluprecnik = poluprecnik;
        }
    }

    public double obim(){
        double o = 2 * poluprecnik * Math.PI;
        return o;
    }

    public double povrsina(){
        double p = poluprecnik * poluprecnik * Math.PI;
        return p;
    }
}
