package Lektion8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Stringmethoden {

    public static void main(String[] args) throws IOException {

        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";
        
        String suchbegriff = "<img src=\"";
        int indexGefunden = seite.indexOf(suchbegriff);
        if (indexGefunden != -1) {

            int startUrl = indexGefunden + suchbegriff.length();
            int endUrl = seite.indexOf('\"', startUrl);
            String fertigeUrl = seite.substring(startUrl, endUrl);
            System.out.println("Gefundene URL: " + fertigeUrl);

            URL urlObjekt = new URL(fertigeUrl);

            BufferedImage image = ImageIO.read(urlObjekt);
            ImageIO.write(image, "png", new File("bild.png"));

            System.out.println("Bild wurde als bild.png gespeichert!");
        } else {
            System.out.println("Konnte kein Bild im String finden.");
        }
    }
}