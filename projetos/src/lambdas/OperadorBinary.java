package lambdas;

import java.util.function.UnaryOperator;

public class OperadorBinary {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> multiDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadradoDois = n -> n * n;

        System.out.println(maisDois.andThen(multiDois).andThen(aoQuadradoDois).apply(0));
        int resultado = aoQuadradoDois.compose(multiDois).compose(maisDois).apply(0);
        System.out.println(resultado);
    }
}
