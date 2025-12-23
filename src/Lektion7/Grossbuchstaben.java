package Lektion7;
import java.util.Arrays;
public class Grossbuchstaben {
    public static void main(String[] args) {

        System.out.println(inGrossbuchstaben("spiel"));

    }
    public static String inGrossbuchstaben(String input){
        char[] array = input.toCharArray();
        String out = "";
        char buchstabe;
        for (int i = 0; i < array.length; i++){
            buchstabe = array[i];

            if(buchstabe >='a' &&  buchstabe <='z'){
                char grossbuchstabe = (char) (buchstabe-32);
                out += grossbuchstabe;
            }
            else{
                out += buchstabe;
            }
        }
        return out;


    }
}



