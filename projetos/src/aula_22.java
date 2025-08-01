
import java.util.ArrayDeque;
import java.util.Deque;

public class aula_22 {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Pequeno Príncipe");
        livros.push("DOn quixote");
        livros.push("O hobbit");

        System.out.println(livros.pop());
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());
    }
}
