package listas;

public class ContagemDeParPilha {
	
	public static int contagemPar(Pilha pilha) {
		
		int par = 0;
		
		while(pilha.pop()!= null) {
			Object elem = pilha.pop();
			
			if ((int) elem % 2 == 0) {
				par++;
			}
		}
		
		return par;
	}
	
	
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		for(int i = 0; i < 10; i++) {
			pilha.push(i);
		}
		
		
		System.out.println("A contagem de números par da pilha é: ");
		System.out.println(contagemPar(pilha));
	}
}
