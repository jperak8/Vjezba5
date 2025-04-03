package zivotinja;

public class Ptica extends Zivotinja {

    private String vrstaPtice;
    private boolean jelIdeNaJugZimi;
    private double rasponKrila;

    public Ptica(String vrstaPtice, boolean jelIdeNaJugZimi, double rasponKrila) {
        this.vrstaPtice = vrstaPtice;
        this.jelIdeNaJugZimi = jelIdeNaJugZimi;
        this.rasponKrila = rasponKrila;
    }

    public String getVrstaPtice() {
        return vrstaPtice;
    }

    public void setVrstaPtice(String vrstaPtice) {
        this.vrstaPtice = vrstaPtice;
    }

    public boolean isJelIdeNaJugZimi() {
        return jelIdeNaJugZimi;
    }

    public void setJelIdeNaJugZimi(boolean jelIdeNaJugZimi) {
        this.jelIdeNaJugZimi = jelIdeNaJugZimi;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    @Override
    public String kreceSe() {
        return "leti";
    }

}
