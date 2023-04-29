package br.com.fiap.jogo.model;

import static javax.swing.JOptionPane.showConfirmDialog;

public class Jogador {
	private Carta[] mao;
	private int pontos=0;
	private int posVazia;

	public Jogador(Carta c, Carta d) {
		mao = new Carta[20];
		mao[0] = c;
		mao[1] = d;
		posVazia = 2;
		if (c.getNum() > 10) 
			pontos = pontos + 10;
		else
			pontos = pontos +c.getNum();
		
		if(d.getNum()>10)
			pontos = pontos +10;
		else
			pontos = pontos +d.getNum();
	}
	public int getPontos() {
		return pontos;
	}
	public void adiciona (Carta c) {
		mao[posVazia] = c;
		posVazia++;
		if(c.getNum()>10)
			pontos = pontos+10;
		else
			pontos = pontos + c.getNum();
	}
	public boolean querCarta() {
		return 0 == showConfirmDialog(null, toString(),"Carta?",0);
		
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<posVazia;i++) {
			sb.append(mao[i]);
			sb.append(" ");
		}
		
		sb.append("\nPontos: "+pontos);
		return sb.toString();
	}
}
