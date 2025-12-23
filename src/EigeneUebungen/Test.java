package EigeneUebungen;

public class Test {
    public static void main(String[] args){
        int x = 5;
        int y = 5;
        int ergebnis;
        boolean richtig = false;

        do {
            ergebnis = x+y;
            if(ergebnis == 10){
                richtig = true;
            }
        }
        while(!richtig);
        System.out.println("Ergebnis: " + ergebnis);
    }
}
