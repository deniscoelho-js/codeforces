package core.io.codeforces;

public class E12 {
    public static void main(String[] args) {
        int n = 4; // precisa ser par
        int[][] vetor = new int[n][n];

        // diagonal principal = 0
        for (int i = 0; i < n; i++) {
            vetor[i][i] = 0;
        }

        // construção correta
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int valor = (i + j) % n;
                if (valor == 0) valor = n - 1; // evita zeros fora da diagonal
                vetor[i][j] = valor;
                vetor[j][i] = (n - valor) % n; // garante simetria e diversidade
                if (vetor[j][i] == 0) vetor[j][i] = n - 1;
            }
        }

        // imprimir matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(vetor[i][j] + " ");
            }
            System.out.println();
        }
    }
}
