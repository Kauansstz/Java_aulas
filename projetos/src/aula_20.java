public class aula_20 {
    public static void main(String[] args) {
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Percorrendo a matriz
        for (int i = 0; i < numeros.length; i++) { // linhas
            for (int j = 0; j < numeros[i].length; j++) { // colunas
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(); // pular linha
        }
    }
}
