import java.util.Scanner;

public class exerc_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("Bom dia");
            String s = entrada.nextLine().toLowerCase();

            switch(s){
                case "bom dia" -> System.out.println("Como posso te ajudar? ");
                case "sair" -> {
                    System.out.println("Encerrando...");
                    entrada.close();
                    return;
                    }
            }

        }
    }
}
