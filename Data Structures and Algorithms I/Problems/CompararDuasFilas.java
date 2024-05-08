package listas;

public class CompararDuasFilas {
	
	public static Fila compararFilas(Fila f1, Fila f2) {
		
		Fila fTemp1 = new Fila();
		Fila fTemp2 = new Fila();
		
		int contador1 = 0;
		int contador2 = 0;
		
		while(!f1.fEmpty()) {
			Object elem = f1.remover();
			fTemp1.inserir(elem);
			contador1++;
		}
		
		while(!f2.fEmpty()) {
			Object elem = f2.remover();
			fTemp2.inserir(elem);
			contador2++;
		}
		
		if (contador1 > contador2) {
			return fTemp1;
		}else {
			return fTemp2;
		}
		
	}
	
	public static void main(String[] args) {
	
		Fila f1 = new Fila();
		Fila f2 = new Fila();
		
		for (int i = 0; i < 10; i++) {
			f1.inserir(i);
		}
		
		for (int i = 0; i < 5; i++) {
			f2.inserir(i);
		}
		
		System.out.println("A fila com mais elementos é: ");
		System.out.println(compararFilas(f1, f2));
	}
}
