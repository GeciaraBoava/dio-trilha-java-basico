import java.util.Scanner;

public class SmartTv{
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Ligando TV");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Desligando TV");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuído para " + volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal mudado para " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal mudado para " + canal);
    }
    public void mudarCanal (Scanner scanner){
        System.out.println("Digite o novo canal: ");
        int novoCanal = scanner.nextInt();
        canal = novoCanal;
        System.out.println("Canal mudado para " + canal);
    }
}
