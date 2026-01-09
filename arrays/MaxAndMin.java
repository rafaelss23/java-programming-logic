package arrays;

/**
 * Utilitário para encontrar valores extremos em arrays.
 */
public class MaxAndMin {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 1, 7};
        
        try {
            findAndPrintLimits(numbers);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Encontra e imprime o maior e o menor valor de um array.
     * @param numbers Array de inteiros.
     * @throws IllegalArgumentException se o array for nulo ou vazio.
     */
    public static void findAndPrintLimits(int[] numbers) {
        // Validação defensiva: impede erro de ArrayIndexOutOfBounds
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio ou nulo.");
        }

        // Inicializamos com o primeiro elemento para garantir que os valores
        // pertençam ao conjunto do array.
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                // Use 'else if' porque um número não pode ser maior que o máximo 
                // e menor que o mínimo ao mesmo tempo (exceto na primeira iteração).
                min = num;
            }
        }

        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);
    }
}