package Lektion11;

public class TicTacToeKlasse {
    private boolean[][][] ticTacToe;
    String x;
    String o;

    public TicTacToeKlasse(){
        ticTacToe = new boolean[3][3][3];
        for(int i = 0; i <3; i++){
            for(int j= 0; j <3; j++){
                for(int k = 0; k<3; k++){
                    ticTacToe[i][j][k] = random();
                }
            }
        }
    }
    public boolean random(){
        int random = (int)(Math.random()*2);
        if(random == 0){
            return false;
        }
        else{ return true;}
    }
    public void printTicTacToe(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    if(ticTacToe[i][j][k]){
                        System.out.print("X ");
                    }
                    else{
                        System.out.print("O ");}
                }
                System.out.print("\n");
            }System.out.print("\n");
        }
    }
    public static void main(String[] args){
        TicTacToeKlasse tictactoe = new TicTacToeKlasse();
        tictactoe.printTicTacToe();
    }

}
