package Altklausuren;

public class VielfachesVonDrei {
    public static int vielfachesVonDrei(int[] zahlen){
        int counter = 0;
        for(int i = 0; i < zahlen.length; i++){
            if(zahlen[i] % 3 == 0){
                counter++;
            }
        }
        return counter;
    }
}
