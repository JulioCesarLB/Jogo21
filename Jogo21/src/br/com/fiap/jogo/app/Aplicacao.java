package br.com.fiap.jogo.app;

import java.awt.Font;

import static javax.swing.JOptionPane.*;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import br.com.fiap.jogo.model.Carta;
import br.com.fiap.jogo.model.Naipe;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		int r = showConfirmDialog(null, "TESTE","Carta?",0);
		
		Carta c = new Carta(4, Naipe.PAUS);
		showMessageDialog(null,c);
		c = new Carta(13, Naipe.OUROS);
		showMessageDialog(null,c);
		
		UIManager.put("OptionPane.messageFont", new
				FontUIResource(new Font("Consola 0", Font.PLAIN, 150)));
		
		String s = "\uD83C\uDCA1";
		showMessageDialog(null,s);
		
		
	}

}
