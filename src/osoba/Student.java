package osoba;

import zivotinja.Zivotinja;

import java.util.ArrayList;

public class Student extends Osoba {

    private long JMBAG;
    private int godinaStudiranja;

    public Student(String ime, String prezime, int godinaStudiranja, long OIB, long JMBAG, String fakultet, ArrayList<Zivotinja> ljubimci) {
        super(OIB, ljubimci, fakultet, ime, prezime, new Adresa("Hrvatska", "Belišće", 31550, "Braće Radića", "39"));
        this.JMBAG = JMBAG;
        this.godinaStudiranja = godinaStudiranja;
    }

    public void setJMBAG(long JMBAG) {
        this.JMBAG = JMBAG;
    }

    public long getJMBAG() {
        return JMBAG;
    }

    public void setGodinaStudiranja(int godinaStudiranja) {
        this.godinaStudiranja = godinaStudiranja;
    }

    public int getGodinaStudiranja() {
        return godinaStudiranja;
    }

    public String uci(){
        return "uci";
    }

    @Override
    public String spava() {
        return "spava 10 sati";
    }

    @Override
    public String toString(){
        return "Podaci studenta su: \n" + " ime: " + getIme() + " prezime: " + getPrezime() + " OIB: " + getOIB() + " fakultet: " + getFakultet() + " kolegij: " + " \nadresa: " + getAdresa() + " \nljubimci studenta: " + getLjubimci();
    }

}
