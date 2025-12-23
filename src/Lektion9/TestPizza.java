package Lektion9;

public class TestPizza {
    public static void main(String[]args){
        double[][] datenMargarita = { {7.0, 20},{9.0, 26},{14.0, 30}};
        Pizza margarita = new Pizza("Margarita", datenMargarita);

        System.out.println("Für Pizza Margarita: "+margarita.preisLeistung());
    }
}
