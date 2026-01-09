/**
 * Implementação do desafio FizzBuzz.
 * Regras: 
 * - Múltiplos de 3 imprimem "Fizz"
 * - Múltiplos de 5 imprimem "Buzz"
 * - Múltiplos de ambos imprimem "FizzBuzz"
 * - Caso contrário, imprime o próprio número.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        execute(1, 100);
    }

    /**
     * Executa o FizzBuzz em um intervalo definido.
     * @param start Início do intervalo.
     * @param end Fim do intervalo.
     */
    public static void execute(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(getResult(i));
        }
    }

    /**
     * Determina a string de saída para um número específico.
     * @param n Número a ser avaliado.
     * @return String correspondente (Fizz, Buzz, FizzBuzz ou o número).
     */
    public static String getResult(int n) {
        StringBuilder sb = new StringBuilder();

        if (n % 3 == 0) sb.append("Fizz");
        if (n % 5 == 0) sb.append("Buzz");

        // Se o StringBuilder estiver vazio, retorna o número, 
        // caso contrário, retorna a string acumulada.
        return sb.length() == 0 ? String.valueOf(n) : sb.toString();
    }
}