package br.com.fiap.posto;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JRadioButton;

public class RadioButtonFactory extends JRadioButton {
	
	private static final long serialVersionUID = 1L;
	private String title = "";
	
	public RadioButtonFactory(String title) {
		super(title);
		this.title = title;
		init();
	}
	
	private void init() {
		this.setActionCommand(title);
		this.setBackground(Color.BLUE);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Futura", Font.BOLD, 13));
	}


}
