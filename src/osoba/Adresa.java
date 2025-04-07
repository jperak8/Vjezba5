package osoba;

public class Adresa {

    private String drzava;
    private String mjesto;
    private int postanskiBroj;
    private String ulica;
    private String kucniBroj;

    public Adresa(String drzava, String mjesto, int postanskiBroj, String ulica, String kucniBroj) {
        this.drzava = drzava;
        this.mjesto = mjesto;
        this.postanskiBroj = postanskiBroj;
        this.ulica = ulica;
        this.kucniBroj = kucniBroj;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKucniBroj() {
        return kucniBroj;
    }

    public void setKucniBroj(String kucniBroj) {
        this.kucniBroj = kucniBroj;
    }

    @Override
    public String toString(){
        return "Podaci adrese su: \n" + " država: " + getDrzava() + " mjesto: " + getMjesto() + " poštanski broj: " + getPostanskiBroj() + " ulica: " + getUlica() + " kućni broj: " + getKucniBroj();
    }

}
