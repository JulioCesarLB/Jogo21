package br.com.fiap.jogo.model;

public class Carta {
	private int num;
	private Naipe naipe;
	public Carta(int num, Naipe naipe) {
		super();
		this.num = num;
		this.naipe = naipe;
	}
	public int getNum() {
		return num;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	public String toString() {
		switch (num) {
		case 1:
			return "A " + naipe;
					
		case 11:
			return "Q " + naipe;
			
		case 12:
			return "J " + naipe;
			
		case 13:
			return "K " + naipe;
			
		default:
			return num +" "+ naipe;
		}
	}
}
