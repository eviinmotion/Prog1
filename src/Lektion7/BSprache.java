package Lektion7;

public class BSprache {
    public static void main(String[] args) {
        System.out.println(spielen("spiel mit mir"));
        System.out.println(spielenTest("mit"));

    }

    public static String spielenTest(String input) {
        String wort = input;
        int laengeArray = 0;
        char[] array = input.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(array[i] == 'a'|| array[i] == 'e' || array[i]=='i'|| array[i]=='o'|| array[i]=='u'){
                laengeArray += +3;
            }
            else{
                laengeArray += +1;
            }
        }
        char[] neuesArray = new char[laengeArray];
        for(int i = 0; i < neuesArray.length; i++){
            if(array[i] == 'a'|| array[i] == 'e' ||array[i] == 'i'|| array[i]=='o'|| array[i]=='u'){
                
            }
        }

        return String.valueOf(laengeArray);


    }
    public static String spielen(String input) {
        char[] in = input.toCharArray();
        String out = "";

        for (int i = 0; i < in.length; i++) {
            if (in[i] == 'a' || in[i] == 'e' || in[i] == 'i' || in[i] == 'o' || in[i] == 'u') {
                char aktuellerBuchstabe = in[i];

                out += aktuellerBuchstabe + "b" + aktuellerBuchstabe;
            } else {
                char aktuellerBuchstabe = in[i];
                out += aktuellerBuchstabe;
            }
        }
        return out;
    }
}

