public class aula_11 {
    public static void main(String[] args) {
        double a = 1; //Conversão implicita
        System.out.println(a);

        float b = (float) 1.0748574748; // Explicita (Cast)
        System.out.println(b);

        int c = 422;
        byte d = (byte) c;
        System.out.println(d);
    }
}
