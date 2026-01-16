package Altklausuren;

public class harmonischeReihe {
    public void harmonischeReihe(int k){
        for(int i=0; i <= 10000; i++){
            int potenz = k+1;
            double ergebnis = -1;
            for(int j = 0; j < potenz; j++){
                ergebnis = ergebnis*ergebnis;
            }
            double temp = ergebnis/k;
            ergebnis = temp;

            System.out.println(ergebnis);
        }

    }
}
