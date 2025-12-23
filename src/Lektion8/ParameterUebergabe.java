package Lektion8;

public class ParameterUebergabe {
    public static void main(String[] args) {
        int ergebnis = 0;
        if(args.length >= 3){
            System.out.println("Sie haben mehr als zwei Zahlen eingegeben!");
        }else{
            int zahlEins = Integer.parseInt(args[0]);
            int zahlZwei = Integer.parseInt(args[1]);
            ergebnis = zahlEins*zahlZwei;
        }
        System.out.println(ergebnis);
    }
}
