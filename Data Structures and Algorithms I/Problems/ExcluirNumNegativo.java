package listas;

public class ExcluirNumNegativo {
	
	static Fila fila = new Fila();
	
	public static void removerNegativos(Fila fila) {
		
		Fila filaTemp = new Fila();

		
		while(!(fila.remover()!=null)){
			Object elem = fila.remover();
			if ((int)elem >= 0) {
				filaTemp.inserir(elem);
			}
		}
		
        while (filaTemp.remover()!=null) {
            fila.inserir(filaTemp.remover());
        }
	}
	
	public static void main(String[] args) {
		
		for (int i = -10; i < 11; i++) {
			fila.inserir(i);
		}
		
		System.out.println("Lista de números iniciais: ");
		System.out.println(fila);
		System.out.println("Lista de números após a remoção: ");
		removerNegativos(fila);
		System.out.println(fila);
		
	}
}
