package seznamvyrobku;

public class Vyrobek {
    private String nazev;

    public Vyrobek(String n) {
        this.nazev = n;
    }
    public String getNazev() {
        return nazev;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
    public String getZkratka() {
        String[] parts = this.nazev.split("-");
        return parts[0];
    }
    public void setZkratka(String z) {
        String[] parts = this.nazev.split("-");
        this.nazev = z + "-" + parts[1];
    }
    public int getRok() {
        String[] parts = this.nazev.split("-");
        return Integer.parseInt(parts[1]);
    }
    public void setRok(int r) {
        String[] parts = this.nazev.split("-");
        this.nazev = parts[0] + "-" + r;
    }
    public void predstavSe() {
        System.out.println("Výrobek: "+this.nazev);
        System.out.println("Název: "+getZkratka());
        System.out.println("Rok: "+getRok());
    }
}
