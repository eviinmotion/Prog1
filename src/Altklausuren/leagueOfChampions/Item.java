package Altklausuren.leagueOfChampions;

public class Item {
    private int costs;
    private int bonusDamage;
    Item next;

    public Item(int bonusDamage, int costs){
        this.costs = costs;
        this.bonusDamage = bonusDamage;
    }
    public int getCosts(){
        return this.costs;
    }
    public int getBonusDamage(){
        return this.bonusDamage;
    }
}
