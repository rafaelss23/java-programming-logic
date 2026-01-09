package arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

/**
 * Utilitário para remoção de elementos duplicados em arrays.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5, 1};

        System.out.println("Array original: " + Arrays.toString(nums));
        
        // Chamada do método que retorna os únicos
        Integer[] uniqueNumbers = remove(nums);
        
        System.out.println("Array sem duplicatas: " + Arrays.toString(uniqueNumbers));
    }

    /**
     * Remove duplicatas de um array de inteiros.
     * Utiliza LinkedHashSet para manter a ordem original de inserção.
     * * @param nums Array original com possíveis duplicatas.
     * @return Array contendo apenas elementos únicos.
     */
    public static Integer[] remove(int[] nums) {
        if (nums == null) return new Integer[0];

        // LinkedHashSet: Remove duplicatas E mantém a ordem original.
        // Se a ordem não importar, use apenas HashSet (levemente mais rápido).
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }

        // Converte o Set de volta para um array
        return set.toArray(new Integer[0]);
    }
}