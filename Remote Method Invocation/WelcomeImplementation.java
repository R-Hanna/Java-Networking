import java.rmi.RemoteException; 
import java.rmi.server.*;
import java.util.Date;
import java.rmi.server.UnicastRemoteObject; 

public class WelcomeImplementation extends UnicastRemoteObject implements WelcomeInterface {

    public WelcomeImplementation() throws Exception {
        super();
    }

    public String getMessage() throws Exception {
        return "Welcome to Java RMI Programming!";
    }

    public String getDateTime() throws Exception {
        Date currentDate = new Date();
        return currentDate.toString();
    }
   
    }
