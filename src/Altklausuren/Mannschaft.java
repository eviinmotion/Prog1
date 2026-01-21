package Altklausuren;

public class Mannschaft {
    private String name;
    private int geschosseneTore;
    private int gegentore;

    public Mannschaft(String name){
        this.name = name;
        this.geschosseneTore = 0;
        this.gegentore = 0;
    }
    public void setGeschosseneTore(int tore){
        this.geschosseneTore = tore;
    }
    public void setGegentore(int tore){
        this.gegentore = tore;
    }
    public int getGeschosseneTore(){
        return this.geschosseneTore;
    }
    public int getGegentore(){
        return this.gegentore;
    }
}
