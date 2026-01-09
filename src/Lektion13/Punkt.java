package Lektion13;

public class Punkt {
    private double xAchse;
    private double yAchse;
    private double zAchse;

    public Punkt(double xAchse, double yAchse, double zAchse) {
        this.xAchse = xAchse;
        this.yAchse = yAchse;
        this.zAchse = zAchse;
    }
    public double getXAchse() {
        return xAchse;
    }
    public void setXAchse(double xAchse) {
        this.xAchse = xAchse;
    }
    public double getYAchse() {
        return yAchse;
    }
    public void setYAchse(double yAchse) {
        this.yAchse = yAchse;
    }
    public double getZAchse() {
        return zAchse;
    }
    public void setZAchse(double zAchse){
        this.zAchse = zAchse;
    }
    public double wurzelZiehen(double punkt){
        if(punkt <= 0){ return 0;}
        double abstand = 0;
        double altWert = punkt;
        double neuWert=0;
        double diff =0;
        do{
            neuWert = 0.5*(altWert + punkt/altWert);
            altWert = neuWert;
            diff = altWert - neuWert;
            if(diff < 0.000001){
                diff = -diff;
            }
        }while(diff > 0.00001);
        return altWert;
    }
    public double berechneAbstand(){
        double xQuadrat = this.xAchse*this.xAchse;
        double yQuadrat = this.yAchse*this.yAchse;
        double zQuadrat = this.zAchse*this.zAchse;
        double sum = xQuadrat + yQuadrat + zQuadrat;
        double abstand = wurzelZiehen(sum);
        return abstand;
    }
    public String toString(){
        return "a="+xAchse+"b="+yAchse+"z="+zAchse;
    }

}
