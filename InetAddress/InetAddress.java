import java.net.*;

public class InetAddress {

    public static void main(String[] args) {
        try {
            InetAddress adrLocale = InetAddress.getLocalHost();
            System.out.println("Adresse Locale = "
                              + adrLocale.getHostAddress() );
            
            InetAddress adrServeur = InetAddress.getByName("google.com");
            System.out.println("Adresse Google = "
                              + adrServeur.getHostAddress() );
            
            InetAddress[] adrServeurs = InetAddress.getAllByName("www.microsoft.com");
            System.out.println("Adresse Microsoft= ");
            for (int i = 0; i < adrServeurs.length; i++) {
                System.out.println(" " + adrServeurs[i].getHostAddress());
            }
        } catch (UnknownHostException e) {
        }
    }

}

