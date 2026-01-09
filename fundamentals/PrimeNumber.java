/**
 * Utilitário para verificação de números primos.
 * Um número primo é um número natural maior que 1 que possui 
 * apenas dois divisores: 1 e ele mesmo.
 */
public class PrimeNumber {

    /**
     * Verifica se um número é primo de forma eficiente.
     * Complexidade de Tempo: O(√n)
     * * @param number O número a ser testado.
     * @return true se for primo, false caso contrário.
     */
    public static boolean isPrime(int number) {
        // Casos base: números menores ou iguais a 1 não são primos
        if (number <= 1) return false;
        
        // 2 e 3 são primos
        if (number <= 3) return true;

        // Otimização: elimina todos os números pares e múltiplos de 3 de uma vez
        if (number % 2 == 0 || number % 3 == 0) return false;

        // Verifica divisores a partir de 5, pulando múltiplos de 2 e 3
        // Todo número primo maior que 3 pode ser escrito na forma 6k ± 1
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int testNumber = 29;
        if (isPrime(testNumber)) {
            System.out.println(testNumber + " é um número primo.");
        } else {
            System.out.println(testNumber + " não é um número primo.");
        }
    }
}