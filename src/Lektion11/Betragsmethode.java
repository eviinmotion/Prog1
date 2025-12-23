package Lektion11;

public class Betragsmethode {
    public static int betragsMethode(int nummer){
        if(nummer < 0){
            nummer = nummer*(-1);
        }
        return nummer;
    }
    public static float betragsMethode(float nummer){
        if(nummer < 0){
            nummer = nummer*(-1.0f);
        }
        return nummer;
    }
    public static double betragsMethode(double nummer){
        if(nummer < 0){
            nummer = nummer*(-1.0);
        }
        return nummer;
    }
    public static short betragsMethode(short nummer){
        if(nummer < 0){
            nummer = (short) (nummer*(-1));
        }
        return nummer;
    }
    public static long betragsMethode(long nummer){
        if(nummer < 0){
            nummer = (long) (nummer*(-1.0));
        }
        return nummer;
    }
}
