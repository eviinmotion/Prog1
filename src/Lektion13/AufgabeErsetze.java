package Lektion13;

public class AufgabeErsetze {
    public static int ersetze(char[] dateiname){
        int counter = 0;
        for(int i=0; i<dateiname.length-4; i++){
            if(dateiname[i] == '.'){
                dateiname[i] = '_';
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        String datei = "Graphik.Init.Datei.ini";
        char[] altdatei = datei.toCharArray();
        int anzahl = ersetze(altdatei);
        for(int i=0; i<altdatei.length; i++){
            System.out.print(altdatei[i]);
        }
    }
}
