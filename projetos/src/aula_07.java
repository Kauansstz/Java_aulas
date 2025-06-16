public class aula_07 {

    public static void main(String[] args) {
        System.out.println("Olá Mundo".charAt(0));

        String s = "Boa Tarde";
        System.out.println(s);
        s = "Bom dia";
        System.out.println(s);
        System.out.println(s.length());

        var nome = "Pedro";
        var sobrenome = "Santos";
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);

        System.out.printf("O senhor %s %s", nome, sobrenome);

        String frase = String.format("\nO senhor %s %s", nome, sobrenome);

        System.out.println(frase);
    }
}