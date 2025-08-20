package oo.encapsulamento;

public class Pessoa {
    private int idade = 0;

    public Pessoa (int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
}
