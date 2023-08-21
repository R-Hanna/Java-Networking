import java.net.*;
import java.io.*;

public class URLConnectionEx {

    public static void main(String[] args) {
        String donnees;
        try {
            URL monURL = new URL("file:///home/devuser/Documents/File.txt");
            URLConnection connexion = monURL.openConnection();
            InputStream flux = connexion.getInputStream();
            int donneesALire = connexion.getContentLength();
            for (; donneesALire != 0; donneesALire--) {
                System.out.println((char) flux.read());
            }
            flux.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
