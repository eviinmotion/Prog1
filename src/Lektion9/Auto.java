package Lektion9;

public class Auto {
    String marke;
    int hubraum;
    String farbe;
    int tueren;

    public static int anzahlAutos = 0;

    public Auto(String marke, int hubraum, String farbe, int tueren){
        this.marke = marke;
        if(hubraum > 0){
            this.hubraum = hubraum;
        }else{this.hubraum = 1600;}
        this.farbe = farbe;
        this.tueren = tueren;
        anzahlAutos++;
    }
    public int getHubraum(){
        return hubraum;
    }
    public void setHubraum(int ccm){
        if(ccm >0){
            this.hubraum = ccm;
        }
    }
}
