package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterGUI1 {
    public static void main(String[] args) {
        DesafioFilter1 c1 = new DesafioFilter1("Pedro", "Gerente", 4500.0);
        DesafioFilter1 c2 = new DesafioFilter1("Joao", "Repositor", 1500.0);
        DesafioFilter1 c3 = new DesafioFilter1("Bianca", "Lider", 2500.0);
        List<DesafioFilter1> info = Arrays.asList(c1,c2,c3);
        Predicate<DesafioFilter1> doisSalarios = d -> d.salario >= 2500;
        Function<DesafioFilter1, String> pesosasDoisSalarios = a -> "\nParabéns "+ a.nome + "!" +" Você é um " + a.cargo + " com salário de " + a.salario;
        info.stream().filter(doisSalarios).map(pesosasDoisSalarios).forEach(System.out::print);
    }
}
