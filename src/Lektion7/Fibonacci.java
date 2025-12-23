package Lektion7;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboListe(5)+" = richtig");
        int[] arrayfibonacci = fibonacci(5);
        for(int i=0; i<arrayfibonacci.length; i++){
            System.out.print(arrayfibonacci[i]+" ");
        }

    }
    public static int fiboListe(int n) {
        int[] fiboArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        return fiboArray[n - 1];
    }

    public static int[] fibonacci(int n) {
        int[] array = new int[n+1];
        if(n >= 0){
            array[0] = 0;
        }
        if(n >= 1){
            array[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array;

        }
    }



