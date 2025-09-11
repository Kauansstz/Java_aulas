package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFIlterGUI2 {
    public static void main(String[] args) {
        DesafioFilter2 compra1 = new DesafioFilter2("Tv 50 pol.", 3550.99, 0.30, false);
        DesafioFilter2 compra2 = new DesafioFilter2("Notebook", 2450.99, 0.25, true);
        DesafioFilter2 compra3 = new DesafioFilter2("Caixa de som", 1250.99, 0.18, false);
        DesafioFilter2 compra4 = new DesafioFilter2("Drone", 6874.99, 0.34, true);
        List<DesafioFilter2> listaCompra = Arrays.asList(compra1, compra2, compra3, compra4);
        Predicate<DesafioFilter2> maiorDesconto =n -> n.desconto >= 0.30;
        Predicate<DesafioFilter2> frete =n -> n.freteGratis == true;
        Function<DesafioFilter2, String> msg = a -> "\nProduto: " + a.nome + " | Desconto: " + a.desconto + " | Preço: " + a.preco + " | SUPER PROMOÇÃO "+ " | Frete Grátis ";
        listaCompra.stream().filter(maiorDesconto).filter(frete).map(msg).forEach(System.out::print);
    }
}
