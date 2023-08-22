import java.net.*;
import java.util.*;

public class NetworkInterface {

    public static void main(String[] args) {
        try {
            NetworkInterfaceEx.getLocalNetworkInterface();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getLocalNetworkInterface() throws SocketException, NoClassDefFoundError {
        Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni;
            Enumeration adresses;
            ni = (NetworkInterface) interfaces.nextElement();
            System.out.println("Network interface : ");
            System.out.println(" nom court = " + ni.getName());
            System.out.println(" désignation = " + ni.getDisplayName());
            adresses = ni.getInetAddresses();
            while (adresses.hasMoreElements()) {
                InetAddress ia = (InetAddress) adresses.nextElement();
                System.out.println(" adresse I.P. = " + ia);
            }
        }
    }
}
