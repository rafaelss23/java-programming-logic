/**
 * Utilitário para cálculos matemáticos.
 */
public class Factorial {

    /**
     * Calcula o fatorial de um número.
     * Usamos 'long' para o retorno pois fatoriais crescem muito rápido 
     * e ultrapassam o limite do 'int' (2^31-1) a partir de n=13.
     * * @param n O número a ser calculado (deve ser não-negativo).
     * @return O fatorial de n.
     * @throws IllegalArgumentException se n for negativo.
     */
    public static long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Não é possível calcular fatorial de número negativo.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("O fatorial de " + number + " é: " + calculate(number));
    }
}