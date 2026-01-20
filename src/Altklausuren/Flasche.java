package Altklausuren;

public class Flasche {
    private String name;
    private String text;
    private int kapazitaet;
    private int fuellstand;

    public Flasche(String name, String text, int kapazitaet) {
        this.name = name;
        this.text = text;

        try {
            if (kapazitaet < 0) {
                throw new RuntimeException("Kapazität muss positiv sein!");
            }

            this.kapazitaet = kapazitaet;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            this.kapazitaet = 0;
        }

        this.fuellstand = kapazitaet;
    }

    public int reduziereFuellstand(int reduzierendeMenge) {
        if (this.fuellstand > reduzierendeMenge) {
            this.fuellstand -= reduzierendeMenge;
            return reduzierendeMenge;
        } else {
            return 0;
        }
    }

        public void istLeer() {
            if (this.fuellstand > 0) {
                System.out.println("Es ist noch 'was in der Flasche!");
            } else if (this.fuellstand == 0) {
                System.out.println("Die Flasche ist leer!");
            }

        }
    }


