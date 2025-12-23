package Lektion9;

public class StudentenTracken {
    public static void main(String[] args) {
        Raum raum1 = new Raum("I.2.1", 3);
        Raum raum2 = new Raum("I.2.15", 4);
        Raum raum3 = new Raum("I.3.1", 2);
        Student pia = new Student("Pia Castelnovo", 125686);
        Student noah = new Student("Noah Ries", 4543378);
        Student evi = new Student("Evi Vojak", 10003701);
        Student leon = new Student("Leon Siller", 3432478);

        System.out.println(raum1.betreteRaum(evi));
        System.out.println(raum1.betreteRaum(pia));
        System.out.println(raum1.betreteRaum(noah));
        System.out.println(raum1.betreteRaum(leon));

        System.out.println(raum2.verlasseRaum(evi));
        System.out.println(raum1.verlasseRaum(leon));
        System.out.println(raum1.verlasseRaum(pia));
    }
}
