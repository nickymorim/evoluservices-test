public class Palindrome {

    public static boolean isPalindrome(String name) {
        name = name.toLowerCase(); //passa o nome para minúsculo para não ter problema de diferença entre maiúscula e minúscula

        int j = name.length() - 1;

        for (int i = 0; i < j; i++) {
            if (name.charAt(i) != name.charAt(j)) { //o charAt pega o caracter de cada índice
                //verifica se o caracter do indice i é igual ao caracter do indice j
                return false;

            }
            j--; //enquanto o i vai "aumentando" o j deve ir "diminuindo" para comparar a "ida e a volta" da palavra
        }
        return true;
    }

    public static void main(String args[]) {
        String name = "dada";

        if (isPalindrome(name)) { //se retornar true, é um palíndromo
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It isn't a palindrome");
        }
    }

}
