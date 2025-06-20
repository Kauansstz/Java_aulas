
import java.util.Scanner;


public class exerc_calc_2 {

    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)) {
        
        System.out.print("Digite o primeiro número: ");
        String numb1 = entrada.nextLine();

        System.out.print("Digite o segundo némero: ");
        String numb2 = entrada.nextLine();

        System.out.print("Digite o operador(+, -, /, *): ");
        String operador = entrada.nextLine();

        double n1 = Double.parseDouble(numb1);
        double n2 = Double.parseDouble(numb2);
        double resposta = switch(operador){
            case "+" -> n1 + n2;
            case "-" ->  n1 - n2;
            case "*" ->  n1 * n2;
            case "/" -> {
               if (n2 != 0) {
                    yield n1 / n2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    yield Double.NaN;     
                }}
                
            default -> {
                System.out.println("Operador inválido");
               yield Double.NaN;
            }
            };

        System.out.println("Resultado: "+ resposta);
    }

}

}
