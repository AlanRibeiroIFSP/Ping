import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Ping {

    public static void main(String[] args) throws IOException {

        try {
            String addr = "192.168.0.109";

            if (InetAddress.getByName(addr).isReachable(2000)) {
                String nome = InetAddress.getByName(addr).getHostName();
                System.out.println("Host " + nome + " (" + addr + ") ativo!");

            } else {
                System.out.println("Host inativo!");
            }

        } catch (UnknownHostException ex) { } 

    }

}
