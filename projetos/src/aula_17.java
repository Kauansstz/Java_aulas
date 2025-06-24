import java.util.Scanner;

public class aula_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite algo (ou 'sair' para encerrar): ");
            resposta = entrada.nextLine();
            System.out.println("Você digitou: " + resposta);
        } while (!resposta.equalsIgnoreCase("sair"));

        entrada.close();
        System.out.println("Programa encerrado.");
    }
}
