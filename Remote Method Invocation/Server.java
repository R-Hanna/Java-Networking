import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
import rmi.WelcomeImplementation;
import rmi.WelcomeInterface;

public class Server {

    public static void main(String[] args) {
        try {
            
            Registry registry = LocateRegistry.createRegistry(1099);
            System.setProperty("java.rmi.server.hostname","192.168.1.150");
            WelcomeImplementation localObject = new WelcomeImplementation();
            String url = "rmi://localhost/WelcomeInterface";
            Naming.rebind(url, localObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
