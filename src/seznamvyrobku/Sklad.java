package seznamvyrobku;

public class Sklad {
    Vyrobek oznaceni;
    int cena;

    public Sklad(String oznaceni, int cena) {
        this.oznaceni = new Vyrobek(oznaceni);
        this.cena = cena;
    }
    
    public void vytiskniSe() {
        System.out.println("Položka na skladě:");
        oznaceni.predstavSe();
        System.out.println("Cena: "+this.cena+" Kč");
    }
}
