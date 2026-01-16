package Altklausuren.sozialesnetzwerk;

public class Post {
    private String text;
    private String absender;
    private String empfaenger;
    Post next;

    public Post(String text, String absender, String empfaenger){
        this.text = text;
        this.absender = absender;
        this.empfaenger = empfaenger;
    }

    public String getText(){
        return this.text;
    }
    public String getAbsender(){
        return this.absender;
    }
    public String getEmpfaenger(){
        return this.empfaenger;
    }
}
