package Lektion13;

public class PolizeiAufgabe {
    public static double berechneMasse(double volumenGetraenk, double alkoholAnteil){
        double alkinProzent = alkoholAnteil/100;
        double masse = volumenGetraenk*alkinProzent*0.8;
        return masse;
    }
    public static double berechneAlkKonzentration(double alkoholMasse, double gewicht, char geschlecht){
        boolean korrektesGeschlecht = false;
        double ergebnis = 0;
        while(!korrektesGeschlecht){
            try{
                if(geschlecht != 'm' && geschlecht != 'w' && geschlecht != 'j') {
                    throw new RuntimeException("Ungültige Eingabe beim Geschlecht!"); //throw muss in die if Abfrage
                }
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
                return -1.0;                        //hier abbrechen wenn falsche Eingabe
            }
            if(geschlecht == 'm'){
                ergebnis = (berechneMasse(gewicht, geschlecht))/(gewicht*0.7);
                korrektesGeschlecht = true;
            }
            if(geschlecht == 'w'){
                ergebnis = (berechneMasse(gewicht, geschlecht))/(gewicht*0.6);
                korrektesGeschlecht = true;
            }
            if(geschlecht == 'j'){
                ergebnis = (berechneMasse(gewicht, geschlecht))/(gewicht*0.5);
            }
        }return ergebnis;
    }
    public static void main(String[] args){
        double rum = berechneMasse(70, 40);
        System.out.println("Die Alkoholmasse Ihres Getränks lautet: "+rum);
        double mann = berechneAlkKonzentration(rum, 70, 'm');
        System.out.println("Ihre Alkoholkonzentration lautet: "+mann);
        if(mann >= 0.5){
            System.out.println("Sie dürfen kein Auto mehr fahren!!!");
        }
        if(mann >= 0.3 && mann < 0.5){
            System.out.println("Sie sollten kein Auto mehr fahren!!!");
        }
    }
}
