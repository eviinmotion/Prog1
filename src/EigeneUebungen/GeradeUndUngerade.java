package EigeneUebungen;

public class GeradeUndUngerade {
    public static void main(String[] args){
        int i = 1;
        for (i = 1; i <= 20; i++){
            //System.out.println(i);
            if (i % 2 == 0){
                System.out.println(i+" ist gerade");
            }
            else{
                System.out.println(i+" ist nicht gerade");
            }
        }

    }
}
