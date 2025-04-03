package zivotinja;

public class Pas extends Zivotinja{

    private String pasmina;
    private boolean sampion;
    private double brzinaTrcanja;

    public Pas(String pasmina, boolean sampion, double brzinaTrcanja) {
        this.pasmina = pasmina;
        this.sampion = sampion;
        this.brzinaTrcanja = brzinaTrcanja;
    }

    public String getPasmina() {
        return pasmina;
    }

    public void setPasmina(String pasmina) {
        this.pasmina = pasmina;
    }

    public boolean isSampion() {
        return sampion;
    }

    public void setSampion(boolean sampion) {
        this.sampion = sampion;
    }

    public double getBrzinaTrcanja() {
        return brzinaTrcanja;
    }

    public void setBrzinaTrcanja(double brzinaTrcanja) {
        this.brzinaTrcanja = brzinaTrcanja;
    }

    @Override
    public String kreceSe() {
        return "trci";
    }

}
