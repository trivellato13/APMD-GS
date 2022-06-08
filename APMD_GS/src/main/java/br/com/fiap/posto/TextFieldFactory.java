package br.com.fiap.posto;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TextFieldFactory extends JTextField {
	
	private static final long serialVersionUID = 1L;

	
	public TextFieldFactory() {
		init();
	}
	
	private void init() {
		this.setBackground(Color.WHITE);
		this.setBorder(new LineBorder(new Color(30,78,15)));
		this.setForeground(new Color(112,42,242));
		this.setFont(new Font("Futura", Font.BOLD, 12));
	}
	

}
