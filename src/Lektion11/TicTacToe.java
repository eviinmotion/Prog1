package Lektion11;

import java.util.Random;

public class TicTacToe {
    public static void main(String[] args){
        boolean[][][] ticTacToe = new boolean[3][3][3];
        String x = "X";
        String o = "O";

        for(int i = 0; i<ticTacToe.length; i++){
            for(int j = 0; j<ticTacToe[0].length; j++){
                for(int k = 0; k<ticTacToe[0][0].length; k++){
                    ticTacToe[i][j][k] = randomBoolean();
                }
            }
        }
        String[][][] ticTacToeString = new String[3][3][3];

        for(int i = 0; i<ticTacToe.length; i++){
            for(int j = 0; j<ticTacToe[0].length; j++){
                for(int k = 0; k<ticTacToe[0][0].length; k++){
                    ticTacToeString[i][j][k] = String.valueOf(ticTacToe[i][j][k]);
                    }
                }
            }
        for(int i = 0; i<ticTacToeString.length; i++){
            for(int j = 0; j<ticTacToeString[0].length; j++){
                for(int k = 0; k<ticTacToeString[0][0].length; k++){
                    if(ticTacToeString[i][j][k] == "true"){
                        ticTacToeString[i][j][k] = x;
                    }
                    else{ ticTacToeString[i][j][k] = o;}
                }
            }
        }
        for(int i = 0; i<ticTacToeString.length; i++){
            for(int j = 0; j<ticTacToeString[0].length; j++){
                for(int k = 0; k<ticTacToeString[0][j].length; k++){
                    System.out.print(ticTacToeString[i][j][k]+"  ");
                    System.out.print(" |   ");
                }
              System.out.println("\n");}
            System.out.println("\n");
        }

    }
    public static boolean randomBoolean(){
        Random random  = new Random();
        boolean out;
        int zufallsZahl = random.nextInt(20)+1;
        if(zufallsZahl % 2 == 0){
            out=true;
        }
        else{out = false;}
        return out;
    }
}
