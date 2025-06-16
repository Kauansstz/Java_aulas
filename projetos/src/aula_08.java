import java.util.Scanner;

public class aula_08 {
    public static void main(String[] args) {
        System.out.println("Bom");
        System.out.println("dia");
        System.out.print("Bom");
        System.out.print(" Dia");

        try(Scanner entrada = new Scanner(System.in)){
        System.out.println("\nDigite o seu nome");
        String nome = entrada.nextLine();
        System.out.println("\n\nNome = " + nome);

        System.out.println("\nDigite o seu Sobrenome");
        String sobrenome = entrada.nextLine();
        System.out.println("\n\nSobrenome = " + sobrenome);

        entrada.close();
        }
    }
}
