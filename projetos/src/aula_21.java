
import java.util.LinkedList;
import java.util.Queue;

public class aula_21 {
    
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Calors");
        fila.offer("Bia");
        fila.add("Gui");

        System.out.println("");
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());
    }
}

// Por que usar Queue?
// Você usa uma fila quando precisa garantir que as tarefas ou dados serão processados na ordem em que chegaram. Exemplos:

// Atendimento ao cliente — o primeiro que chegou é o primeiro a ser atendido.

// Impressão de documentos — os arquivos são enviados à impressora na ordem correta.

// Processamento de pedidos — pedidos são processados em sequência.