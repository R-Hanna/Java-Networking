import java.net.*;

public class ClientUDP {

    final static int port = 9632;
    final static int taille = 1024;
    static byte buffer[] = new byte[taille];

    public static void main(String args[]) throws Exception {
        try {
            InetAddress serveur = InetAddress.getByName(args[0]);
            int length = args[1].length();
            byte buffer[] = args[1].getBytes();
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket donneesEmises = new DatagramPacket(buffer, length, serveur, port);
            DatagramPacket donneesRecues = new DatagramPacket(new byte[taille], taille);
            socket.setSoTimeout(30000);
            socket.send(donneesEmises);
            socket.receive(donneesRecues);
            System.out.println("Message : " + new String(donneesRecues.getData(),0, donneesRecues.getLength()));
            System.out.println("de : " + donneesRecues.getAddress() + ":" + donneesRecues.getPort());
        } catch (SocketTimeoutException ste) {
            System.out.println("Le delai pour la reponse a expire");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
