package DomaciAutomobil;

import Osoba.Osoba;

public class Automobil {

    // vozilo  - Napisati klasu Automobil. Automobil ima
    //1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
    //2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
    //3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
    //Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
    // Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
    // Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

    private String mark;
    private String model;
    private int serijski;
    private Osoba vlasnik;

    public Automobil(String mark, String model, int serijski, Osoba vlasnik) {
        this.mark = mark;
        this.model = model;
        this.serijski = serijski;
        this.vlasnik = vlasnik;
    }

    public Automobil(String marka, String model, int serijski) {
        this.mark = mark;
        this.model = model;
        this.serijski = serijski;
        this.vlasnik = null;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getSerijski() {
        return serijski;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je: ");
        sb.append(mark);
        sb.append("\n");

        sb.append("Model automobila je: ");
        sb.append(model);
        sb.append("\n");

        sb.append("Serijksi broj automobila je: ");
        sb.append(serijski);
        sb.append("\n");

        if (vlasnik == null) {
            sb.append("Automobil nema vlasnika. ");

        }
        else sb.append("Vlasnik automobila je " + vlasnik.getIme() + " " + vlasnik.getPrezime());


        sb.append ("\n________________________________");


        return sb.toString();






}}
