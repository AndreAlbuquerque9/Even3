package testes;

import elevador.Elevador;
import passageiro.Passageiro;

public class TesteElevado10Andares {

	public static void main(String[] args) {

		Elevador elevador = new Elevador(5);
		Passageiro Ana = new Passageiro(8, 0);
		Passageiro Kleber = new Passageiro(0, 10);
		
		elevador.movimentarElevador(Ana, Kleber);
		
	}

}
