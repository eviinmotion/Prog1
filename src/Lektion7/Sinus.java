package Lektion7;

public class Sinus {
    public static void main(String[] args){
        System.out.println(sin(5));
    }
    public static double sin(double x){
        double zaehler = x;
        double nenner = 1.0;
        double summe = x;
        double summand = x;
        double toleranz = 0.000000000000001;

        for(int i = 1; summand > toleranz || summand < -toleranz; i++ ){
            double fak= (2*i)*(2*i+1);
            zaehler = zaehler*x*x*(-1);
            nenner = nenner*fak;
            summand = zaehler/nenner;
            summe = summe+summand;
        }

        return summe;
    }
}
