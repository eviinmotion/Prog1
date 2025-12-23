package EigeneUebungen;

public class EulerscheZahl {
    public static void main(String[] args){
        double e = 0.0;
        double term1= 1.0;
        double toleranz = 0.000001;
        double gliedNeu = 1;
        e = term1 +e;

        for(int i = 1; gliedNeu > toleranz ; i++){
            gliedNeu = gliedNeu/i;
            e = e+gliedNeu;

        }
        if(e >= Math.E-toleranz){
            System.out.println("Mein Algorithmus "+e);
            System.out.println("Die Eulersche Zahl "+Math.E);
        }





    }
}
