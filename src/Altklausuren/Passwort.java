package Altklausuren;

public class Passwort {
    private String passwort;

    public Passwort(String passwort) {
        if (alsPWgeeignet(passwort)) {
            this.passwort = passwort;
        } else {
            this.passwort = null;
        }
    }

    public boolean alsPWgeeignet (String zeichenkette){
        char[] passwort = zeichenkette.toCharArray();
        int counterGB = 0;
        int counterKB = 0;
        int counterZiffern = 0;
        boolean mindAchtZeichen = false;
        if (passwort.length >= 8) {
            mindAchtZeichen = true;
            for (int i = 0; i < passwort.length; i++) {
                if (passwort[i] >= 'a' && passwort[i] <= 'z') {
                    counterKB++;
                }
                if (passwort[i] >= 'A' && passwort[i] <= 'Z') {
                    counterGB++;
                }
                if (passwort[i] >= '0' && passwort[i] <= '9') {
                    counterZiffern++;
                }

            }
            if (counterKB >= 2 && counterGB >= 2 && counterZiffern >= 2) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        if(this.passwort == null){
            return "Kein gültiges Passwort!";
        }
        String out = "";
        char[] passwort = this.passwort.toCharArray();
        for(int i = 0; i < passwort.length; i++){
            out += "*";
        }
        return out;
    }

    public boolean pwAendern(String passwort){
        if(this.passwort == null){
            return false;
        }
        char[] passwortAlt = this.passwort.toCharArray();
        char[] passwortNeu = passwort.toCharArray();
        if(alsPWgeeignet(passwort)){
            if(passwortAlt[0] != passwortNeu[0] && passwortAlt[passwortAlt.length-1] != passwortNeu[passwortNeu.length-1]){
                this.passwort = passwort;
                return true;
            }
        }
        return false;
    }
}

