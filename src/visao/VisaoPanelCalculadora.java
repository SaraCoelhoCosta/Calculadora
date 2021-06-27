package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * @author: Sara
 * 
 * OBJETIVO: Fazer uma calculadora que calcule dois números.
 * 
 * OBS: O programa pega apenas os dois últimos números e a última operação clicada. 
 * Depois que aperta o sinal de igual, ele inicializa calculando apenas com os próximos valores clicados, 
 * apagando o resultado antigo.
 * 
 */
public class VisaoPanelCalculadora extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField visor;
	private JButton botao0;
	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private JButton botao4;
	private JButton botao5;
	private JButton botao6;
	private JButton botao7;
	private JButton botao8;
	private JButton botao9;
	private JButton botaoSoma;
	private JButton botaoSubtracao;
	private JButton botaoMultiplicacao;
	private JButton botaoDivisao;
	private JButton botaoIgual;
	private JButton botaoPonto;
	private JButton botaoLimpar;
	private JButton botaoMaisMenos;
	private JButton botaoLimparTudo;

	public VisaoPanelCalculadora() { // Configuracoes do JPanel
		setLayout(null);
		add(getVisor());
		add(getBotao0());
		add(getBotao1());
		add(getBotao2());
		add(getBotao3());
		add(getBotao4());
		add(getBotao5());
		add(getBotao6());
		add(getBotao7());
		add(getBotao8());
		add(getBotao9());
		add(getBotaoPonto());
		add(getBotaoSoma());
		add(getBotaoSubtracao());
		add(getBotaoMultiplicacao());
		add(getBotaoIgual());
		add(getBotaoDivisao());
		add(getBotaoLimpar());
		add(getBotaoMaisMenos());
		add(getBotaoLimparTudo());
	}

	public JTextField getVisor() {  // Configuracoes JTextField
		if (visor == null) {
			visor = new JTextField();
			visor.setHorizontalAlignment(SwingConstants.RIGHT);
			visor.setEnabled(false);
			visor.setBounds(0, 0, 300, 80);
			visor.setBackground(Color.DARK_GRAY);
			visor.setForeground(Color.WHITE);
			visor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			visor.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return visor;
	}

	public JButton getBotao0() {  // Configuracoes JButton
		if (botao0 == null) {
			botao0 = new JButton("0");
			botao0.setBounds(0, 340, 150, 65);
			botao0.setBackground(new Color(128, 128, 128));
			botao0.setForeground(Color.WHITE);
			botao0.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao0.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao0;
	}

	public JButton getBotao1() { // Configuracoes JButton
		if (botao1 == null) {
			botao1 = new JButton("1");
			botao1.setBounds(0, 275, 75, 65);
			botao1.setBackground(new Color(128, 128, 128));
			botao1.setForeground(Color.WHITE);
			botao1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao1.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao1;
	}

	public JButton getBotao2() { // Configuracoes JButton
		if (botao2 == null) {
			botao2 = new JButton("2");
			botao2.setBounds(75, 275, 75, 65);
			botao2.setBackground(new Color(128, 128, 128));
			botao2.setForeground(Color.WHITE);
			botao2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao2.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao2;
	}

	public JButton getBotao3() { // Configuracoes JButton
		if (botao3 == null) {
			botao3 = new JButton("3");
			botao3.setBounds(150, 275, 75, 65);
			botao3.setBackground(new Color(128, 128, 128));
			botao3.setForeground(Color.WHITE);
			botao3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao3.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao3;
	}

	public JButton getBotao4() { // Configuracoes JButton
		if (botao4 == null) {
			botao4 = new JButton("4");
			botao4.setBounds(0, 210, 75, 65);
			botao4.setBackground(new Color(128, 128, 128));
			botao4.setForeground(Color.WHITE);
			botao4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao4.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao4;
	}

	public JButton getBotao5() { // Configuracoes JButton
		if (botao5 == null) {
			botao5 = new JButton("5");
			botao5.setBounds(75, 210, 75, 65);
			botao5.setBackground(new Color(128, 128, 128));
			botao5.setForeground(Color.WHITE);
			botao5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao5.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao5;
	}

	public JButton getBotao6() { // Configuracoes JButton
		if (botao6 == null) {
			botao6 = new JButton("6");
			botao6.setBounds(150, 210, 75, 65);
			botao6.setBackground(new Color(128, 128, 128));
			botao6.setForeground(Color.WHITE);
			botao6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao6.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao6;
	}

	public JButton getBotao7() { // Configuracoes JButton
		if (botao7 == null) {
			botao7 = new JButton("7");
			botao7.setBounds(0, 145, 75, 65);
			botao7.setBackground(new Color(128, 128, 128));
			botao7.setForeground(Color.WHITE);
			botao7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao7.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao7;
	}

	public JButton getBotao8() { // Configuracoes JButton
		if (botao8 == null) {
			botao8 = new JButton("8");
			botao8.setBounds(75, 145, 75, 65);
			botao8.setBackground(new Color(128, 128, 128));
			botao8.setForeground(Color.WHITE);
			botao8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botao8.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botao8;
	}

	public JButton getBotao9() { // Configuracoes JButton
		if (botao9 == null) {
			botao9 = new JButton("9");
			botao9.setBounds(150, 145, 75, 65);
			botao9.setFont(new Font("Arial", Font.PLAIN, 25));
			botao9.setBackground(new Color(128, 128, 128));
			botao9.setForeground(Color.WHITE);
			botao9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		return botao9;
	}

	public JButton getBotaoSoma() { // Configuracoes JButton
		if (botaoSoma == null) {
			botaoSoma = new JButton("+");
			botaoSoma.setFont(new Font("Arial", Font.PLAIN, 25));
			botaoSoma.setBounds(225, 275, 75, 65);
			botaoSoma.setBackground(new Color(242, 163, 60));
			botaoSoma.setForeground(Color.WHITE);
			botaoSoma.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		return botaoSoma;
	}

	public JButton getBotaoSubtracao() { // Configuracoes JButton
		if (botaoSubtracao == null) {
			botaoSubtracao = new JButton("-");
			botaoSubtracao.setFont(new Font("arial", Font.PLAIN, 25));
			botaoSubtracao.setBounds(225, 210, 75, 65);
			botaoSubtracao.setBackground(new Color(242, 163, 60));
			botaoSubtracao.setForeground(Color.WHITE);
			botaoSubtracao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		return botaoSubtracao;
	}

	public JButton getBotaoMultiplicacao() { // Configuracoes JButton
		if (botaoMultiplicacao == null) {
			botaoMultiplicacao = new JButton("*");
			botaoMultiplicacao.setBounds(225, 145, 75, 65);
			botaoMultiplicacao.setBackground(new Color(242, 163, 60));
			botaoMultiplicacao.setForeground(Color.WHITE);
			botaoMultiplicacao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botaoMultiplicacao.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botaoMultiplicacao;
	}

	public JButton getBotaoDivisao() { // Configuracoes JButton
		if (botaoDivisao == null) {
			botaoDivisao = new JButton("/");
			botaoDivisao.setBounds(225, 80, 75, 65);
			botaoDivisao.setBackground(new Color(242, 163, 60));
			botaoDivisao.setForeground(Color.WHITE);
			botaoDivisao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botaoDivisao.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botaoDivisao;
	}

	public JButton getBotaoIgual() { // Configuracoes JButton
		if (botaoIgual == null) {
			botaoIgual = new JButton("=");
			botaoIgual.setBounds(225, 340, 75, 65);
			botaoIgual.setBackground(new Color(242, 163, 60));
			botaoIgual.setForeground(Color.WHITE);
			botaoIgual.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botaoIgual.setFont(new Font("arial", Font.PLAIN, 25));
		}
		return botaoIgual;
	}
	public JButton getBotaoPonto() {
		if (botaoPonto == null) {
			botaoPonto = new JButton(".");
			botaoPonto.setForeground(Color.WHITE);
			botaoPonto.setFont(new Font("Dialog", Font.PLAIN, 25));
			botaoPonto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botaoPonto.setBackground(new Color(128, 128, 128));
			botaoPonto.setBounds(150, 340, 75, 65);
		}
		return botaoPonto;
	}
	public JButton getBotaoLimpar() {
		if (botaoLimpar == null) {
			botaoLimpar = new JButton("C");
			botaoLimpar.setBounds(new Rectangle(0, 0, 70, 50));
			botaoLimpar.setForeground(Color.WHITE);
			botaoLimpar.setFont(new Font("Dialog", Font.PLAIN, 25));
			botaoLimpar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botaoLimpar.setBackground(new Color(102, 102, 102));
			botaoLimpar.setBounds(75, 80, 75, 65);
		}
		return botaoLimpar;
	}
	public JButton getBotaoMaisMenos() {
		if (botaoMaisMenos == null) {
			botaoMaisMenos = new JButton("+/-");
			botaoMaisMenos.setBounds(new Rectangle(0, 0, 70, 50));
			botaoMaisMenos.setForeground(Color.WHITE);
			botaoMaisMenos.setFont(new Font("Dialog", Font.PLAIN, 25));
			botaoMaisMenos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botaoMaisMenos.setBackground(new Color(102, 102, 102));
			botaoMaisMenos.setBounds(150, 80, 75, 65);
		}
		return botaoMaisMenos;
	}
	public JButton getBotaoLimparTudo() {
		if (botaoLimparTudo == null) {
			botaoLimparTudo = new JButton("AC");
			botaoLimparTudo.setForeground(Color.WHITE);
			botaoLimparTudo.setFont(new Font("Dialog", Font.PLAIN, 25));
			botaoLimparTudo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			botaoLimparTudo.setBackground(new Color(102, 102, 102));
			botaoLimparTudo.setBounds(0, 80, 75, 65);
		}
		return botaoLimparTudo;
	}
}
