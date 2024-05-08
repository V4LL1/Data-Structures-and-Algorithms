package listas;

public class InvertePilha {
	
	private static Pilha invertePilha(Pilha pilha) {
        Pilha pilhaInvertida = new Pilha();

        // Transfere elementos para a pilha invertida
        Object elem;
        while ((elem = pilha.pop()) != null) {
            pilhaInvertida.push(elem);
        }

        return pilhaInvertida;
    }


    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        for (int i = 0; i <= 20; i++) {
            pilha.push(i);
        }

        System.out.println("Pilha original: " + pilha);

        Pilha pilhaInvertida = invertePilha(pilha);

        System.out.println("Pilha invertida: " + pilhaInvertida);
    }
}