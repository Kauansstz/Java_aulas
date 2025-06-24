
import java.util.Scanner;

public class exerc_dia_sem {
    public static void main(String[] args) {
        

        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("\nDigite o nome do dia: ");
            String response = entrada.next().toLowerCase();
            int text = switch(response) {
                case "sábado"-> 7;
                case "domingo" -> 1;
                case "segunda" -> 2;
                case "terça" -> 3;
                case "quarta" -> 4;
                case "quinta" -> 5;
                case "sexta" -> 6;
                default -> {
                    System.out.println("Não compreendi o quis dizer");
                    yield -1;
                }
                        };
            if (text != -1){
                    System.out.println("Dia da semana (número): " + text);
            }
    }

    }
}
