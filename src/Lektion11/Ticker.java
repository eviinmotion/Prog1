package Lektion11;

public class Ticker {
    private char[] nachricht;
    int groesse;


    public Ticker(int groesse){
        if(groesse <= 0 ){
            this.groesse = 200;
        }
        else{
            this.groesse = groesse;
        }
        this.nachricht = new char[this.groesse];
        resetNachricht(' ');
    }
    public int getGroesse(){
        return this.groesse;
    }
    public void setNachricht(char[] nachricht) {
        for (int i = 0; i < this.groesse; i++) {
            if (i < nachricht.length) {
                this.nachricht[i] = nachricht[i];
            } else {
                this.nachricht[i] = '+';
            }
        }
    }
    public char[] getNachricht(){
        char[] kopieNachricht = new char[this.groesse];
        for(int i=0; i<this.groesse; i++){
            kopieNachricht[i] = this.nachricht[i];
        }
        return kopieNachricht;
    }
    public void resetNachricht(char zeichen){
        for(int i=0; i<this.nachricht.length; i++){
            this.nachricht[i] = zeichen;
        }
    }
    public void resetNachricht(){
        resetNachricht('+');
    }
    public void rotateNachricht(int distance){
        char[] nachricht = this.nachricht;
        if(distance <= 0 || distance >= this.groesse){
            return;
        }
        for(int i=0; i<distance; i++){
            char first = nachricht[0];
            for(int j=0; j<this.groesse-1; j++){
                nachricht[j] = nachricht[j+1];
            }
            nachricht[this.groesse-1] = first;
        }
    }
    public char[] stringToCharArray(String nachricht){
        char[] input = nachricht.toCharArray();
        return input;
    }
}