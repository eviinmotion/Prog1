package Mannschaftsbaum;

public class Mannschaft {
    private String name;
    private int tore;
    private int gegentore;

    public Mannschaft(String name){
        this.name = name;
        this.tore = 0;
        this.gegentore = 0;
    }

    public void setTore(int tore){
        this.tore = tore;
    }

    public void setGegentore(int gegentore){
        this.gegentore = gegentore;
    }
    public String getName(){
        return this.name;
    }

    public int getTore(){
        return this.tore;
    }
    public int getGegentore(){
        return this.gegentore;
    }
}
