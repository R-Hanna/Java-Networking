import java.rmi.Remote;

public interface WelcomeInterface extends Remote {
	public String getMessage() throws Exception;
	public String getDateTime() throws Exception;
}
