package EigeneUebungen;
import java.util.Scanner;
public class SmartParser {
    public static int smartParser(){        //nicht fertig
        Scanner scanner = new Scanner(System.in);
        boolean fertig = false;
        int ergebnis = 0;
        do{
            System.out.print("Bitte geben Sie eine Rechenoperation ein: ");
            String eingabe =  scanner.nextLine();
            char[] zeichen = eingabe.toCharArray();
            char[] temp = new char[zeichen.length];
            char[] tempOperator = new char[zeichen.length];
            String out = "";
            boolean richtigeEingabeZahl = false;
            boolean richtigeEingabe = false;
            boolean plus = false;
            boolean minus = false;
            for(int i = 0; i < zeichen.length; i++){
                if(zeichen[i] >= '0' && zeichen[i] <= '9'){
                   richtigeEingabeZahl = true;
                }
                if(zeichen[i] == '+'){
                    plus = true;
                    tempOperator[i] = '+';
                }
                if(zeichen[i] == '-'){
                    minus = true;
                    tempOperator[i] = '-';
                }
                if(richtigeEingabeZahl && (minus ||plus)){
                    richtigeEingabe = true;
                }
            }
            int counterStellenBisOperator = 0;
            String ziffern = "";
            if(richtigeEingabe){
                for(int i = 0; i < zeichen.length; i++){
                    if(zeichen[i] >= '0' && zeichen[i] <= '9'){
                        temp[i] = zeichen[i];
                        counterStellenBisOperator++;
                    }
                    if(zeichen[i] == '+' || zeichen[i] == '-'){
                        for(int j = 0; j < counterStellenBisOperator; j++){
                            ziffern = String.valueOf(temp[j]);
                        }
                        if(zeichen[i] == '+'){
                            ergebnis += Integer.valueOf(ziffern);
                        }
                        if(zeichen[i] == '-'){
                            ergebnis -= Integer.valueOf(ziffern);
                        }
                    }

                }
                fertig = true;

            }

        }while(!fertig);
        return ergebnis;
    }
}
