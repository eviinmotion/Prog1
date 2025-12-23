package Lektion6;

public class Dreieck {
    public static void main(String[] args) {
        pyramide(5);

    }

    public static String sterne(int n) {
        String ergebnis = "";
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    ergebnis += "* ";
                }
                ergebnis += "\n";
            }
        }
        return ergebnis;

    }
    public static void sternetest(int n){
        if (n>0){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<= i; j++){
                    System.out.print("* ");
                }System.out.println();
            }
        }
    }
    public static void pyramide(int n){
        if (n > 0){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<= (n-i); j++){
                    System.out.print("  ");

                }
                for(int k = 1; k <= 2*i-1; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

