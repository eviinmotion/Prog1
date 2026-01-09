package Lektion12;

public class Lottoziehung {
    Lottozahlen root;

    public int zufallsZahl() {
        int zahl = (int) (Math.random() * 49 + 1);
        return zahl;
    }

    //methode um neuen knoten hinzufügen
    public void add(int zahl) {
        Lottozahlen newZahl = new Lottozahlen(zahl);

        if (root == null) { //wenn liste leer
            root = newZahl;
        } else {
            Lottozahlen current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newZahl;
        }
    }

    public void delete(int zahl) {
        Lottozahlen current = root;
        if (current.lottozahl == zahl) { //falls die erste zahl die gleiche ist löschen
            root = root.next;
            return;
        }
        while (current.next != null) {
            if (current.next.lottozahl == zahl) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void fuelleTopf() {
        for (int i = 1; i <= 49; i++) {
            add(i);
        }
    }

    public static void main(String[] args) {
        Lottoziehung neuesLotto = new Lottoziehung();
        neuesLotto.fuelleTopf();
        System.out.println(neuesLotto.zufallsZahl());

        int[] gezogeneZahlen = new int[6];
        for (int i = 0; i < 6; i++) {
            int zahl = neuesLotto.zufallsZahl();
            gezogeneZahlen[i] = zahl;
            neuesLotto.delete(zahl);
        }
        int temp;
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < gezogeneZahlen.length -i; j++){
                if(gezogeneZahlen[j-1] > gezogeneZahlen[j]){
                    temp = gezogeneZahlen[j];
                    gezogeneZahlen[j] = gezogeneZahlen[j-1];
                    gezogeneZahlen[j-1] = temp;
                }
            }
        }
        for(int i = 0; i < 6; i++){
            System.out.println(gezogeneZahlen[i]);
        }
    }
}
