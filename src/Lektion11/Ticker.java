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
        this.nachricht = new char[groesse];
        for(int i=0; i<groesse; i++){
            this.nachricht[i] = ' ';
        }
    }
    public int getGroesse(){
        return this.groesse;
    }
    public String setNachricht(char[] nachricht) {
        char[] input = nachricht;

        if (input.length < this.groesse) {
            for(int i=0; i<this.groesse; i++){
                input[i] = this.nachricht[i];
            }
            for (int i = 0; i < input.length; i++) {
                if (input[i] == ' ') {
                    input[i] = '+';
                }
            }
        }
        if (input.length > this.groesse) {
            try {
                for (int i = 0; i < input.length; i++) {
                    input[i] = (char) nachricht.length;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return input.toString();
            }

        }
        return input.toString();
    }
    public char[] getNachricht(){
        return this.nachricht;
    }
    public String resetNachricht(char zeichen){
        char[] input = getNachricht();
        for(int i=0; i<input.length; i++){
            input[i] = zeichen;
        }
        return input.toString();
    }
    public String resetNachricht(){
        return resetNachricht('+');
    }
    public String rotateNachricht(char zeichen){
        
    }
}