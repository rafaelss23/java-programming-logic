import java.util.ArrayList;
import java.util.List;

/**
 * Utilitário para geração da sequência de Fibonacci.
 * A sequência começa com 0 e 1, e cada número subsequente é a soma dos dois anteriores.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Fibonacci (primeiros " + count + " números):");
        System.out.println(generate(count));
    }

    /**
     * Gera uma lista contendo a sequência de Fibonacci.
     * * @param n A quantidade de números a serem gerados.
     * @return Uma lista de inteiros com a sequência.
     * @throws IllegalArgumentException se n for menor ou igual a zero.
     */
    public static List<Integer> generate(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }

        List<Integer> sequence = new ArrayList<>();
        int current = 0;
        int next = 1;

        for (int i = 0; i < n; i++) {
            sequence.add(current);
            
            int sum = current + next;
            current = next;
            next = sum;
        }

        return sequence;
    }
}