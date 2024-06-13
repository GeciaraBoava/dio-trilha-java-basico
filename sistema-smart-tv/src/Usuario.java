import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
    
        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(scanner);
        scanner.close(); //fechando scanner do mudarCanal
        
        System.out.println("Novo Status: TV ligada? " + smartTv.ligada);
        System.out.println("Novo Status: Volume atual: " + smartTv.volume);
        System.out.println("Novo Status: Canal atual: " + smartTv.canal);
    }
}
