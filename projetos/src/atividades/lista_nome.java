package atividades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class lista_nome {
    private List<String> nomes;

    public  lista_nome(){
        this.nomes = new ArrayList<>();
        
    }

    public String lista_nome(){
        return String.join(", ", nomes);
    }
    public void Addnome(String nome) {
        if (nome != null){
            this.nomes.add(nome);
        } else {
            System.out.println("Nome não pode ser nulo.");
        }
    }

    public void ListaComIndice() {
        HashSet<String> nomesUnicos = new HashSet<>(nomes);
        if (nomesUnicos.size() < nomes.size()) {
            for (int i = 0; i < nomesUnicos.size(); i++) {
                System.out.println((i + 1) + " - " + nomes.get(i));
        } 
        }
    }


    public boolean VerificaNome(String nome) {
        return nomes.contains(nome);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lista_nome lista = new lista_nome();
        String opcao;
        
        System.out.println("");
        System.out.println("Bem-vindo ao sistema de lista de nomes!");
        do{
            System.out.println("<-----Menu de Nomes----->");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar nome.");
            System.out.println("2 - Listar nomes.");
            System.out.println("3 - Procurar nome.");
            System.out.println("4 - Sair.");
            opcao = scanner.next();
            
            switch (opcao){
            case "1": 
                System.out.println("Digite o nome a ser adicionado: ");
                String nome = scanner.next();
                lista.Addnome(nome);
                System.out.println("Nome adicionado com sucesso!");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Erro ao pausar o sistema.");
                }
                break;
            case "2":
                System.out.println("Lista de nomes: ");
                lista.ListaComIndice();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Erro ao pausar o sistema.");
                }
                break;
            case "3":
                System.out.println("Digite o nome a ser procurado: ");
                String nomeProcurado = scanner.next();
                if(lista.nomes.contains(nomeProcurado)){
                    System.out.println("Nome encontrado: " + nomeProcurado);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        System.out.println("Erro ao pausar o sistema.");
                    }
                } else {
                    System.out.println("Nome não encontrado.");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        System.out.println("Erro ao pausar o sistema.");
                    }
                }
                break;
            case "4":
                System.out.println("Saindo do sistema...");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Erro ao pausar o sistema.");
                }
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
            }


        } while(!opcao.equalsIgnoreCase("4"));

        scanner.close();
    }
}