public class aula_02 {

    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14;
        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area);
    }
}
