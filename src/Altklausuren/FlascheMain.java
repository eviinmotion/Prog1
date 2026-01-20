package Altklausuren;

public class FlascheMain {
    public static void main(String[] args) {
        Flasche rotwein = new Flasche("PROG 1", "SoSe 23", 750);
        System.out.println(rotwein.reduziereFuellstand(130)+ " ml entnommen.");
        System.out.println(rotwein.reduziereFuellstand(130)+ " ml entnommen.");
        System.out.println(rotwein.reduziereFuellstand(130)+" ml entnommen.");
        System.out.println(rotwein.reduziereFuellstand(130)+" ml entnommen.");
        System.out.println(rotwein.reduziereFuellstand(130)+" ml entnommen.");
        System.out.println(rotwein.reduziereFuellstand(130)+" ml entnommen.");
        System.out.println(rotwein.reduziereFuellstand(130)+" ml entnommen.");

    }
}
