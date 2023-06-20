package Veiculos;

import javax.swing.JOptionPane;

public abstract class Veiculo {

	protected String anoFabricacao, cor, placa, numeroRodas;

	boolean ignicao, estadoVeiculo;
	protected int soma, brek, veloMax;

	public Veiculo(String anoFabricacao, String cor, String placa, String numeroRodas) {
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.placa = placa;
		this.numeroRodas = numeroRodas;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(String numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	
	// MÉTODO LIGAR
	public void ligar() {
		ignicao = true;
		if (ignicao == true) {
			JOptionPane.showMessageDialog(null, "Carro ligado.");
			veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de seu Carro ?"));
		} else {
			JOptionPane.showMessageDialog(null, "O carro já está ligado.");
		}
	}

	// MÉTODO ACELERAR
	public void acelerar() {

		if (ignicao == true) {
			estadoVeiculo = true;
			int acelerar = 0;

			while (soma < veloMax) {
				acelerar = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja acelerar ?"));

				soma += acelerar;

				if (soma > veloMax) {
					JOptionPane.showMessageDialog(null, "Você não pode acelerar " + acelerar
							+ " kms pois ira ultrapassar a velocidade maxima de seu carro " + veloMax);
					break;
				}
				JOptionPane.showMessageDialog(null, "Seu carro acelerou " + acelerar + " a velocidade é de " + soma);

				String continua = JOptionPane.showInputDialog(null, "Deseja continuar acelerando ? \n" + "(s/n)");

				if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é possível acelerar pois o carro esta desligado");
		}

	}

	// MÉTODO FREAR
	public void frear() {
		if (estadoVeiculo == true && ignicao == true) {
			String[] options = {"Sim", "Não"};
			while (soma > 0) {
				JOptionPane.showMessageDialog(null, "O carro esta a " + soma + " km ");

				brek = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja frear"));

				soma -= brek;

				if (soma <= 0) {
					JOptionPane.showMessageDialog(null, "O carro parou");
					estadoVeiculo = false;
					break;
				}

				String continua = JOptionPane.showOptionDialog(null, 
						"O carro esta a " + soma + " kmh" + "\nDeseja continuar freiando ? ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options[0], options);

				if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				} else {

				}

			}
		}

	}

	// MÉTODO DESLIGAR
	public void desligar() {
		if (estadoVeiculo == true) {
			JOptionPane.showMessageDialog(null, "O carro não pode ser desligado em movimento");
		} else {
			estadoVeiculo = false;
			ignicao = false;
			JOptionPane.showMessageDialog(null, "Carro desligado.");
		}

	}
}
