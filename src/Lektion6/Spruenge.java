package Lektion6;

public class Spruenge {
    public static void main(String[] args){
        System.out.println(spruengeInMehrerenSpruengen(8,2,3));
    }
    public static int spruengeInMehrerenSpruengen(int distanz, int meterEins, int meterZwei){
        if(distanz % meterEins == 0){
            return 1;
        }
        if(distanz < 0){
            return 0;
        }
        return spruengeInMehrerenSpruengen(distanz - meterEins, meterZwei, meterEins)+
        spruengeInMehrerenSpruengen(distanz -meterZwei, meterEins, meterZwei);
    }
}
