package Altklausuren;

public class Knoten {
    private Mannschaft team;
    Knoten rechts;
    Knoten links;

    public Knoten(Mannschaft team){
        this.team = team;
    }

    public Mannschaft getTeam() {
        return team;
    }

}
