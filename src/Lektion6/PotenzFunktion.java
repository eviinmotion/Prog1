package Lektion6;

public class PotenzFunktion {
    public static void main(String[] args) {
        System.out.println(pow(2, 2));
    }

    public static int pow(int b, int p) {
        if(p == 0){
            return 1;
        }
        else{
            return b * pow(b, p-1);
        }

    }
}

