package algorithms;

/**
 * Implementação do algoritmo de Busca Binária.
 * A busca binária encontra a posição de um valor específico em um array ordenado.
 * Complexidade de Tempo: O(log n)
 */
public class BinarySearch {

    /**
     * Realiza a busca binária em um array de inteiros.
     * * @param arr    Array ordenado onde a busca será feita.
     * @param target O valor que estamos procurando.
     * @return O índice do elemento se encontrado; caso contrário, retorna -1.
     */
    public static int search(int[] arr, int target) {
        // Tratamento de erro: se o array for nulo ou vazio
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Evita overflow de memória em arrays muito grandes
            // Em vez de (left + right) / 2, usamos:
            int mid = left + (right - left) / 2;

            // Caso base: elemento encontrado
            if (arr[mid] == target) {
                return mid;
            }

            // Se o alvo for maior, ignora a metade esquerda
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // Se o alvo for menor, ignora a metade direita
            else {
                right = mid - 1;
            }
        }

        // Retorna -1 se o elemento não estiver presente no array
        return -1;
    }
}