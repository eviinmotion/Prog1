package Lektion10;

public class UhrTest {
    public static void main(String[] args){
    Uhr[] weltzeit = new Uhr[24];

    for(int i=0; i<24; i++){
        weltzeit[i] = new Uhr(i,23,7);
        System.out.println(weltzeit[i].toString());
    }
    for(int i=0; i<weltzeit.length; i++){
        weltzeit[i].naechsteSek();
        System.out.println(weltzeit[i].toString());
    }
    }
}
