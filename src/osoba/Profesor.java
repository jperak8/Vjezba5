package osoba;

import zivotinja.Zivotinja;

import java.util.ArrayList;

public class Profesor extends Osoba implements Radnja {

    private String kolegij;

    public Profesor(String ime, String prezime, long OIB, String fakultet, String kolegij, ArrayList<Zivotinja> ljubimci) {
        super(OIB, ljubimci, fakultet, ime, prezime, new Adresa("Hrvatska", "Belišće", 31550, "Kraljevci", "8b"));
        this.kolegij = kolegij;
    }

    public void setKolegij(String kolegij) {
        this.kolegij = kolegij;
    }

    public String getKolegij() {
        return kolegij;
    }

    public String predaje() {
        return getFakultet() + "_" + getKolegij();
    }

    @Override
    public String toString(){
        return "Podaci profesora su: \n" +  " ime: " + getIme() + " prezime: " + getPrezime() + " OIB: " + getOIB() + " fakultet: " + getFakultet() + " kolegij: " + getKolegij() +  " \nadresa: " + getAdresa() + " \nljubimci profesora: " + getLjubimci() ;
    }

}
