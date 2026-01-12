package Lektion13;

public class Schachbrett {
    //markiert alle bedrohten Felder
    private boolean[][] brett = new boolean[8][8];

    public Schachbrett(){} //setzt brett auf null

    public boolean[][] getBrett() {
        return brett;
    }
    public void setzeTurm(int x, int y){
        if(x <0 || y<0 || x>=8 || y>=8){
            return;
        }
        for(int i = 0; i <8; i++){
            brett[i][y] = true;
            for(int j = 0; j <8; j++){
                brett[x][j] = true;
            }
        }
    }
    public String toString(){
        String out = "";
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(brett[i][j] == false){
                    out += "o  ";
                }
                else{
                    out += "x  ";
                }
            } out += "\n";
        }
        return out;
    }

    public static void main(String[] args){
        Schachbrett brett = new Schachbrett();
        System.out.println(brett.toString());
        brett.setzeTurm(3,5);
        System.out.println(brett.toString());
    }

}
