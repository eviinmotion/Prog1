package Mannschaftsbaum;

public class Baum {
    private Knoten root;

    public Baum(Knoten root){
        this.root = root;
    }

    public Mannschaft maxTore(){
        return findeMaxTore(this.root);
    }

    private Mannschaft findeMaxTore(Knoten current){
        if(current == null){
            return null;
        }
        Mannschaft bester = current.getTeam();                           //current festlegen als messlatte
        Mannschaft linksBester = findeMaxTore(current.getLinks());       //current.links festlegen als messlatte
        Mannschaft rechtsBester = findeMaxTore(current.getRechts());     //current.rechts festlegen als messlatte

        if(linksBester != null && linksBester.getTore() > bester.getTore()){
            bester = linksBester;
        }
        if(rechtsBester != null && rechtsBester.getTore() > bester.getTore()){
            bester = rechtsBester;
        }
        return bester;
    }
}
