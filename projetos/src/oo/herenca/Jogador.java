package oo.herenca;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x-oponente.x);
        int deltaY = Math.abs(x-oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.vida  -=10;
            return true;
        }else if (deltaX == 1 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else{
            return false;
        }
    }
    boolean Andar(Direcao direcao ){
        if(direcao == Direcao.NORTE){
            y++;
        }
        return true;
    }
}
