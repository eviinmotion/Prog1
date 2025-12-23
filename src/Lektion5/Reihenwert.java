package Lektion5;

public class Reihenwert {
    public static void main(String[] args){
        double summe = 0;
        double summand;
        int k = 1;
        do {
            summand = 6*(1.0/Math.pow(k, 2));
            summe = summe +summand;

        System.out.println("k = "+k+" Summe: "+summe);
            k++;
        }
        while(summand >= 0.00001);
    }
}
