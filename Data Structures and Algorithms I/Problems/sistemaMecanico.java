package listas;

public class sistemaMecanico {
	
	private boolean motor;
	private boolean embreagem;
	private boolean caixaDeMarcha;
	private boolean rodas;
	private boolean pneus;
	private boolean freios;
	private boolean suspensao;
	private boolean fluidos;
	public int contadorProblemas = 0;
	
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isEmbreagem() {
		return embreagem;
	}
	public void setEmbreagem(boolean embreagem) {
		this.embreagem = embreagem;
	}
	public boolean isCaixaDeMarcha() {
		return caixaDeMarcha;
	}
	public void setCaixaDeMarcha(boolean caixaDeMarcha) {
		this.caixaDeMarcha = caixaDeMarcha;
	}
	public boolean isRodas() {
		return rodas;
	}
	public void setRodas(boolean rodas) {
		this.rodas = rodas;
	}
	public boolean isPneus() {
		return pneus;
	}
	public void setPneus(boolean pneus) {
		this.pneus = pneus;
	}
	public boolean isFreios() {
		return freios;
	}
	public void setFreios(boolean freios) {
		this.freios = freios;
	}
	public boolean isSuspensao() {
		return suspensao;
	}
	public void setSuspensao(boolean suspensao) {
		this.suspensao = suspensao;
	}
	public boolean isFluidos() {
		return fluidos;
	}
	public void setFluidos(boolean fluidos) {
		this.fluidos = fluidos;
	}
	public sistemaMecanico(boolean motor, boolean embreagem, boolean caixaDeMarcha, boolean rodas, boolean pneus,
			boolean freios, boolean suspensao, boolean fluidos) {
		super();
		this.motor = motor;
		this.embreagem = embreagem;
		this.caixaDeMarcha = caixaDeMarcha;
		this.rodas = rodas;
		this.pneus = pneus;
		this.freios = freios;
		this.suspensao = suspensao;
		this.fluidos = fluidos;
	}
	@Override
	public String toString() {
		return "sistemaMecanico [motor=" + motor + ", embreagem=" + embreagem + ", caixaDeMarcha=" + caixaDeMarcha
				+ ", rodas=" + rodas + ", pneus=" + pneus + ", freios=" + freios + ", suspensao=" + suspensao
				+ ", fluidos=" + fluidos + "]";
	}
	
}
