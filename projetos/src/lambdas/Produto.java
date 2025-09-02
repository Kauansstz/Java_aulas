package lambdas;

public class Produto extends Object{
    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    public String toString(){
        double precoFinal = preco * (1-desconto);
        return  nome + " tem preço de R$ "+ precoFinal;
    }
    public Double getPreco(){
        double precoFinal2 = preco * (1-desconto);
        return precoFinal2;
    }
}
