import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        // optional: System.setProperty("java.rmi.server.hostname", "server-ip");
        LocateRegistry.createRegistry(1099); // start rmiregistry in-process
        CalculatorImpl calc = new CalculatorImpl();
        Naming.rebind("CalculatorService", calc);
        System.out.println("Calculator server ready");
    }
}
