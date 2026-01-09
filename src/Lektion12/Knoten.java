package Lektion12;

public class Knoten {
    String wort;
    String bedeutung;
    Knoten rechts;
    Knoten links;

    public Knoten(String wort, String bedeutung){
        this.wort = wort;
        this.bedeutung = bedeutung;
    }
    public String getWort(){
        return wort;
    }
    public String getBedeutung(){
        return bedeutung;
    }
    public char getFirstLetter(){
        return wort.charAt(0);
    }
}
