package listas;

public class Palindromo {

    public static boolean isPalindrom(String palavra) {
        Pilha pilha = new Pilha();

        // Adiciona cada letra da palavra à pilha
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            pilha.push(letra);
        }

        // Compara a palavra original com a palavra invertida
        for (int i = 0; i < palavra.length(); i++) {
            char letraOriginal = palavra.charAt(i);
            char letraInvertida = (char) pilha.pop();

            if (letraOriginal != letraInvertida) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palavra = "teclado";

        if (isPalindrom(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }
    }
}

