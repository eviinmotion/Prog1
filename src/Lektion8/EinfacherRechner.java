package Lektion8;

public class EinfacherRechner {
    public static void main(String[] args){
    String operator = args[args.length-1];
    int ergebnis = Integer.parseInt(args[0]);
    for (int i = 1; i < args.length-1; i++){
        int aktuelleZahl = Integer.parseInt(args[i]);
        if(operator.equals("+")){
            ergebnis = ergebnis+aktuelleZahl;
        }
        else{
            ergebnis = ergebnis-aktuelleZahl;
        }
    }
    System.out.print(ergebnis);
    }
    public static int einfacherRechner(int[] zahlen, char operator) {
        zahlen= new int[zahlen.length];
        int letzteZahl = zahlen[zahlen.length-1];
        int ergebnis = 0;
        if (operator == '+'){
            for (int i = 0; i < zahlen.length; i++){
                ergebnis += zahlen[i];
            }

        }else if (operator == '-'){
            for (int i = 0; i < zahlen.length-1; i++){
                ergebnis += zahlen[i];
                ergebnis = ergebnis-zahlen[0];
            }
        }return ergebnis;
    }
}
