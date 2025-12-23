package Lektion6;

public class fakrekursiv {
    public static long fak(int n) {
        long ergebnis;
        if (n == 0) {
            return 1;
        }
        else {
            ergebnis = 1;
            for (int i = 1; i <= n; i++) {
                ergebnis = ergebnis * i;

            }
        }
        return ergebnis;
    }
    public static long fakrekursiv(int n){
        if (n == 0){
            return 1;
        }
        else{
            return fakrekursiv(n-1)*n;
        }
    }

    public static void main(String[] args) {

        System.out.println(fak(4));
        System.out.println(fakrekursiv(4));

    }
}
