
import java.util.Scanner;




public class exerc_do_while {
    public static void main(String[] args) {
        
        int qtd_nota = 0;
        double total = 0;
        Scanner entrada = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n<-----Menu----->");
            System.out.println("1- Fazer a média");
            System.out.println("2- Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextLine();
            switch (opcao){
                case "1":
                    do{
                        System.out.print("Digite a nota ou 'Voltar' para retorna ao menu: ");
                        String nota = entrada.nextLine();

                        if(nota.equalsIgnoreCase("voltar")){
                            break;
                        }
                        float nota_int = Float.parseFloat(nota.replace(",", "."));
                        total += nota_int;
                        qtd_nota++;
                        System.out.println("Notas acumuladas");
                        System.out.println("Soma total: "+ total);
                        System.out.printf("Média atual: %.2f\n", (total/qtd_nota));
                        
                    }while(true);
                    break;
                case "2":
                    System.out.println("Encerrando o Sistema...");
                    break;
                default:{
                        System.out.println("Digite alguma das opções");
                        break;
                    }
                }
                
            } while (!opcao.equals("2"));
            
            entrada.close();
    }

}

