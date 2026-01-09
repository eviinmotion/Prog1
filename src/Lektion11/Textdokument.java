package Lektion11;

public class Textdokument {
    public static int zaehleZeichen(char[][] text){
        int counter = 0;
        for(int i = 0; i <text.length; i++){
            if (text[i] != null) {
                for(int j = 0; j < text[i].length; j++){
                    if(text[i][j] != ' '){
                        counter++;
                    }
            }
            }
        }
        return counter;
    }
    public static boolean vertauscheZeilen(int zeile1, int zeile2, char[][] text){
        int maxZeile = text.length;
        if(zeile1 >= maxZeile || zeile2 >= maxZeile || zeile1 < 0 || zeile2 < 0){
            return false;
        }
        char[] temp = text[zeile1];
        text[zeile1] = text[zeile2];
        text[zeile2] = temp;
        return true;
    }


}
