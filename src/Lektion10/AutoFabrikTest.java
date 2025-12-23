package Lektion10;

public class AutoFabrikTest {
    public static void main(String[]args){
        AutoFabrik wolfsburg = new AutoFabrik();
        AutoFabrik arnstein = new AutoFabrik();
        AutoFabrik wuerzburg = new AutoFabrik();

        wolfsburg.produziere();
        wolfsburg.produziere();
        arnstein.produziere();
        wuerzburg.produziere();
        arnstein.produziere();
    }
}
