package lambdas;

import java.util.function.BinaryOperator;

public class Calculo_Teste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (x, y) -> {return x + y;};
        System.out.println(soma.apply(12.0,2.0));
    }
}
