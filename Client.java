import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        String host = (args.length > 0) ? args[0] : "localhost";
        Calculator calc = (Calculator) Naming.lookup("//" + host + "/CalculatorService");

        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 / 2 = " + calc.divide(10, 2));
    }
}
