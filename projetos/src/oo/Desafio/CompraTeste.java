package oo.Desafio;


public class CompraTeste {
    public static void main(String[] args) {
    Compra c1 = new Compra();
    c1.cliente = "Pedro";
    System.out.println("<---------->");
    c1.adicionarItem(new Item("Caneta", 2,4.60));
    c1.adicionarItem(new Item("Caderno", 3,8.90));
    c1.adicionarItem(new Item("Mochila", 2,14.60));
    System.out.println(c1.obterValorTotal());
    System.out.println(c1.itens.size());
    }
}
