package visao;

import javax.swing.JFrame;

/*
 * @author: Sara
 * 
 * OBJETIVO: Fazer uma calculadora que calcule dois números.
 */
public class VisaoFrameCalculadora extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public VisaoFrameCalculadora() {  // Cria JFrame.
		setTitle("Calculadora"); //Titulo
		setSize(300, 429); // Posicao em que vai abrir e tamanho da tela. 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true); // Visibilidade 
	}
}
