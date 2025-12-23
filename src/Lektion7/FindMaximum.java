package Lektion7;

public class FindMaximum {

    public static int findMaximum(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;

    }
}
