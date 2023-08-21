public class ClientTCP {

    final static int port = 9632;

    public static void main(String[] args) {
        Socket clientSocket;
        DataInputStream userInput;
        PrintStream DataOutputStream;

        try {
            InetAddress server = InetAddress.getByName(args[0]);
            clientSocket = new Socket(server, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream  = new PrintStream(clientSocket.getOutputStream());
            DataOutputStream.println(in.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
