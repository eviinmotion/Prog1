package Lektion7;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("Übung Programmieren 1"));
    }
    public static String reverse(String input) {
        char[] in = input.toCharArray();
        String out="";
        for (int i = input.length()-1; i >= 0; i--) {
            out += in[i];
        }
        return out;
    }
}
