
import java.util.Scanner;

public class exerc_foreach {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de notas que deseja inserir: ");
        Scanner entrada = new Scanner(System.in);

        int totalNotas = entrada.nextInt();
        double[] notas = new double[totalNotas];
        for (int i = 0; i < totalNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        
        }
        
        double totalMedia = 0;
        for (double nota : notas) {
            totalMedia += nota;
        }
        double media = totalMedia / totalNotas;

        System.out.println("Média: " + media);
        String resultado = media >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);
        entrada.close();
    }
}
