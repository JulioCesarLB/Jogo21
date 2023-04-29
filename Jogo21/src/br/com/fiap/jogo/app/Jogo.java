package br.com.fiap.jogo.app;

import br.com.fiap.jogo.model.Baralho;
import br.com.fiap.jogo.model.Carta;
import br.com.fiap.jogo.model.Cpu;
import br.com.fiap.jogo.model.Jogador;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baralho b = new Baralho();
		b.embaralha();
		
		Carta c = b.compra();
		Carta d = b.compra();
		
		
		
		Jogador hum = new Jogador(c,d);
		c = b.compra();
		d = b.compra();
		Cpu cpu = new Cpu(c,d);
		
		
		while(cpu.querCarta()) {
			c = b.compra();
			cpu.adiciona(c);
		}
		
		
		while(hum.querCarta()) {
			c = b.compra();
			hum.adiciona(c);
		}
		
		System.out.println("humano: "+hum.getPontos());
		System.out.println("CPU: "+cpu.getPontos());
	}

}
