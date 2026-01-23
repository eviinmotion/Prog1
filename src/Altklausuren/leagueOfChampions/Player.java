package Altklausuren.leagueOfChampions;

public class Player {
    private String playerName;
    private int gold;
    private int kopfgeld;
    private int killCounter;
    private int basisSchaden;
    private int level;
    private Itemlist itemlist;

    public Player(String playerName, int basisSchaden){
        this.playerName = playerName;
        if(basisSchaden <= 0){
            this.basisSchaden = 100;
        }
        else{ this.basisSchaden = basisSchaden; }
        this.level = 1;
        this.gold = 500;
        this.kopfgeld = 300;
        this.killCounter = 0;
        this.itemlist = new Itemlist();
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public int getGold(){
        return this.gold;
    }
    public int getKopfgeld(){
        return this.kopfgeld;
    }
    public void setKopfgeld(int kopfgeld){
        this.kopfgeld = kopfgeld;
    }
    public int getLevel(){
        return this.level;
    }
    public int getBasisSchaden(){
        return this.basisSchaden;
    }
    public int getKillCounter(){
        return this.killCounter;
    }
    public void die(){
        setKopfgeld(300);
        this.killCounter = 0;
    }
    public void killPlayer(Player enemy){
        if(this.level == 18){
            this.level = 18;
        }
        this.level++;
        if(this.killCounter >= 8){
            System.out.println(this.playerName+" is legendary");
        }
        if(this.killCounter == 2 || this.killCounter == 3){
            this.kopfgeld += 150;
        }
        if(this.killCounter == 4 || this.killCounter >= 5){
            this.kopfgeld += 100;
        }
        this.gold += enemy.getKopfgeld();
        enemy.die();
        enemy = null;
    }

    public void buyItem(Item item){
        if(this.gold < item.getCosts()){
            System.out.println("Go get more kills!");
        }
        else{
            this.itemlist.addItem(item);
            this.gold -= item.getCosts();
            System.out.println("Item purchased!");
        }
    }

    public double calcTotalDamage(){
        return this.level * this.basisSchaden+this.itemlist.sumBonusDamage();
    }


}
