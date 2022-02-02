package vezbanje84;

public class Automobil {
    //84.Napisati klasu Automobil, koja treba da ima sledece atribure: marka, zemljaProizvodnje, godiste, kilometrzu,
    // ali da ima vise konsturktora u slucaju da korisnik unese samo prva 3 podatka ili godinu unese kao String umesto kao int.
    // Napisati test program u kome treba napraviti 2 automobila, i ispisati ih na izlaz.
    private String marka;
    private String zemljaPorekla;
    private int godinaProizvodnje;
    private double kilometraza;

    public Automobil(String marka, String zemljaPorekla, int godinaProizvodnje, double kilometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kilometraza = kilometraza;
    }

    public Automobil(String marka, String zemljaPorekla, String godinaProizvodnje, double kilometraza){
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = Integer.parseInt(godinaProizvodnje);
        this.kilometraza = kilometraza;
    }

    public Automobil(String marka, String zemljaPorekla, int godinaProizvodnje) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = godinaProizvodnje;
        // posto nije specificirano u argumentima koja vrednost treba biti dodeljena polju kilometraza
        // onda cemo mi dodeliti vrednost 0
        // ovo je takodje praksa, da se poljima cija vrednost nije definisana argumentima konstruktora, dodeljuje vrednost 0
        this.kilometraza = 0;
    }

    public String getMarka() {
        return marka;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }


    public String toString(){
        String stringKojiVracam;
        stringKojiVracam = "Marka automobila je: " + marka + "\n";
        stringKojiVracam += "Zemlja porekla automobila je: " + zemljaPorekla + "\n";
        stringKojiVracam += "Godina proizvodnje automobila je: " + godinaProizvodnje + "\n";
        stringKojiVracam += "Automobil je presao : " + kilometraza + " km" + "\n";
        return stringKojiVracam;
    }




}
