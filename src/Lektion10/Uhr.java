package Lektion10;

public class Uhr {
    private int stunden;
    private int minuten;
    private int sekunden;

    public Uhr(int stunden, int minuten, int sekunden) {
        if(stunden <0 || stunden > 23 || minuten <0 || minuten > 59 || sekunden <0 || sekunden > 59){
            this.stunden = 12;
            this.minuten = 00;
            this.sekunden = 00;
        } else{
            this.stunden = stunden;
            this.minuten = minuten;
            this.sekunden = sekunden;
        }
    }
    public int getStd(){
        return stunden;
    }
    public int getMin(){
        return minuten;
    }
    public int getSek(){
        return sekunden;
    }
    public void setUhr(int stunden, int minuten, int sekunden) {
        if(stunden < 0|| stunden > 23){
            System.out.println("Ungültig");
        }else{ this.stunden = stunden; }
        if(minuten<0 || minuten>59){
            System.out.println("Ungültig");
        }else{ this.minuten = minuten; }
        if(sekunden<0 || sekunden>59){
            System.out.println("Ungültig");
        }else{ this.sekunden = sekunden; }
    }
    public void naechsteSek() {
        this.sekunden=this.sekunden+1;
        if(this.sekunden>59){
            this.sekunden = 0;
            this.minuten++;
            if(this.minuten>59){
                this.minuten = 0;
                this.stunden++;
                if(this.stunden>23){
                    this.stunden = 0;
                }
            }
        }
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", getStd(), getMin(), getSek());
    }
}
