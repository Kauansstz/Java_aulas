
import java.util.Scanner;

public class exerc_calc_1 {

    public static void main(String[] args) {
       try(Scanner entrada = new Scanner(System.in)){

       System.out.println("Informe o primeiro salário: ");
       String valor1 = entrada.next().replace(",", ".");
       System.out.println("Informe o segundo salário: ");
       String valor2 = entrada.next().replace(",", ".");
       System.out.println("Informe o terceiro salário: ");
       String valor3 = entrada.next().replace(",", ".");

       double salario1 = Double.parseDouble(valor1);
       double salario2 = Double.parseDouble(valor2);
       double salario3 = Double.parseDouble(valor3);

       double media = (salario1 + salario2 + salario3) / 3;
       System.out.println("A média do salários é R$" + media);

       entrada.close();
    }
}
}
