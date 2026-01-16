package Altklausuren.sozialesnetzwerk;

public class Timeline {
    Post root;

    public Timeline(){
    }

    public void fuegePostEin(Post neu){
        if(root == null){
            root = neu;
            return;
        }
        neu.next = root;
        root = neu;
    }

    public void gibAus(){
        Post current = root;
        while(current != null){
            System.out.println(current.getAbsender()+ " -> "+ current.getEmpfaenger());
            System.out.println(current.getText());
            System.out.println();
            current = current.next;
        }
    }
}
