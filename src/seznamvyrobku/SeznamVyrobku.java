package seznamvyrobku;

import java.util.ArrayList;

public class SeznamVyrobku {

    public static void main(String[] args) {
        // otestujeme vytvoření objektu
        Vyrobek x = new Vyrobek("Cvok-2016");
        x.predstavSe();
        // otestujeme metody ze třídy Vyrobek
        x.setRok(2015);
        x.predstavSe();
        x.setZkratka("Trouba");
        x.predstavSe();
        
        // otestujeme seznam výroků na skladě
        // nejprve pole (statický návrh, max 100 položek)
        Sklad[] nasklade = new Sklad[100];
        nasklade[0] = new Sklad("Jouda-2000", 30);
        nasklade[0].vytiskniSe();
        
    }
}
