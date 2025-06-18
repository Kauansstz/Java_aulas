public class exerc_arime {
    public static void main(String[] args) {
        //primeiro passo da equação
            double expressaoParte1 = 6 * (3 + 2);
            double parte1ElevadaAoQuadrado = Math.pow(expressaoParte1, 2);
            double resultadoParte1 = parte1ElevadaAoQuadrado / 6;

        // Segundo passo da equação
            double expressaoParte2 = (1 - 5) * (2 - 7);
            double resultadoParte2 = expressaoParte2 / 2;
            double parte2ElevadaAoQuadrado = Math.pow(resultadoParte2, 2);

        // Substração da primeira e da segunda parte
            double diferenca = resultadoParte1 - parte2ElevadaAoQuadrado;

        // Terceira passo da equação 
            double diferencaElevadaAoCubo = Math.pow(diferenca, 3);
            double baseFinal = 10;
            double baseFinalElevadaAoCubo = Math.pow(baseFinal, 3);
        // Final da equação
            double resultadoFinal = diferencaElevadaAoCubo / baseFinalElevadaAoCubo;
            System.out.printf("Resultado: %.0f", resultadoFinal);

    }
}
