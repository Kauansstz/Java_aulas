package oo.herenca.Desafio;

public class Carro {
    final oo.herenca.Desafio.Motor motor;
    String marca;
    String modelo;

    Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(this);
    }
    void Acelerar(){
        if (!this.marca.equalsIgnoreCase("Ferrari")) {
            if (motor.fatorInjecao < 2.6) {
                motor.fatorInjecao += 0.4;
            } 
        }
        else{
            if (motor.fatorInjecao < 2.6) {
                motor.fatorInjecao += 1;
            }
        }
    }
    void frear(){
        if (!this.marca.equalsIgnoreCase("Ferrari")) {
            motor.fatorInjecao -= 0.4;
        }else{
            motor.fatorInjecao -= 1;
        }
    }

    void ligar(){
        motor.ligado = true;
    }
    void desligado(){
        motor.ligado = false;
    }
    boolean EstaLigado(){
        return motor.ligado;
    }
}
