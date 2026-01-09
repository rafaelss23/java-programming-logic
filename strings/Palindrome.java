package strings;

/**
 * Utilitário para verificação de Palíndromos.
 * Um palíndromo é uma palavra ou frase que se lê da mesma forma 
 * de trás para frente, ignorando espaços e pontuação.
 */
public class Palindrome {

    /**
     * Verifica se uma string é um palíndromo.
     * Complexidade de Tempo: O(n)
     * Complexidade de Espaço: O(1)
     * * @param text O texto a ser verificado.
     * @return true se for palíndromo, false caso contrário.
     */
    public static boolean isPalindrome(String text) {
        if (text == null) return false;

        // Sanitização: Remove tudo que não for letra ou número e converte para minúsculas
        String cleanText = text.replaceAll("[^a-zA-Z0-0]", "").toLowerCase();
        
        if (cleanText.isEmpty()) return true;

        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Ame a ema")); // true
        System.out.println(isPalindrome("RadAr"));     // true
        System.out.println(isPalindrome("Java"));      // false
    }
}