package Lektion13;

public class OnlineShopAufgabe {
    public static char[] wandleUmInCents(String preis) {
        String preisOhneKomma = preis.replace(",", "");
        char[] output = preisOhneKomma.toCharArray();
        for (int i = 0; i < output.length-1; i++) {
            if (output[i] == '0') {
                output[i] = ' ';
            }
        }
        return output;
    }
    public static void main(String[] args){
        System.out.print(wandleUmInCents("1,99"));
        System.out.print(wandleUmInCents("0,99"));
        System.out.print(wandleUmInCents("0,09"));
        System.out.print(wandleUmInCents("0,90"));
    }
}
