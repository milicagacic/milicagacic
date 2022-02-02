package Ucenik;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int redniBroj) {
        dnevnik.remove(redniBroj);
    }

    public void pogledajOcene(Ucenik u) {
        System.out.println(u.getOcene());
    }

    public void pogledajOcene(int redniBroj) {
        System.out.println(dnevnik.get(redniBroj).getOcene());
    }

    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosek());

    }

    public void prosecnaOcena(int redniBroj) {
        System.out.println(dnevnik.get(redniBroj).prosek());
    }

    public double prosecnaOcenaOdeljenja() {
        if (dnevnik.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Ucenik ucenik : dnevnik) {
            suma = suma + ucenik.prosek();
        }
        return suma / dnevnik.size();
    }

    public void opisnaOcena(Ucenik u) {
        if (u.prosek() >= 1) {
            System.out.println("Nedovoljan.");
        }else if (u.prosek() >= 4.5) {
            System.out.println("Odlican.");
        } else if (3.5 <= u.prosek() || u.prosek() < 4.5) {
            System.out.println("Vrlo dobar.");
        } else if (2.5 <= u.prosek() || u.prosek() < 3.5) {
            System.out.println("Dobar.");
        } else if (1.5 <= u.prosek() || u.prosek() < 2.5) {
            System.out.println("Dovoljan.");
        }
    }

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme());
            sb.append(" i ");
            sb.append(ucenik.getPrezime());
            sb.append(" ima ocene:");
            sb.append("\n");
            sb.append(ucenik.getOcene());
        }
        return sb.toString();
    }

    public String velicinaOdeljenja() {

        String velicinaOdeljenja = "";
        if (dnevnik.size() > 25) {
            velicinaOdeljenja = "Veliko odeljenje.";
        } else if (dnevnik.size() < 15 || dnevnik.size() < 25) {
            velicinaOdeljenja = "Srednje odeljenje.";
        } else if (dnevnik.size() < 15) {
            velicinaOdeljenja = "Malo odeljenje.";
        }

        return velicinaOdeljenja;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenja ima djake:");
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme());
            sb.append(" ");
            sb.append(ucenik.getPrezime());
        }
        return sb.toString();
    }

}





