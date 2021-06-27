package controle;

import visao.VisaoFrameCalculadora;
import visao.VisaoPanelCalculadora;

/*
 * @author: Sara
 * 
 * OBJETIVO: Fazer uma calculadora que calcule dois números.
 */
public class ControlePrincipal {
	
	static VisaoFrameCalculadora frameCalculadora = new VisaoFrameCalculadora();
	private VisaoPanelCalculadora panelCalculadora;
	
	public ControlePrincipal() {
		panelCalculadora = new VisaoPanelCalculadora(); 
		@SuppressWarnings("unused")
		ControleCalculadora controleCalculadora = new ControleCalculadora(panelCalculadora); // Chama controle do JPanel
		frameCalculadora.setContentPane(panelCalculadora); // Abre JPanel
		frameCalculadora.repaint(); 
		frameCalculadora.validate();
	}
	
	public static void main(String[] args) {
		new ControlePrincipal();
	}
}
