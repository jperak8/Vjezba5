package osoba;

import zivotinja.Zivotinja;

import java.util.ArrayList;

public abstract class Osoba implements Radnja {

    private long OIB;
    private String ime;
    private String prezime;
    private Adresa adresa;
    private String fakultet;
    ArrayList<Zivotinja> ljubimci;

    public Osoba(long OIB, ArrayList<Zivotinja> ljubimci, String fakultet, String ime, String prezime, Adresa adresa) {
        this.OIB = OIB;
        this.ljubimci = ljubimci;
        this.fakultet = fakultet;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
    }

    public long getOIB() {
        return OIB;
    }

    public void setOIB(long OIB) {
        this.OIB = OIB;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public ArrayList<Zivotinja> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(ArrayList<Zivotinja> ljubimci) {
        this.ljubimci = ljubimci;
    }

}
