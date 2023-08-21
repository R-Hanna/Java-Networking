import java.rmi.*;
import java.rmi.registry.*;

public class Server {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            System.setProperty("java.rmi.server.hostname", "192.168.1.171");
            WelcomeImplementation localObject = new WelcomeImplementation();
            String url = "rmi://localhost/WelcomeInterface";
            Naming.rebind(url, localObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
