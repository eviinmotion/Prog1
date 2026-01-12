package Lektion13;

public class Getraenk {
    private String name;
    private String fuellstand;
    private int preisInCent;
    Getraenk prev;
    Getraenk next;

    public Getraenk(String name, String fuellstand, int preisInCent){
        this.name = name;
        this.fuellstand = fuellstand;
        this.preisInCent = preisInCent;
    }

    public String getName(){
        return this.name;
    }
    public int getPreisInCent(){
        return this.preisInCent;
    }
    private String getFuellstand(){
        return this.fuellstand;
    }
}
