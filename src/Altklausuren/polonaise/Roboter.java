package Altklausuren.polonaise;

public class Roboter {
    private String name;
    private int groesse;
    Roboter prev;

    public Roboter(String name, int groesse){
        this.name = name;
        this.groesse = groesse;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setGroesse(int groesse){
        this.groesse = groesse;
    }
    public int getGroesse(){
        return this.groesse;
    }
    public String toString(){
        return "Hallo, ich bin "+this.name+", ich bin "+this.groesse+" Zentimeter gross.";
    }
}
