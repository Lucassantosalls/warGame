package WarGame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class WarGame implements ActionListener{

	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel tituloTela = new JPanel();
	JPanel botaoTela = new JPanel();
	JLabel texto = new JLabel();
//	JButton[] botoes = new JButton[9];
	JButton botoes = new JButton();
	boolean maquinaJogando;

	
	WarGame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		texto.setBackground(new Color(25,25,25));
		texto.setForeground(new Color(255, 255, 255));
		texto.setFont(new Font("Arial",Font.PLAIN,100));
		texto.setHorizontalAlignment(JLabel.CENTER);
		texto.setText("War Game");
		texto.setOpaque(true);
		
		tituloTela.setLayout(new BorderLayout());
		tituloTela.setBounds(0,0,800,100);
		
		botaoTela.setLayout(new GridLayout(9,9));
		botaoTela.setBackground(new Color(150,150,150));
		
		botoes = new JButton();
		botaoTela.add(botoes);
		botoes.setFont(new Font("Arial",Font.PLAIN,50));
		botoes.setText("JOGAR DADO");
		botoes.setFocusable(false);
		botoes.addActionListener(this);
//		for(int i=0;i<9;i++) {
//		}
		
		tituloTela.add(texto);
		frame.add(tituloTela,BorderLayout.NORTH);
		frame.add(botaoTela);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void fase() {
		
	}
	
	public void verificar() {
		
	}
	
	public void maquinaGanha() {
		
	}
	
	public void pessoaGanha() {
		
	}

}
