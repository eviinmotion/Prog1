package Altklausuren;

public class Tabelle {
    private boolean[][] tabelle = new boolean[8][8];
    private int counter = 0;

    public Tabelle(){
        for(int i = 0; i < 8; i++){                     //keine neue instanziierung vom boolean array, da schon als instanzattribut
            for(int j = 0; j < 8; j++){
                int zufall = (int)(Math.random()*2);
                if(zufall == 1){
                    this.tabelle[i][j] = true;
                    this.counter++;
                }
                else{
                    this.tabelle[i][j] = false;
                }
            }
        }
    }
    public int getCounter(){
        return this.counter;
    }

    public String toString(){
        String output = "";
        char[][] tabelle = new char[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(this.tabelle[i][j] == true){
                    tabelle[i][j] = '1';
                    output += tabelle[i][j];
                }
                else if(this.tabelle[i][j] == false){
                    tabelle[i][j] = '0';
                    output += tabelle[i][j];
                }
            }output += "\n";
        }
        return output;
    }

}
