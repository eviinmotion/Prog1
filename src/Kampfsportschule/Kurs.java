package Kampfsportschule;

public class Kurs {
    String kursart;
    boolean belegt;
    int kursdauer;
    int kursplaetze;
    Mitglied[] mitgliedsnummer = new Mitglied[kursplaetze];
    int belegtePlaetze;

    public Kurs(String kursart, int kursdauer, boolean belegt){
        if(kursart.equals("Karate")||kursart.equals("Judo")||kursart.equals("WingChun")||kursart.equals("Boxen")||kursart.equals("KungFu")){
            this.kursart=kursart;
        }
        if(kursdauer == 30 || kursdauer == 60 || kursdauer == 90) {
            this.kursdauer = kursdauer;
        }
        if(belegtePlaetze >= kursplaetze){
            this.belegt = true;
        }
        this.kursplaetze = 10;
        this.mitgliedsnummer = new Mitglied[kursplaetze];
    }
    public String getKursart() {
        return kursart;
    }
    public void setKursart(String kursart) {
        if(kursart.equals("Karate")||kursart.equals("Judo")||kursart.equals("WingChun")||kursart.equals("Boxen")||kursart.equals("KungFu")){
            this.kursart=kursart;
        }
    }
    public int getKursdauer(){
        return kursdauer;
    }
    public void setKursdauer(int kursdauer) {
        if(kursdauer == 30 || kursdauer == 60 || kursdauer == 90){
            this.kursdauer = kursdauer;
        }
    }
    public void kursAnmelden(Mitglied mitgliedsnummer){
        for(int i = 0; i <this.mitgliedsnummer.length; i++){
            if(this.mitgliedsnummer[i] == null){
                this.mitgliedsnummer[i] = mitgliedsnummer;
            }
            belegtePlaetze++;
        }
    }
}
