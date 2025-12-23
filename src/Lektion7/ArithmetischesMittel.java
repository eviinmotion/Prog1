package Lektion7;
import java.util.Scanner;
import java.util.Arrays;
public class ArithmetischesMittel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie an wie viele Werte sie messen wollen: ");
        int anzahlDistanzen = scanner.nextInt();
        double[] gesamt = new double[anzahlDistanzen];
        double mittelwert=0;
        double summe=0;

        if (anzahlDistanzen==0){
            System.out.println("Ungültige Eingabe!");
            return;
        }
        for(int i = 0; i < anzahlDistanzen; i++){
            System.out.println("Bitte den "+(1+i)+". Wert eingeben: ");
            gesamt[i] = scanner.nextDouble();

            summe= gesamt[i]+summe;

            }
        double summeAbweichungen=0;
        double summeQuadrate=0;
        mittelwert=summe/anzahlDistanzen;
        double[] vorSort = Arrays.copyOf(gesamt,gesamt.length);
        for (int k = 0; k < anzahlDistanzen; k++){
            summeAbweichungen = gesamt[k]-mittelwert;
            summeQuadrate+= summeAbweichungen*summeAbweichungen;

        }
        double standardabweichung = Math.sqrt((summeQuadrate/anzahlDistanzen));
        Arrays.sort(gesamt);
        for(int j = 0; j <anzahlDistanzen; j++){
            System.out.println(j+1+". Stelle: "+vorSort[j]);
        }
        System.out.println("Kleinster Wert: "+gesamt[0]+"\n"+"Größter Wert: "+gesamt[anzahlDistanzen-1]+"\n"+"Arithmetisches Mittel: "+mittelwert);
        System.out.println("Die Standardabweichung beträgt: "+standardabweichung+" %");
    }
}
