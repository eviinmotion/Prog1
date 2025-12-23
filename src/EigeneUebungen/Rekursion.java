package EigeneUebungen;

public class Rekursion {
    public static void main (String[]args){
        baumfaellen(5);
        System.out.println(addrueck(5));
    }
    public static void baumfaellen(int a){
        System.out.println("hacken");
        if(a==1){
            System.out.println("Baum fällt!");
        }
        else{
            baumfaellen(a-1);
        }

    }
    public static int addrueck(int a){
        if(a==0){
            return 0;
        }
        else{
            return a+ addrueck(a-1);
        }
    }

}
