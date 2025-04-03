package zivotinja;

public class Riba extends Zivotinja {

    private boolean jelRijecna;
    private double rasponPeraja;
    private double brzinaPlivanja;

    public Riba(double rasponPeraja, double brzinaPlivanja, boolean jelRijecna) {
        this.rasponPeraja = rasponPeraja;
        this.brzinaPlivanja = brzinaPlivanja;
        this.jelRijecna = jelRijecna;
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
}
