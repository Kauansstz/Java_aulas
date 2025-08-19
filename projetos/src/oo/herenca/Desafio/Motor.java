package oo.herenca.Desafio;

public class Motor {
    final Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    Motor(Carro carro){
        this.carro  = carro;
    }

    int giros_motor(){
        if (!ligado) {
            return 0;
        }
        else{
            return (int) Math.round( fatorInjecao * 3000);
        }
    }
}
