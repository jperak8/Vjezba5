package osoba;

import zivotinja.Zivotinja;

import java.util.ArrayList;

public class Profesor extends Osoba implements Radnja {

    private String kolegij;

    public Profesor(long OIB, ArrayList<Zivotinja> ljubimci, String fakultet, String ime, String prezime, String drzava, String mjesto, int postanskiBroj, String ulica, String kucniBroj, String kolegij) {
        super(OIB, ljubimci, fakultet, ime, prezime, drzava, mjesto, postanskiBroj, ulica, kucniBroj);
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
        return  "OIB: " + getOIB() + " ljubimci: " + getLjubimci() + " fakultet: " + getFakultet() + " ime: " + getIme() + " prezime: " + getPrezime() + " država: " + getDrzava() + " mjesto: " + getMjesto() + " poštanski broj: " + getPostanskiBroj() + " ulica: " + getUlica() + " kućni broj: " + getKucniBroj() + " kolegij: " + getKolegij();
    }

}
