public class ExemploForArray {
    public static void main(String[] args) throws Exception {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // ESTRUTURA FOR
        /*
         * for (int x = 0; x < alunos.length; x++) {
         * System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
         * }
         */

        // ESTRUTURA FOR ABREVIADA
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
