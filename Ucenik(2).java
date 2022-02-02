package Ucenik;

import java.util.ArrayList;

public class Ucenik {

    private String ime;
    private String prezime;
    private ArrayList<Integer> nizOcena;

    public Ucenik(String ime, String prezime, ArrayList ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = nizOcena;
    }


    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = new ArrayList<Integer>();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList getOcene() {
        return nizOcena;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setOcene(ArrayList nizOcena) {
        this.nizOcena = nizOcena;
    }

    public void dodajuOcenu(int ocena) {
        nizOcena.add(ocena);
    }

    public double prosek() {
        double suma = 0;
        for (int ocena : nizOcena) {
            suma = suma + ocena;
        }
        return suma / nizOcena.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Ime ");
        sb.append(ime);
        sb.append(" i ");
        sb.append(" prezime ");
        sb.append(prezime);
        sb.append(" ima ocene: ");
        sb.append(nizOcena);
        return sb.toString();
    }
}



