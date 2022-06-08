package br.com.fiap.posto;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelFactory extends JLabel {
	
	private static final long serialVersionUID = 1L;
	private int fontSize = 13;
	
	public LabelFactory(String texto) {
		super(texto);
		init();
	}
	
	private void init() {
		this.setHorizontalAlignment(JLabel.LEFT);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Futura", Font.BOLD, fontSize));
	}

}
