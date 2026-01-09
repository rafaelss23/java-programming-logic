package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Solução para o problema Two Sum.
 * Encontra os índices de dois números que somados resultam em um alvo (target).
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        try {
            int[] result = findTwoSum(nums, target);
            System.out.println("Índices encontrados: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Encontra os índices usando o método de complemento com HashMap.
     * * @param nums   Array de inteiros.
     * @param target Valor alvo da soma.
     * @return Array de 2 posições com os índices encontrados.
     * @throws IllegalArgumentException se nenhuma solução for encontrada.
     */
    public static int[] findTwoSum(int[] nums, int target) {
        // Validação básica
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("O array deve ter pelo menos dois elementos.");
        }

        // Mapeia o valor para o seu índice: Map<Valor, Indice>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Se o complemento já foi visto, encontramos a paridade
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Armazena o número atual e seu índice para consultas futuras
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("Nenhuma combinação encontrada para o alvo.");
    }
}