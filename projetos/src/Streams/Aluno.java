package Streams;

public class Aluno {
    final String nome;
    final Double nota;
    final Boolean bomComportamento;
    public Aluno(String nome, Double nota) {
        this(nome,nota, true);
    }
    public Aluno(String nome, Double nota, Boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

}
