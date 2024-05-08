package listas;

public class MainSistemaMecanico {
	
	static Pilha carros = new Pilha();
	
	
	public static int totalProblemas(Pilha carro) {
		
		int totalProblemas = 0;
		
		while(!carro.pEmpty()) {
			sistemaMecanico carroAtual = (sistemaMecanico) carros.pop();
			
			if(carroAtual.isMotor()) {
				carroAtual.contadorProblemas++;
			}
			if(carroAtual.isEmbreagem()) {
				carroAtual.contadorProblemas++;
			}
			if(carroAtual.isCaixaDeMarcha()) {
				carroAtual.contadorProblemas++;
			}
			if(carroAtual.isRodas()) {
				carroAtual.contadorProblemas++;
			}
			if(carroAtual.isPneus()) {
				carroAtual.contadorProblemas++;
			}
			if(carroAtual.isFreios()) {
				carroAtual.contadorProblemas++;
			}
			if(carroAtual.isSuspensao()) {
				carroAtual.contadorProblemas++;
			}
			if(carroAtual.isFluidos()) {
				carroAtual.contadorProblemas++;
			}
			totalProblemas += carroAtual.contadorProblemas;
			
		}
		return totalProblemas;
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                 
	public static void main(String[] args) {
		sistemaMecanico carro1 = new sistemaMecanico(true,false,false,false,false,false,false,false);
		sistemaMecanico carro2 = new sistemaMecanico(false,true,false,false,false,false,false,false);
		sistemaMecanico carro3 = new sistemaMecanico(false,false,true,false,false,false,false,false);
		sistemaMecanico carro4 = new sistemaMecanico(false,false,false,false,false,false,false,false);
		sistemaMecanico carro5 = new sistemaMecanico(false,false,false,false,false,false,false,false);
		
		carros.push(carro1);
		carros.push(carro2);
		carros.push(carro3);
		carros.push(carro4);
		carros.push(carro5);
		
		//System.out.println(carros);
		System.out.println(totalProblemas(carros));
		
	}
}
