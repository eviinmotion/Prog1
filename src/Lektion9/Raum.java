package Lektion9;

public class Raum {
    private String name;
    private int anzahlPlaetze;
    private boolean belegt;
    Student[] anzahlStudenten;

    public Raum(String name, int anzahlPlaetze) {
        this.name = name;
        Student[] anzahlStudenten = new Student[anzahlPlaetze];
        this.anzahlPlaetze = anzahlPlaetze;
        this.anzahlStudenten = anzahlStudenten;
        this.belegt = false;
    }
    public String getName() {
        return name;
    }

    public int getAnzahlPlaetze() {
        return anzahlPlaetze;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public Student[] getAnzahlStudenten() {
        return anzahlStudenten;
    }

    public String betreteRaum(Student neuerStudent) {
        for (int i = 0; i < anzahlStudenten.length; i++) {
            if (anzahlStudenten[i] == null) {
                anzahlStudenten[i] = neuerStudent;
                raumVoll();
                return neuerStudent.getName()+" "+neuerStudent.getMatrikelnummer()+" hat den Raum betreten!";
            }
        }
        return "Der Raum "+this.name+"ist belegt!";
    }
    private void raumVoll(){
        boolean nochPlatz = false;
        for (int i = 0; i < anzahlStudenten.length; i++) {
            if (anzahlStudenten[i] == null) {
                nochPlatz = true;
                break;
            }
        }
        if(nochPlatz == false){
            this.belegt = true;
        }
        else{
            this.belegt = false;
        }
    }
    public String verlasseRaum(Student studentGeht) {
        for (int i = 0; i < anzahlStudenten.length; i++) {
            if(anzahlStudenten[i] == studentGeht){
                anzahlStudenten[i] = null;
                raumVoll();
                return studentGeht.getName()+" verlässt den Raum.";
            }
        }
        return "Student "+studentGeht.getName()+" war nicht im Raum!";
    }
}



