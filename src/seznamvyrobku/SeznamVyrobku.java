package seznamvyrobku;

public class SeznamVyrobku {

    public static void main(String[] args) {
        Vyrobek x = new Vyrobek("Cvok-2016");
        x.predstavSe();
        
        x.setRok(2015);
        x.predstavSe();
        
        x.setZkratka("Trouba");
        x.predstavSe();
    }
}
