package Lektion12;

public class Personenknoten {
    int alter;
    String nachname;
    Personenknoten next;
    Personenknoten prev;

    Personenknoten(String nachname, int alter){
        this.nachname = nachname;
        this.alter = alter;

    }
    public int getAge(){
        return this.alter;
    }
    public String getNachname(){
        return this.nachname;
    }

}
