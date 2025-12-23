package Lektion5;

public class Quadratwurzel {
    public static void main(String[] args){
    double x = 4;
    double y = 20;
    boolean nah = false;
    double z;
    double toleranz = 0.000001;

    do{
        double xAlt = x;
        z = y/xAlt;
        x = (xAlt+z)/2;


        if(x-xAlt < toleranz && (x-xAlt > -toleranz)){
            nah = true;
        }
        else{
            nah = false;
        }
    }
    while(!nah);
    System.out.println(Math.sqrt(y)+" " +x);

}
}
