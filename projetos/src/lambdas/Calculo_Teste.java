package lambdas;

public class Calculo_Teste {
    public static void main(String[] args) {
        Calculo soma = new Soma();
        Calculo multiplicacao = new Multiplicar();
        System.out.println(soma.executar(5, 5));

    }
}
