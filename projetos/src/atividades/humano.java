package atividades;

import java.util.HashSet;
import java.util.Scanner;

public class humano {
    String nome;
    int idade;
    String sexo;

    public humano(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade= idade;
        this.sexo = sexo;
    }
    public String setNome(){
        return nome;
    }
    public int setIdade(){
        return idade;
    }
    public String setSexo(){
        return sexo;
    }
    
    public void VerificarNome(String nome){
        HashSet<String> nomesUnicos = new HashSet<>();
        if (nomesUnicos.size() < nomesUnicos.size()) {
            nomesUnicos.add(nome);
            for(int i = 0; i < nomesUnicos.size(); i++){
                System.out.println((i + 1) + " - " + nome);
            }
        } 
    }

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = info.nextLine();

        System.out.println("Digite a idade: ");
        int idade = info.nextInt();
        info.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o sexo: ");
        String sexo = info.nextLine();

        humano pessoa = new humano(nome, idade, sexo);

        System.out.println("Nome: " + pessoa.setNome());
        System.out.println("Idade: " + pessoa.setIdade());
        System.out.println("Sexo: " + pessoa.setSexo());
        
        pessoa.VerificarNome(nome);
        info.close();

        
    }
}
