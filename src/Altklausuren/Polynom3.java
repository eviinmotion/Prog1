package Altklausuren;

public class Polynom3 {
    private double a;
    private double b;
    private double c;
    private double d;

    public Polynom3(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public double berechneAnDerStelleX(double x) {
        return this.a * x * x * x + this.b * x * x + this.c * x + this.d;
    }

    public Polynom3 leiteAb() {
        return new Polynom3((double)0.0, (double)3.0 * this.a, (double)2.0 * this.b, this.c);
    }

    public String toString() {
        return this.a + "x^3 + " + this.b + "x^2 + " + this.c + "x + " + this.d;
    }
}
