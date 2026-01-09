package strings;

import java.util.Arrays;

/**
 * Utilitário para verificar Anagramas.
 * Um anagrama é uma palavra formada pela transposição das letras de outra.
 * Exemplo: "amor" e "roma".
 */
public class Anagram {

    /**
     * Verifica se duas strings são anagramas, ignorando maiúsculas/minúsculas.
     * Complexidade de Tempo: O(n log n)
     * * @param str1 Primeira string.
     * @param str2 Segunda string.
     * @return true se forem anagramas, false caso contrário.
     */
    public static boolean isAnagram(String str1, String str2) {
        // Se forem nulas ou tiverem tamanhos diferentes (após limpar), não são anagramas
        if (str1 == null || str2 == null) return false;

        // Normalização: remove espaços e converte para minúsculas
        String cleanStr1 = str1.replaceAll("\\s+", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (cleanStr1.length() != cleanStr2.length()) {
            return false;
        }

        // Conversão para arrays e ordenação
        char[] charArray1 = cleanStr1.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Comparação final
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent")); // true
        System.out.println(isAnagram("A r o m a", "Amora")); // true
    }
}