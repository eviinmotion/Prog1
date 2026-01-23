package Altklausuren.zoo;

public class Zoo {
    private Tier root;

    public Zoo() {
    }

    public void einsortieren(Tier neu) {
        if (root == null) {
            root = neu;
            return;
        }
        Tier current = root;
        Tier parent = null;                         //Vorgänger vom Tier
        while(current != null){
            parent = current;                       //Vorgänger zwischenspeichern
            if(neu.getGroesse() < current.getGroesse()){    //erste unterscheidung um links und rechts auszuschließen
                current = current.links;                    //wenn neu kleiner ist als root, dann gehe nach links
            }
            else{
                current = current.rechts;
            }
        }
        if(neu.getGroesse() < parent.getGroesse()){
            parent.links = neu;
        }
        else{
            parent.rechts = neu;
        }
    }
    public String baumAbwandern(Tier root){
        if(root == null){
            return "";
        }
        Tier current = root;
        String ausgabe = baumAbwandern(current.rechts);
        ausgabe += current.toString() + "\n";
        ausgabe += baumAbwandern(current.links);

        return ausgabe;

    }
    public String toString(){
        return baumAbwandern(root);
    }
}


