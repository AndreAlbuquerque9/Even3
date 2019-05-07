package testes;

import elevador.Elevador;
import passageiro.Passageiro;

public class TesteElevador20Andares {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(3);
		Passageiro Denis = new Passageiro(3, 15);
		Passageiro Kaio = new Passageiro(8, 0);
		Passageiro Diva = new Passageiro(0, 7);

		elevador.movimentarElevador(Denis, Kaio, Diva);
	}

}
