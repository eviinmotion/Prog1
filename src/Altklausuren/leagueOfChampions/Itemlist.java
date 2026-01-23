package Altklausuren.leagueOfChampions;

public class Itemlist {
    private Item root;
    private int itemCounter;

    public Itemlist(){}

    public void addItem(Item item){
        if(root == null){
            root = item;
            itemCounter++;
            return;
        }
        Item current = root;
        while(current.next != null){
            current = current.next;
        }
        current.next = item;
        itemCounter++;
    }

    public int sumBonusDamage(){
        int sum = 0;
        Item current = root;
        while(current != null){
            sum += current.getBonusDamage();
            current = current.next;
        }
        return sum;
    }
}
