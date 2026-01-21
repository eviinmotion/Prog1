package Altklausuren;

public class Mosaikpuzzle {
    private boolean[][] motiv;

    public Mosaikpuzzle(boolean[][] motiv) {
        this.motiv = motiv;
    }
    public int ermittleHinweiszahl(int zeile, int spalte){
        int counter = 0;
        for(int i = zeile-1; i <= zeile+1; i++){            //i sind die zeilen bsp laufe bis 4 zeige bis 4+2 an
            for(int j = spalte-1; j < spalte+1; j++){       //j sind die spalten bsp laufe bis 3 zeige bis 3+2 an
                if(i >= 0 && i < motiv.length && j >= 0 && j < motiv[i].length){    //wenns im raum der matrix ist ausführen
                    if(motiv[i][j] == true){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
    public int[][] erstelleHinweisMatrix(int zeile, int spalte){
        int zeilenAnzahl = motiv.length;
        int spaltenAnzahl = motiv[0].length;
        int[][] hinweisMatrix = new int[zeilenAnzahl][spaltenAnzahl];
        for(int i = 0; i < zeilenAnzahl; i++){
            for(int j = 0; j < spalte; j++){
                hinweisMatrix[i][j] = ermittleHinweiszahl(i, j);
            }
        }
        return hinweisMatrix;
    }
}
