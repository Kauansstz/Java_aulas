package oo.herenca;

public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        j1.Andar(Direcao.NORTE);
        j1.Andar(Direcao.NORTE);
        j1.Andar(Direcao.NORTE);
        j1.Andar(Direcao.NORTE);

        System.out.println(j1.y);
    }
}
