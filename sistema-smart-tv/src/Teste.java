
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        SmartTv smartTvTeste = new SmartTv();
        
        Scanner scanner = new Scanner(System.in);
        smartTvTeste.mudarCanal(scanner);
        scanner.close();
    }
}