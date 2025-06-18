public class exerc_op_log {
    public static void main(String[] args) {
        int idade = 25;
        System.out.println(idade > 0 && idade < 120);

        int numero = 10;
        System.out.println(numero % 2 == 0 || numero % 5 == 0); // true

        int x = 5;
        System.out.println(x < 10 || x > 50); // true
        
        int a = 3, b = 8;
        System.out.println(!(a > 5 || b < 5)); // false

    }
}
