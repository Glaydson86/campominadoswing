package br.com.exemplo.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.exemplo.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	
	public PainelTabuleiro(Tabuleiro tabu) {
		
		setLayout(new GridLayout(
				tabu.getLinhas(), tabu.getColunas()));
		
		tabu.paraCadaBotao(c -> add(new BotaoCampo(c)));
		
		tabu.registrarObservador(e -> {
			
			SwingUtilities.invokeLater(() -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :)");
				}else {
					JOptionPane.showMessageDialog(this, "Perdeu :(");	
				}
				tabu.reiniciar();
			});	
		});
	}
}
