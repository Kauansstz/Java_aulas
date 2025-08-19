package oo.herenca.Desafio;

public class Carro_Teste {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ferrari", "Javalo");
        c1.ligar();
        System.out.println(c1.EstaLigado());
        System.out.println("O carro está ligado");
        System.out.println("Giros do motor: " + c1.motor.giros_motor());
        System.out.println("Fator de Injeção do Motor: " + c1.motor.fatorInjecao);
        c1.Acelerar();
        c1.Acelerar();
        c1.Acelerar();
        c1.Acelerar();
        c1.Acelerar();
        System.out.println("");
        System.out.println("Giros do motor: " +  c1.motor.giros_motor());
        System.out.println("Fator de Injeção do Motor: " + c1.motor.fatorInjecao);

        Carro c2 = new Carro("Ford", "Hillux");
        c2.ligar();
        System.out.println(c2.EstaLigado());
        System.out.println("O carro está ligado");
        System.out.println("Giros do motor: " + c2.motor.giros_motor());
        System.out.println("Fator de Injeção do Motor: " + c2.motor.fatorInjecao);
        c2.Acelerar();
        c2.Acelerar();
        c2.Acelerar();
        c2.Acelerar();
        c2.Acelerar();
        System.out.println("");
        System.out.println("Giros do motor: " +  c2.motor.giros_motor());
        System.out.println("Fator de Injeção do Motor: " + c2.motor.fatorInjecao);
    }
}
