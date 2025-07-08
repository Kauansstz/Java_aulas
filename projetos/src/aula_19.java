public class aula_19 {
    public static void main(String[] args) {
        double[] notas = {7.9, 8.0, 6.7, 9.7};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }
} 
}
