package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.VisaoPanelCalculadora;

/*
 * @author: Sara
 * 
 * OBJETIVO: Fazer uma calculadora que calcule dois números.
 */
public class ControleCalculadora implements ActionListener {

	private VisaoPanelCalculadora panelCalculadora;
	private String operacao = null;
	private double numero1 = 0;
	private double numero2;

	public ControleCalculadora(VisaoPanelCalculadora panelCalculadora) {
		this.panelCalculadora = panelCalculadora;
		addEvento();
	}

	public void addEvento() { // Adiciona eventos aos botões.
		panelCalculadora.getBotao0().addActionListener(this);
		panelCalculadora.getBotao1().addActionListener(this);
		panelCalculadora.getBotao2().addActionListener(this);
		panelCalculadora.getBotao3().addActionListener(this);
		panelCalculadora.getBotao4().addActionListener(this);
		panelCalculadora.getBotao5().addActionListener(this);
		panelCalculadora.getBotao6().addActionListener(this);
		panelCalculadora.getBotao7().addActionListener(this);
		panelCalculadora.getBotao8().addActionListener(this);
		panelCalculadora.getBotao9().addActionListener(this);
		panelCalculadora.getBotaoSoma().addActionListener(this);
		panelCalculadora.getBotaoSubtracao().addActionListener(this);
		panelCalculadora.getBotaoMultiplicacao().addActionListener(this);
		panelCalculadora.getBotaoDivisao().addActionListener(this);
		panelCalculadora.getBotaoIgual().addActionListener(this);
		panelCalculadora.getBotaoMaisMenos().addActionListener(this);
		panelCalculadora.getBotaoLimparTudo().addActionListener(this);
		panelCalculadora.getBotaoLimpar().addActionListener(this);
		panelCalculadora.getBotaoPonto().addActionListener(this);
	}

	@Override
	// Acoes executadas pelos botoes quando clicados (OBS: JTextField está
	// desabilitado para escrita)
	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == panelCalculadora.getBotao0()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao0().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao1()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao1().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao2()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao2().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao3()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao3().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao4()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao4().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao5()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao5().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao6()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao6().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao7()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao7().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao8()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao8().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotao9()) {
			if (operacao == "=") {
				panelCalculadora.getVisor().setText("");
			}
			// Escreve na tela o texto do botao
			panelCalculadora.getVisor()
					.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotao9().getText());
		}

		else if (evento.getSource() == panelCalculadora.getBotaoPonto()) {
			if (!panelCalculadora.getVisor().getText().equals("")) {
				// Escreve na tela o texto do botao
				panelCalculadora.getVisor()
						.setText(panelCalculadora.getVisor().getText() + panelCalculadora.getBotaoPonto().getText());
			} else {
				panelCalculadora.getVisor().setText("0" + panelCalculadora.getBotaoPonto().getText());
			}
		}

		else if (evento.getSource() == panelCalculadora.getBotaoSoma()) {
			// Se o texto da tela nao for vazio
			if (!panelCalculadora.getVisor().getText().equals("")) {

				// Guarda o numero da tela na memoria, salva a operacao selecionada e limpa a
				// tela
				numero1 = Double.parseDouble(panelCalculadora.getVisor().getText());
				operacao = panelCalculadora.getBotaoSoma().getText();
				panelCalculadora.getVisor().setText("");
			} else {
				panelCalculadora.getVisor().setText(""); // Limpa o texto
			}
		}

		else if (evento.getSource() == panelCalculadora.getBotaoSubtracao()) {
			// Se o texto da tela nao for vazio
			if (!panelCalculadora.getVisor().getText().equals("")) {

				// Guarda o numero da tela na memoria, salva a operacao selecionada e limpa o
				// texto
				numero1 = Double.parseDouble(panelCalculadora.getVisor().getText());
				operacao = panelCalculadora.getBotaoSubtracao().getText();
				panelCalculadora.getVisor().setText("");
			} else {
				panelCalculadora.getVisor().setText(""); // Limpa o texto
			}
		}

		else if (evento.getSource() == panelCalculadora.getBotaoMultiplicacao()) {
			// Se o texto da tela nao for vazio
			if (!panelCalculadora.getVisor().getText().equals("")) {

				// Guarda o numero da tela na memoria, salva a operacao selecionada e limpa o
				// texto
				numero1 = Double.parseDouble(panelCalculadora.getVisor().getText());
				operacao = panelCalculadora.getBotaoMultiplicacao().getText();
				panelCalculadora.getVisor().setText("");
			} else {
				panelCalculadora.getVisor().setText(""); // Limpa o texto
			}
		}

		else if (evento.getSource() == panelCalculadora.getBotaoDivisao()) {
			// Se o texto da tela nao for vazio
			if (!panelCalculadora.getVisor().getText().equals("")) {

				// Guarda o numero da tela na memoria, salva a operacao selecionada e limpa o
				// texto
				numero1 = Double.parseDouble(panelCalculadora.getVisor().getText());
				operacao = panelCalculadora.getBotaoDivisao().getText();
				panelCalculadora.getVisor().setText("");
			} else {
				panelCalculadora.getVisor().setText(""); // Limpa o texto
			}
		}

		else if (evento.getSource() == panelCalculadora.getBotaoIgual()) {
			if (!panelCalculadora.getVisor().getText().equals("")) { // Se tela nao estiver vazia

				// Pega o valor na tela e calcula a operacao com o ultimo valor guardado
				numero2 = Double.parseDouble(panelCalculadora.getVisor().getText());

				if (operacao == "+") {
					numero1 = numero1 + numero2;
				} else if (operacao == "-") {
					numero1 = numero1 - numero2;
				} else if (operacao == "*") {
					numero1 = numero1 * numero2;
				} else if (operacao == "/") {
					if (numero2 != 0) {
						numero1 = numero1 / numero2;
					} else {
						numero1 = 0;
					}
				} else {
					// Pega o valor na tela e calcula a operacao com o ultimo valor guardado
					numero1 = Double.parseDouble(panelCalculadora.getVisor().getText());
				}

				// Exibe resultado.
				panelCalculadora.getVisor().setText("" + numero1);

			} else {
				// Exibe resultado.
				panelCalculadora.getVisor().setText("" + numero1);
			}

			// Guarda operacao realizada
			operacao = panelCalculadora.getBotaoIgual().getText();
		} else if (evento.getSource() == panelCalculadora.getBotaoLimpar()) {
			panelCalculadora.getVisor().setText("");
		}

		else if (evento.getSource() == panelCalculadora.getBotaoLimparTudo()) {
			numero1 = 0;
			numero2 = 0;
			panelCalculadora.getVisor().setText("");
		}

		else if (evento.getSource() == panelCalculadora.getBotaoMaisMenos()) {
			if (!panelCalculadora.getVisor().getText().equals("")) { // Se tela nao estiver vazia
			
				numero1 = Double.parseDouble(panelCalculadora.getVisor().getText());
				numero1 = numero1 * (-1);
				// Exibe resultado.
				panelCalculadora.getVisor().setText("" + numero1);
			}
		}
	}
}
