package Altklausuren.zoo;

public class Tier {
    private String art;
    private int groesse;
    Tier rechts;
    Tier links;

    public Tier(String art, int groesse){
        this.art = art;
        this.groesse = groesse;
    }
    public String getArt(){
        return this.art;
    }
    public int getGroesse(){
        return this.groesse;
    }

}
