package Lektion12;

public class Baum {
    Knoten root;

    public Baum(Knoten root){
        this.root = root;
    }
    public void insert(Knoten k){
        if(root == null){
            root = k;
            return;
        }
        Knoten current = root;
        while(true){
            int vergleich = k.wort.compareTo(current.wort);
            if(vergleich < 0){
                if(current.links == null){
                    current.links = k;
                    return;
                }else{
                    current = current.links;
                }
            }
            else if(vergleich > 0){
                if(current.rechts == null){
                    current.rechts = k;
                    return;
                }else{
                    current = current.rechts;
                }
            }
            else{
                return;
            }
        }

    }
    public void print(){
        ausgeben(root);
    }
    public String search(String w){
        Knoten current = root;
        while(current !=null){

            int vergleich = w.compareTo(current.wort);
            if(vergleich == 0){
                return current.bedeutung;
            }
            if(vergleich < 0){
                current = current.links;
            }
            if(vergleich > 0){
                current = current.rechts;
            }
        }
        return null;
    }
    private void ausgeben(Knoten k){
        if(k == null){
            return;
        }
        ausgeben(k.links);
        System.out.println(k.getWort()+" "+k.getBedeutung());
        ausgeben(k.rechts);
    }
}
