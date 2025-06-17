
import javax.swing.JOptionPane;

public class aula_13 {
    public static void main(String[] args) {
         String valor1 = JOptionPane.showInputDialog("Digite o primeiro Número: ");
         String valor2 = JOptionPane.showInputDialog("Digite o segundo Número: ");

         System.out.println(valor1 + valor2);

         double n1 = Double.parseDouble(valor1);
         double n2 = Double.parseDouble(valor2);

         double soma = n1 + n2;
         System.out.println("Soma é " + soma);
         System.out.println("Média é " + soma/2);
    }
}
