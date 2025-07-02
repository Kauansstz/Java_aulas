import java.util.HashMap;
import java.util.Map;

public class exerc_loja {
    public static void main(String[] args) {
        Map<String, Double> estoque = new HashMap<>();
        estoque.put("Pão", 10.0);
        estoque.put("manteiga", 5.99);
        estoque.put("patinho", 50.0);

        double desconto = 0.10;

        for (String produto: estoque.keySet()) {
            double precoAntigo = estoque.get(produto);
            double precoComDesconto = precoAntigo * (1 - desconto);
            estoque.put(produto, Math.round(precoComDesconto * 100.0)/ 100.0);
        }

        for(Map.Entry<String,Double> entrada: estoque.entrySet()){
            System.out.println(entrada.getKey() + ": R$ " + entrada.getValue());
        }
    }    
}
