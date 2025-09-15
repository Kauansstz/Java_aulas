package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Pietro", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = n -> n.nota >= 7;

        Function<Aluno, Double> apenasNota = n -> n.nota;

        BinaryOperator<Double> somatiori = (a,b) -> a+b;

        alunos.parallelStream().filter(aprovados).map(apenasNota).reduce(somatiori).ifPresent(System.out::println);
    }

}
