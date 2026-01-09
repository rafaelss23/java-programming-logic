package algorithms;

/**
 * Algoritmo de Ordenação Bubble Sort.
 * Organiza um array de inteiros em ordem crescente.
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        if (isInvalid(arr)) return;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // Se não houve troca, o array já está ordenado
            if (!swapped) break;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static boolean isInvalid(int[] arr) {
        return arr == null || arr.length <= 1;
    }
}