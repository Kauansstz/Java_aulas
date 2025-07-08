public class aula_18 {
    public static void main(String[] args) {
        double[] notas = {7.9, 8.0, 6.7, 9.7};
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}
