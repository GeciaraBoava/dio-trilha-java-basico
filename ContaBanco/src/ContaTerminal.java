import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO:
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela classe Scanner os valores digitados no terminal
        // Exibir a mensagem da conta criada

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomecliente;
        double saldo;

        System.out.println("Por favor, digite o número da agência!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomecliente = sc.nextLine();

        System.out.println("Por favor, digite o valor do depósito inicial!");
        saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.",
                nomecliente, agencia, numero, saldo);

        sc.close();
    }
}
