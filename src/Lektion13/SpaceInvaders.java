package Lektion13;

public class SpaceInvaders {
    private char[][] spielfeld = new char[5][8];
    private char raumschiff = 'v';

    public SpaceInvaders(){
        this.spielfeld = new char[5][8];
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 8; j++){
                spielfeld[i][j] = 'o';
            }
        }
        for(int i = 1; i < 5; i++){
            for(int j = 0; j < 8; j++){
                spielfeld[i][j] = ' ';
            }
        }
        spielfeld[4][zeileRandomRaumschiff()] = raumschiff;
    }
    public int zeileRandomRaumschiff(){
        int zeileV = (int)(Math.random()*8);
        return zeileV;
    }
    public void bewege(String buchstabe){
        if(!buchstabe.equals("a") && !buchstabe.equals("d")){   //und weil bei oder wäre es immer wahr
            System.out.println("Falscher Buchstabe!");
            return;
        }
        if(buchstabe.equals("a")){
            for(int i = 4; i < 5; i++){
                for(int j = 0; j < 8; j++){
                    if(spielfeld[i][j] == raumschiff && spielfeld[i][j] != spielfeld[4][0]){
                        spielfeld[i][j] = ' ';
                        spielfeld[i][j-1] = raumschiff;
                    }
                }
            }
        }
        if(buchstabe.equals("d")){
            for(int i = 4; i < 5; i++){
                for(int j = 0; j < 8; j++){
                    if(spielfeld[i][j] == raumschiff && spielfeld[i][j] != spielfeld[4][7]){
                        spielfeld[i][j] = ' ';
                        spielfeld[i][j+1] = raumschiff;
                    }
                }
            }
        }
    }
    public void printGame(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(" "+spielfeld[i][j]+" ");
            }
            System.out.println();
        }
    }

    public String toString(){
        String output = "";
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 8; j++){
                output += spielfeld[i][j];
            }output += "\n";
        }
        return output;
    }


    public static void main(String[] args){
        SpaceInvaders newGame = new SpaceInvaders();
        newGame.printGame();
        newGame.bewege("a");
        newGame.printGame();
        newGame.bewege("d");
        newGame.printGame();
    }

}
