package Lektion8;
import java.util.Scanner;
public class PasswortGenerator {
    public static char grossBuchstabe(char klein){
        if(klein >= 'a' && klein <= 'z'){
           return (char)(klein-32); 
        }
        return klein;
    }
    public static char kleinBuchstabe(char gross){
        if(gross >='A'&& gross <= 'Z'){
            return(char)(gross+32);
        }
        return gross;
    }
    public static String passwordReverse(String satz){
        satz = satz+" ";
        char[] satzMitSonderzeichen = satz.toCharArray();
        String passwortFertig = "";
        boolean klein = true;
        char[] zeichenZwischenspeicher = new char[satzMitSonderzeichen.length];
        for (int i = 0; i < satzMitSonderzeichen.length; i++) {
            if(satzMitSonderzeichen[i] == ' ') {
                if (i > 0) { // Schutz vor Index-Fehler
                    char vorherigesZeichen = satzMitSonderzeichen[i - 1];
                    char checkChar = kleinBuchstabe(vorherigesZeichen);
                    boolean istEinBuchstabe = (checkChar >= 'a' && checkChar <= 'z');

                    if (istEinBuchstabe) {

                        if (klein) {
                            passwortFertig += kleinBuchstabe(vorherigesZeichen);
                        } else {
                            passwortFertig += grossBuchstabe(vorherigesZeichen);
                        }
                        klein = !klein;
                    }
                }
            }
            else if(satzMitSonderzeichen[i] == '!'||satzMitSonderzeichen[i] =='?'||satzMitSonderzeichen[i]==':'||satzMitSonderzeichen[i]=='%'){
                zeichenZwischenspeicher[i] = satzMitSonderzeichen[i];
                passwortFertig += zeichenZwischenspeicher[i];
            }
        }if(passwortFertig.length() <= 14 && passwortFertig.length() >=7){
            return passwortFertig;
        }else{ return passwortFertig;}
    }


    public static String passwordGenerator(String satz){
        char[] satzMitSonderzeichen = satz.toCharArray();
        String passwortFertig = "";
        char[] zeichenZwischenspeicher = new char[satzMitSonderzeichen.length];
        passwortFertig += satz.charAt(0);
        for (int i = 0; i < satzMitSonderzeichen.length; i++) {
            if (satzMitSonderzeichen[i] == ' ') {
                if(satzMitSonderzeichen.length > i+1) {
                    zeichenZwischenspeicher[i] = satzMitSonderzeichen[i + 1];
                    passwortFertig += zeichenZwischenspeicher[i];
                }
            }
            else if(satzMitSonderzeichen[i] == '!'||satzMitSonderzeichen[i] == '?'|| satzMitSonderzeichen[i] == ':'|| satzMitSonderzeichen[i] =='%' ){
                zeichenZwischenspeicher[i] = satzMitSonderzeichen[i];
                passwortFertig += zeichenZwischenspeicher[i];
            }
        }
        if(passwortFertig.length() <= 14 && passwortFertig.length() >= 7){
        return passwortFertig;
        }
        else{
            return passwortFertig;}

    }


    public static void main(String [] args){
        System.out.println(passwordGenerator("Hello world, I'm your wild girl, I'm your ch-ch-ch-ch-ch-ch-cherry bomb!"));
        System.out.println(passwordReverse("Ich gehe morgen mit meinen 11 Freund*innen zum Essen!"));
    }
}
