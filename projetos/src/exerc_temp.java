public class exerc_temp {

    public static void main(String[] args) {
        double fahrenheit = 86;
        double p1 = 5.0 / 9.0;
        final double AJUSTE = 32;
        double conversao = (fahrenheit - AJUSTE) * p1;
        System.out.println("A conversão de fahrenheit para Celsius é " + conversao + "ºC");
    }

}
