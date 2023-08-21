import java.net.*;
import java.io.*;
import java.util.Date;

public class ServerThreadTCP extends Thread { //Inherit from class Thread

    static int port = 9632;
    static int clientNo = -1;
    Socket socket;

    public static void main(String[] args) {
        try {
            ServerSocket socketServer = new ServerSocket(port);
            
            //Create new instance from ServerSocket
            
            System.out.println("STARTING THE SERVER" + '\n' + "WAITING FOR CONNECTIONS..." + '\n');
            
            // Listen for a connection
            
            while (true) {
                Socket socketClient = socketServer.accept();
                System.out.println("NEW CLIENT IS CONNECTED "
                        + '\n'
                        + "CLIENT CONNECTION DETAILS: "
                        + socketClient
                        + '\n'
                        + "DATE: " + new Date() + '\n');
                System.out.println("ASSIGNING NEW THREAD FOR THIS CLIENT"
                        + '\n');
                ServerThreadTCP t = new ServerThreadTCP(socketClient);
                t.start();

                clientNo++;
                //Increment clientNo
                int count = ServerThreadTCP.activeCount();
                Thread th[] = new Thread[count];
                // Returns the number of threads in array
                Thread.enumerate(th);
                // Prints active threads
                System.out.println("ACTIVE THREADS LIST: "
                        + '\n');
                for (int i = 0; i < count; i++) {
                    System.out.println(i
                            + ":"
                            + th[i]);
                }

                System.out.println('\n');
                System.out.println("CLIENT THREAD = Thread-" + clientNo);
                System.out.println("ACTIVE THREADS NUMBER = " + count);
                System.out.println('\n' + "---------------------------------" + '\n');
            }
        } catch (IOException e) {
        }
    }

    public ServerThreadTCP(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        traitements();
    }

    public void traitements() {
        try {
            String message = "";
            System.out.println("CONNECTION WITH THE CLIENT : " + socket.getInetAddress() + '\n');
            //TestServeurThreadTCP.activeCount();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());
            message = in.readLine();
            out.println("Bonjour " + message);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

