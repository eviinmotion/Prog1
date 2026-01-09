package Kampfsportschule;

public class Mitglied {
    private int mitgliedsnummer;
    private boolean istInKurs;

    public Mitglied(int mitgliedsnummer){
        this.mitgliedsnummer = mitgliedsnummer;
    }
    public void setMitgliedsnummer(int mitgliedsnummer){
        this.mitgliedsnummer = mitgliedsnummer;
    }
    public int getMitgliedsnummer(){
        return this.mitgliedsnummer;
    }
    public void setIstInKurs(boolean istInKurs){
        this.istInKurs = istInKurs;
    }
}
