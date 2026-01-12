package Lektion13;

public class Muetze {
    private int wert;
    private String farbe;
    Muetze prev;

    public Muetze(int wert, String farbe){
        if(wert >=1 && wert <= 100){
            this.wert = wert;
        }
        else{ this.wert = 50;} //mittel als wert wenn nichts gültig
    }
    public int getWert(){
        return this.wert;
    }
    public String getFarbe(){
        return this.farbe;
    }
}
