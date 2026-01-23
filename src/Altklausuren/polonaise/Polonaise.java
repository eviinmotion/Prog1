package Altklausuren.polonaise;

public class Polonaise {
    private Roboter end;
    public Polonaise(){}

    public void anhaengen(Roboter neu) {
        if (end == null) {
            end = neu;
            return;
        }
        Roboter current = end;
        while (current.prev != null && neu.getGroesse() > current.getGroesse()) {
            current = current.prev;
        }
        neu.prev = current;
        current.prev = neu;
    }
    public void vorstellen(){
        Roboter current = end;
        while(current != null){
            current.toString();
            current = current.prev;
        }
    }
}
