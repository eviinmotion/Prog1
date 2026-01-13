package Lektion13;

public class Artikel {
    private String artikelname;
    private int artikelnummer;
    Artikel next;

    public Artikel(String artikelname, int artikelnummer) {
        this.artikelname = artikelname;
        this.artikelnummer = artikelnummer;
    }
    public String getArtikelname(){
        return artikelname;
    }
    public int getArtikelnummer(){
        return artikelnummer;
    }
    public void setArtikelname(String artikelname){
        this.artikelname = artikelname;
    }
    public void setArtikelnummer(int artikelnummer){
        this.artikelnummer = artikelnummer;
    }
}
