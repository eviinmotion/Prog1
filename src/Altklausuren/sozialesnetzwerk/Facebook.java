package Altklausuren.sozialesnetzwerk;

public class Facebook {
    public static void main(String [] args){
        Timeline bobsTimeline = new Timeline();
        Post bob = new Post("Frohe Weihnachten!", "Alice", "Bob");
        Post alice = new Post("Danke! Guten Rutsch ins neue Jahr!", "Bob", "Alice");
        Post alice2 = new Post("Gutes neues Jahr!", "Alice", "Bob");

        bobsTimeline.fuegePostEin(bob);
        bobsTimeline.fuegePostEin(alice);
        bobsTimeline.fuegePostEin(alice2);

        bobsTimeline.gibAus();
    }
}
