package oo.herenca;

public class Jogador {
    int x;
    int y;

    boolean Andar(Direcao direcao ){
        if(direcao == Direcao.NORTE){
            y++;
        }
        return true;
    }
}
