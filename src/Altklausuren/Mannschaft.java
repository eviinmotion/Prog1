package Altklausuren;

public class Mannschaft {
    private String name;
    private int tore;
    private int gegentore;

    public Mannschaft(String name){
        this.name = name;
        this.tore = 0;
        this.gegentore = 0;
    }
    public void setGeschosseneTore(int tore){
        this.tore = tore;
    }
    public void setGegentore(int tore){
        this.gegentore = tore;
    }
    public int getGeschosseneTore(){
        return this.tore;
    }
    public int getGegentore(){
        return this.gegentore;
    }
}
