package Lektion3;

public class Wuerfelwurf {
    public static void main(String[] args) {
        double x = (int) (Math.random() * 6) +1;

        System.out.println("Du hast "+ (int)x+" gewürfelt!");
    }
}
