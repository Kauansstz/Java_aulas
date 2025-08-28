package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Caneta", 12.34, 0.2);
        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 19.90, 0.3);
        Produto p4 = new Produto("Lápis", 4.39, 0.19);
        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
