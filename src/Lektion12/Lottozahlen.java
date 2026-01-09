package Lektion12;

public class Lottozahlen {
    int lottozahl;
    Lottozahlen next;

    Lottozahlen(int lottozahl){
        this.lottozahl = (int)(Math.random()*49+1);
        this.next = null;
    }
    public int getLottozahl(){
        return this.lottozahl;
    }

}
