package Altklausuren;
import java.util.Scanner;
public class LiesZahl {
    public static int liesZahl(){
        Scanner scanner = new Scanner(System.in);
        int output =0;
        boolean zahlEingegeben = false;
        while(!zahlEingegeben){
            System.out.print("Bitte Zahl eingegeben: ");
            String eingabe = scanner.next();
            char[] zeichen = eingabe.toCharArray();
            boolean fehler = false;

            for(int i =0; i < zeichen.length; i++){
                if(zeichen[i] < '0' || zeichen[i] > '9'){  //wenns negativ ist oder was anderes eingegeben wurde
                    zahlEingegeben = false;
                    fehler = true;
                    break;
                }
            }
            if(!fehler && zeichen.length > 0){
                output = Integer.valueOf(eingabe);
                zahlEingegeben = true;
            }
        }
        return output;
    }
}
