
import java.util.Scanner;

public class exerc_method {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in, "UTF-8")) {
            System.out.println("Digite o Seu nome: ");
            String nome = entrada.next();
            
            System.out.println("Digite a sua idade: ");
            int idade = entrada.nextInt();
            
            System.out.println("Agora digite o peso atual: ");
            String pesoStr = entrada.next().replace(",",".");
            double peso = Double.parseDouble(pesoStr);
            
            Pessoa p = new Pessoa(nome, idade, peso);
            
            
            System.out.println();
            System.out.println("Está sentindo fome?");
            String fome = entrada.next();
            
            
            if (fome.equalsIgnoreCase("sim") ){
                System.out.println("Digite qual a refeição: ");
                String tipo = entrada.next();
                entrada.nextLine();
                System.out.println("Digite a comida da refeição: ");
                String comida = entrada.nextLine();
                
                System.out.println("Digite o peso da refeição (g): ");
                String pesoStr2 = entrada.next();
                double pesoDouble = Double.parseDouble(pesoStr2);
                
                System.out.println("Digite as calorias da refeição: ");
                String kclStr = entrada.next();
                double kclDouble = Double.parseDouble(kclStr);
                
                Refeicao r = new Refeicao(tipo, comida, pesoDouble, kclDouble);
                r.exibirDados();
                CalcularPeso c = new CalcularPeso(p, r);
                p.exibirDados(c);
            } else {System.out.println("Encerrando o sistema...");}
        }
    }
}

class Refeicao{
    String tipo;
    String comida;
    double pesoComida;
    double kcl;
    public Refeicao(String tipo, String comida, double pesoComida, double kcl){
        this.tipo = tipo;
        this.comida = comida;
        this.pesoComida = pesoComida;
        this.kcl = kcl;
    }
    public void exibirDados(){
        System.out.println("");
        System.out.println("<----- Dados da Refeição ----->");
        System.out.println("Refeição: " + this.tipo );
        System.out.println("Qual a comida?: " + this.comida );
        System.out.println("Peso da comida: " + this.pesoComida);
        System.out.println("Total de calorias: " + this.kcl);
    }
}


class Pessoa {
    String nome;
    int idade;
    double peso;
    public Pessoa(String nome, int idade, double peso) {
       this.nome = nome;
       this.idade = idade;
       this.peso = peso;
    }
    public void exibirDados(CalcularPeso c){
        System.out.println("");
        System.out.println("<----- Dados da Pessoa ----->");
        System.out.println("Nome: " + this.nome );
        System.out.println("Idade: " + this.idade );
        System.out.println("Peso: " + c.pesoReal + "Kg");
    }
}

class CalcularPeso{
    double pesoReal;
    public CalcularPeso(Pessoa p, Refeicao r){
        this.pesoReal = p.peso + r.pesoComida / 1000; 
    }
}