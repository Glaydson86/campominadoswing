package br.com.exemplo.cm.visao;

import javax.swing.JFrame;

import br.com.exemplo.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	public TelaPrincipal() {
		Tabuleiro tabu = new Tabuleiro(16, 30, 50);
		add(new PainelTabuleiro(tabu));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
		
	}
}
