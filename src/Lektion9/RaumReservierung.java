package Lektion9;

public class RaumReservierung {
    public static void main(String[]args){
        Raum raumI21 = new Raum("I.2.1", 30);
        Raum raumI215 = new Raum("I.2.15", 40);

        System.out.println("Ist Raum "+raumI21.getName()+ " belegt? "+raumI21.isBelegt());
        System.out.println("Ist Raum " +raumI215.getName()+" belegt? "+raumI215.isBelegt());
        raumI21.setBelegt(true);

        System.out.println("Ist Raum "+raumI21.getName()+" belegt? "+raumI21.isBelegt());
        System.out.println("Ist Raum "+raumI215.getName()+" belegt? "+raumI215.isBelegt());
    }

}
