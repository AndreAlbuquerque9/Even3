package passageiro;

public class Passageiro {
	
	public Passageiro(int andarInicial, int andarDestino) {
		this.andarChamaElevador = andarInicial;
		this.andarDestino = andarDestino;
	}
	
	private int andarChamaElevador;
	private int andarDestino;

	public int getAndarChamaElevador() {
		return andarChamaElevador;
	}

	public void setAndarChamaElevador(int andarChamaElevador) {
		this.andarChamaElevador = andarChamaElevador;
	}

	public int getAndarDestino() {
		return andarDestino;
	}

	public void setAndarDestino(int andarDestino) {
		this.andarDestino = andarDestino;
	}
	
}
