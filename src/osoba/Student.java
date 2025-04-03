package osoba;

import zivotinja.Zivotinja;

import java.util.ArrayList;

public class Student extends Osoba {

    private long JMBAG;
    private int godinaStudiranja;

    public Student(long OIB, ArrayList<Zivotinja> ljubimci, String fakultet, String ime, String prezime, long JMBAG, int godinaStudiranja, String drzava, String mjesto, int postanskiBroj, String ulica, String kucniBroj) {
        super(OIB, ljubimci, fakultet, ime, prezime, drzava,  mjesto, postanskiBroj, ulica, kucniBroj);
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

}
