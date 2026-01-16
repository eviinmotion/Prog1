package Altklausuren;

public class QuadratPrint {
    public static void printQuadrat(int zeilen){
        char[][] quadrat = new char[zeilen][zeilen];
        for(int i=0; i<quadrat.length; i++){                //erste Zeilen befüllen
            for(int j=0; j<quadrat.length; j++){
                if(i == 0 || i == zeilen-1 || j == 0 || j == zeilen-1 ){ //wenn rand dann Stern
                    quadrat[i][j] = '*';
                }
                else{                   //sonst leer
                    quadrat[i][j] = ' ';
                }
            }
        }
        for(int i=0; i<quadrat.length; i++){
            for(int j=0; j<quadrat.length; j++){
                System.out.print(quadrat[i][j]+" "); //print damit kein zeilenumbruch
            }
            System.out.println();           //zeilenumbruch für quadratische form
        }
    }
    public static void main(String[] args){
        printQuadrat(4);
    }
}
