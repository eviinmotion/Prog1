package Lektion9;

public class Pizza {
    String name;
    double[][] preiseUndDurchmesser;

    public Pizza(String name, double[][] preiseUndDurchmesser){
        this.name = name;
        this.preiseUndDurchmesser = preiseUndDurchmesser;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String preisLeistung(){
        double bestesVerhaeltnis= 0.0;
        int besterIndex = 0;
        for(int i = 0; i < preiseUndDurchmesser.length; i++){
            double aktuellerDurchmesser = preiseUndDurchmesser[i][1];
            double aktuellerPreis = preiseUndDurchmesser[i][0];
            double flaeche=((aktuellerDurchmesser/2)*(aktuellerDurchmesser/2))*3.14;
            double preisProQCM = flaeche/aktuellerPreis;
            double aktuellePizza = preisProQCM;
            if(aktuellePizza>bestesVerhaeltnis){
                bestesVerhaeltnis=aktuellePizza;
                besterIndex=i;
            }
        }double siegerDurchmesser = preiseUndDurchmesser[besterIndex][1];
        return "Das beste Preis-Leistungs-Verhältnis hat "+siegerDurchmesser+" cm.";
    }

}
