import java.net.*;
import java.io.*;

public class HttpURLConnection {

    public static void main(String[] args) {
        HttpURLConnection connexion = null;
        try {
            URL url = new URL("https://www.oracle.com");
            System.out.println("Connexion a l'url...");
            
            connexion = (HttpURLConnection) url.openConnection();
            connexion.setAllowUserInteraction(true);
            DataInputStream in = new DataInputStream(connexion.getInputStream());
            if (connexion.getResponseCode() != HttpURLConnection.HTTP_OK) {
                System.out.println(connexion.getResponseMessage());
                System.out.println(connexion.getResponseCode());
            } else {
                while (true) {
                    System.out.print((char) in.readUnsignedByte());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connexion.disconnect();
        }

        System.exit(0);
    }
}
