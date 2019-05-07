package elevador;

import java.util.ArrayList;
import java.util.LinkedList;

import passageiro.Passageiro;

public class Elevador {

	public Elevador(int posicaoElevador) {
		this.posicaoElevador = posicaoElevador;
	}

	private int andarDestino;
	private int posicaoElevador;

	public int getPosicaoElevador() {
		return posicaoElevador;
	}

	public int getAndarDestino() {
		return andarDestino;
	}

	public void setAndarDestino(int andarDestino) {
		this.andarDestino = andarDestino;
	}

	public void movimentarElevador(Passageiro... passageiros) {
		ArrayList<Integer> andares = new ArrayList<Integer>();
		LinkedList<Integer> sequencia = new LinkedList<Integer>();
		
		for(Passageiro p : passageiros) {
			andares.add(p.getAndarChamaElevador());
		}
		
		primeiroMovimento(andares);
		
		for(Passageiro p : passageiros) {
			sequencia.add(p.getAndarChamaElevador());
			System.out.println("Pega passageiro no andar: " + p.getAndarChamaElevador());
			sequencia.add(p.getAndarDestino());
			System.out.println("Deixa passageiro no andar: " + p.getAndarDestino());
		}
	}

	public int primeiroMovimento(ArrayList<Integer> andares) {
		int andarInicial = getPosicaoElevador();
		int primeiroDestino = andares.indexOf(0);
		int menorDistancia = Math.abs(andarInicial - andares.indexOf(0));
		for(int i : andares) {
			if(Math.abs(andarInicial - i) < menorDistancia) {
				primeiroDestino = i;
			}
		}
		if(primeiroDestino != andarInicial) {
			System.out.println("Elevador move para andar: " + primeiroDestino);
		}
		
		return primeiroDestino;
	}

}
