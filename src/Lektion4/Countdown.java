package Lektion4;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        for ( i = 0; i <= 15; i++){
            System.out.println("Countdown: "+i);
            int verbleibend = 15-i;
            System.out.println("Noch "+ verbleibend +" bis zum Ende");
            Thread.sleep(1000);
        }
    }
}
