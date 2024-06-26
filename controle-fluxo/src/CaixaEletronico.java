public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        /*
         * ESTRUTURA CONDICIONAL IF/ELSE
         * if (valorSolicitado < saldo) {
         * saldo = saldo - valorSolicitado;
         * System.out.println("Novo saldo: " + saldo);
         * } else {
         * System.out.println("Saldo insuficiente.");
         * }
         */

        // ESTRUTURA CONDICIONAL TERNÁRIA
        String mensagem = valorSolicitado < saldo ? "Novo saldo: " + saldo : "Saldo insuficiente";
        System.out.println(mensagem);
    }
}
