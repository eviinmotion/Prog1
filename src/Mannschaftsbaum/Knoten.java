package Mannschaftsbaum;

public class Knoten {
    private Mannschaft team;
    Knoten rechts;
    Knoten links;

    public Knoten(Mannschaft team){
        this.team = team;
    }

    public Knoten getLinks(){
        return this.links;
    }
    public Knoten getRechts(){
        return this.rechts;
    }

    public Mannschaft getTeam(){
        return this.team;
    }
}
