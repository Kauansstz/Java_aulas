package atividades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Humano {
    String nome;
    int idade;
    String sexo;
    public static HashSet<Humano> nomeUnico = new HashSet<>();

    public Humano(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade= idade;
        this.sexo = sexo;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getSexo(){
        return sexo;
    }

    public boolean validarIdade(int idade){
        if (idade < 18){
            System.out.println("Usuário deve ter mais ou igual a 18 anos.");
            return false;
        }
        return true;
    }

    public boolean validarNomeUnico(){
        if(nome == null || nome.isEmpty()){
            System.out.println("Os campos devem ser preenchidos");
            return false;
        }
        if (nomeUnico.contains(this)) {
            System.out.println("Usuário cadastrado");    
            return false;

        }
        nomeUnico.add(this);
        return true;
    }

    
    public static void Addinfo(String nome, int idade, String sexo){
        Humano pessoa = new Humano(nome, idade, sexo);  
        if (pessoa.validarNomeUnico() && pessoa.validarIdade(idade)){
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Sexo: " + pessoa.getSexo());
        }
        
    }
    
    @Override
    public boolean  equals(Object obj){
        if (this == obj) return true;
        if(!(obj instanceof Humano)) return false;
        Humano outro = (Humano) obj;
        return Objects.equals(this.nome, outro.nome) && this.idade == outro.idade && Objects.equals(this.sexo, outro.sexo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome,idade, sexo);
    }

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        String nome;
        String sexo;
        int idade;
        boolean ligado = true;
        while (ligado){
            System.out.println("<---------Menu--------->");
            System.out.println("Escolha uma da opções: ");
            System.out.println("1- Cadastrar dados.");
            System.out.println("2- Sair.");
            String opcao = info.nextLine();
            switch (opcao) {
                case "1" -> {
                    System.out.println("Digite o nome: ");
                    nome = info.nextLine();

                    System.out.println("Digite a idade: ");
                    idade = info.nextInt();
                    info.nextLine(); // Consumir a quebra de linha pendente

                    System.out.println("Digite o sexo: ");
                    sexo = info.nextLine();
                    Addinfo(nome, idade, sexo);
                    
                }
                
                case "2" -> { 
                    System.out.println("Encerrando o sistema...");
                    ligado = false;
                    try {
                        Thread.sleep(1800);
                    } catch (InterruptedException e) {
                        System.out.println("Erro ao encerrar o sistema." + " - "+e);
                    }
                }
                default -> {
                    System.out.println("Digite alguma das opções");
                }
            }
           
            
        }

        
        info.close();

        
    }
}
