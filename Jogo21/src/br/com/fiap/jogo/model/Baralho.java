package br.com.fiap.jogo.model;

import java.util.Random;

public class Baralho {
	private Carta[] monte;
	private int top;
	
	public Baralho() {
		this.monte = new Carta[52];
		this.top = 52;
		
		
	int auxiliar=0;
	for (Naipe naipin : Naipe.values()) {
		for(int i =1; i<=13;i++) {
			monte[auxiliar] = new Carta(i, naipin);
			auxiliar++;
		}
	}
	}
	
	public Carta compra() {
		if(top==0)
			return null;
		else
			return monte[(--top)];
	}
	
	public void embaralha() {
		Random rand = new Random();
		for(int i =0; i <357;i++) {
			int x = rand.nextInt(52);
			int y = rand.nextInt(52);
			Carta aux = monte[x];
			monte[x]= monte[y];
			monte[y]=aux;
		}
	}
}
