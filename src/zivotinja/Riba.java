package zivotinja;

public class Riba extends Zivotinja {

    private String rod;
    private boolean jelRijecna;
    private double rasponPeraja;
    private double brzinaPlivanja;

    public Riba(String rod, double rasponPeraja, double brzinaPlivanja, boolean jelRijecna) {
        this.rod = rod;
        this.rasponPeraja = rasponPeraja;
        this.brzinaPlivanja = brzinaPlivanja;
        this.jelRijecna = jelRijecna;
    }

    public String getRod() {
        return rod;
    }

    public void setRod(String rod) {
        this.rod = rod;
    }

    public boolean isJelRijecna() {
        return jelRijecna;
    }

    public void setJelRijecna(boolean jelRijecna) {
        this.jelRijecna = jelRijecna;
    }

    public double getRasponPeraja() {
        return rasponPeraja;
    }

    public void setRasponPeraja(double rasponPeraja) {
        this.rasponPeraja = rasponPeraja;
    }

    public double getBrzinaPlivanja() {
        return brzinaPlivanja;
    }

    public void setBrzinaPlivanja(double brzinaPlivanja) {
        this.brzinaPlivanja = brzinaPlivanja;
    }

    @Override
    public String kreceSe() {
        return "pliva";
    }

    @Override
    public String toString() {
        return "\nRiba podaci \n" + " rod: " + getRod() + " brzina plivanja: " + getBrzinaPlivanja() + " raspon peraja " + getRasponPeraja() + " jel riječna? " + isJelRijecna();
    }

}
