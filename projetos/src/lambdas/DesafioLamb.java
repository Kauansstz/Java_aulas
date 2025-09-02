package lambdas;
import java.util.Map;
import java.util.HashMap;

public class DesafioLamb extends Produto{
    private String municipio;

    public DesafioLamb(String nome, double preco, double desconto, String municipio){
        super(nome, preco, desconto);
        this.municipio = municipio;
    }
    public static void Arredondar2(Produto... produtos){
        for(Produto p: produtos){
            System.out.println(String.format("%.2f", p.getPreco()));
        }
        
    }
    public static void LojasEMuncipios(DesafioLamb... produtos){
        Map<String, Double>  taxaMunicipios = new HashMap<>();
        taxaMunicipios.put("São José", 0.18);
        taxaMunicipios.put("Palhoça", 0.15);
        taxaMunicipios.put("Santo Amaro", 0.20);
        for (DesafioLamb p : produtos){
            double precoBase = p.getPreco();
            double taxa = taxaMunicipios.getOrDefault(p.municipio, 0.0);
            double valorTotal = precoBase * (1 + taxa);
            System.out.println(p.nome + " | Município: " + p.municipio);
            System.out.println("Valor com taxa: " + String.format("R$ %.2f", valorTotal));
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        DesafioLamb p1 = new DesafioLamb("iPad", 3250.89, 0.13, "São José");
        DesafioLamb p2 = new DesafioLamb("Computador", 8749.99, 0.15, "Palhoça");
        DesafioLamb p3 = new DesafioLamb("Mouse", 350.00, 0.10, "Santo Amaro");
        LojasEMuncipios(p1, p2, p3);
    }
}

// 1. A partir do produto calcular o preco real (com desconto) ✔
// 2. Imposto Municipal >= 2500 (8,5%) / < 2500 (Isento)
// 3. Frete >= 3000 (100) / < 3000 (50)
// 4. Arredondar: Deixar duas casas decimais
// 5. Formatar: R$ 1234,56