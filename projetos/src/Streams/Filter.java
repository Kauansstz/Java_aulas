package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 9.5);
        Aluno a3 = new Aluno("Joao", 4.0);
        Aluno a4 = new Aluno("Pedro", 5.5);
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        Predicate<Aluno> aprovado = a->a.nota >= 7;
        Function<Aluno, String> saudacao = a -> "\nParabens " + a.nome + " você foi aprovado";
        alunos.stream().filter(aprovado).map(saudacao).forEach(System.out::print);;
    }
}
