
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry();
        String host = "localhost";
        String url = "rmi://" + host + "/WelcomeInterface";
        WelcomeInterface remoteObject = (WelcomeInterface) Naming.lookup(url);
        String str1 = remoteObject.getMessage();
        String str2 = remoteObject.getDateTime();
        System.out.println("\n\t getMessage()  ==> " + str1);
        System.out.println("\n\t getDateTime() ==> " + str2);
    }
}
