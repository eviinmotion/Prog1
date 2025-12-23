package Lektion8;

public class Garage {
    public static void main(String[] args) {

        Auto[] auto = new Auto[3];
        auto[0] = new Auto();
        Auto auto1 = auto[0];
        auto1.marke = "Mazda";
        auto1.hubraum = 1350;
        auto1.farbe = "rot";
        auto1.tueren = 3;
        auto[1] = new Auto();
        Auto auto2 = auto[1];
        auto2.marke = "Audi";
        auto2.hubraum = 2200;
        auto2.farbe = "silber";
        auto2.tueren = 5;
        auto[2] = new Auto();
        Auto auto3 = auto[2];
        auto3.marke = "VW";
        auto3.hubraum = 2100;
        auto3.farbe = "weiss";
        auto3.tueren = 5;

        Auto groesstesAuto = auto[0];

        for(int i = 0; i < auto.length; i++){
            if(auto[i].hubraum > groesstesAuto.hubraum){
                groesstesAuto =  auto[i];
            }
        }
        System.out.println("Das Auto der Marke "+groesstesAuto.marke+" hat den größten Hubraum.");
    }
}
