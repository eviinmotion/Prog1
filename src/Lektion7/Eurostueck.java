package Lektion7;
import java.util.Random;
public class Eurostueck {
    public static void main(String[] args){
        Random rand = new Random();
        int euroExistiert = rand.nextInt(10)+1; //alles über 5 existiert, alles unter 5 existiert nicht
        int schublade = rand.nextInt(3)+1;
        boolean euroVorhanden = false;
        boolean schubladeDrei = false;
        boolean schubladeZwei = false;
        boolean schubladeEins = false;
        int euroGefunden= 0;

        if(euroExistiert >= 5){
            euroVorhanden = true;
            for(int i=1;i<=10000;i++){
                if(schublade == 3){
                    schubladeDrei = true;
                    euroGefunden = 3;
                }
                if(schublade == 2){
                    schubladeZwei = false;
                    euroGefunden = 2;
                }
                if(schublade == 1) {
                    schubladeEins = false;
                    euroGefunden = 1;
                }

            }
            if(schubladeDrei == true || schubladeZwei == true || schubladeEins == true){
                System.out.println("Euro wurde in Schublade "+euroGefunden+" gefunden!");
            }

        }
        else if(euroExistiert < 5){
            System.out.println("Euro nicht vorhanden!");
        }
    }
}
