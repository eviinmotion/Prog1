package Lektion10;

import Lektion8.Auto;

public class AutoFabrik {
    private int anzahlAutos;

    public void produziere(){
        Auto auto = new Auto();
        this.anzahlAutos++;
        System.out.println(anzahlAutos);
    }

}
