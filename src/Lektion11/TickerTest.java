package Lektion11;

public class TickerTest {
    public static void main(String[] args) {
        Ticker ticker = new Ticker(45);
        ticker.setNachricht(ticker.stringToCharArray("Wettervorhersage: Schnee in Wuerzburg"));
        System.out.println(ticker.getNachricht());
        ticker.rotateNachricht(6);
        System.out.println(ticker.getNachricht());
        ticker.rotateNachricht(14);
        System.out.println(ticker.getNachricht());
    }
}
