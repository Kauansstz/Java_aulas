package lambdas;

import java.util.List;
import java.util.Arrays;


public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Maria", "Pedro", "Anthony", "João");
        System.out.println("Forma tradicional: ");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\nLambda #01... ");
        aprovados.forEach(nome -> System.out.println(nome + "!!!!!!!"));
        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
        System.out.println("\nLambda #02... ");
        System.out.println("\nMethod Reference #02");
        aprovados.forEach(nome -> meuImprimir(nome));
        System.out.println("\nMethod Reference #03...");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void  meuImprimir(String nome){
        System.out.println("Oi meu nome é " + nome);
        
    }
}
