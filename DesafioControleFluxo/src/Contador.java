import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;

        if (contagem < 1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contador = 0;

        for (int i = parametroUm; i >= parametroUm && i < parametroDois; i++) {
            contador += 1;
            System.out.println("Imprimindo o número " + contador);
        }
    }
}
