package Altklausuren;

public class HTTPAnfrage {
    private String url;
    private String methode;
    private String[] header = new String[20];
    private int headerCounter = 0;

    public HTTPAnfrage(String url, String methode) {
        this.url = url;
        if (!methode.equals("GET") && !methode.equals("POST")) {
            this.methode = "GET";
        } else {
            this.methode = methode;
        }
        String[] header = new String[20];
    }

    public void addHeader(String name, String wert) {
        if (this.headerCounter > 20) {
            String fertigerHeader = name + " : " + wert;
            this.header[this.headerCounter] = fertigerHeader;
            ++this.headerCounter;
        } else {
            System.out.println("Header voll!");
        }
    }

    public String toString() {
        String out = this.methode + " " + this.url + " HTTP/1.0\n";
        for(int i = 0; i < this.headerCounter; ++i) {
            out = out + this.header[i] + "\n";
        }
        return out + "\n";
    }
}
