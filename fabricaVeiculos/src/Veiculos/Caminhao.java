package Veiculos;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {

	protected boolean ignicao, movimentoVeiculo;
	protected boolean carga;
	protected String pesoCarga, tamanhoCarga, marca, modelo, tipoAbastecimento;
	protected int soma, brek, veloMax;
	
	public Caminhao(String anoFabricacao, String cor, String placa, String numeroRodas, boolean carga, String pesoCarga,
			String tamanhoCarga, String marca, String modelo, String tipoAbastecimento) {
		super(anoFabricacao, cor, placa, numeroRodas);
		this.carga = carga;
		this.pesoCarga = pesoCarga;
		this.tamanhoCarga = tamanhoCarga;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoAbastecimento = tipoAbastecimento;
	}

	//Composição de objetos
	public void statusCaminhao() {
		JOptionPane.showMessageDialog(null,"Marca: " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor
				+ "\nAno de fabricação: " + this.anoFabricacao + "\nTipo abastecimento: " + this.tipoAbastecimento 
				+ "\nPlaca: " + this.placa + "\nQuantidade de rodas: " + this.numeroRodas  + "\nO caminhão possui carga?: " + this.carga
				+ "\nPeso da carga: " + this.pesoCarga 
				+ "\nTamanho da carga: " + this.tamanhoCarga);
	}
	
	public void abrirPorta() {
		if (movimentoVeiculo = true) {
			JOptionPane.showMessageDialog(null, "Não é possível abrir a porta com o caminhão em movimento.");
		} else {
			JOptionPane.showMessageDialog(null, "A porta do caminhão foi aberta.");
		}
	}
	
	// MÉTODO LIGAR
	@Override
	public void ligar() {
		ignicao = true;
		if (ignicao == true) {
			JOptionPane.showMessageDialog(null, "Caminhão ligado.");
			veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de seu Caminhão ?"));
		} else {
			JOptionPane.showMessageDialog(null, "O Caminhão já está ligado.");
		}
	}

	// MÉTODO ACELERAR
	@Override
	public void acelerar() {

		if (ignicao == true) {
			movimentoVeiculo = true;
			int acelerar = 0;

			while (soma < veloMax) {
				acelerar = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja acelerar ?"));

				soma += acelerar;

				if (soma > veloMax) {
					JOptionPane.showMessageDialog(null, "Você não pode acelerar " + acelerar
							+ " kms pois ira ultrapassar a velocidade maxima de seu Caminhão " + veloMax);
					break;
				}
				JOptionPane.showMessageDialog(null, "Seu Caminhão acelerou " + acelerar + " a velocidade é de " + soma);

				String continua = JOptionPane.showInputDialog(null, "Deseja continuar acelerando ? \n" + "(s/n)");

				if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é possível acelerar pois o Caminhão esta desligado");
		}

	}

	// MÉTODO FREAR
	@Override
	public void frear() {
		if (movimentoVeiculo == true && ignicao == true) {

			while (soma > 0) {
				JOptionPane.showMessageDialog(null, "O Caminhão esta a " + soma + " km ");

				brek = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja frear"));

				soma -= brek;

				if (soma <= 0) {
					JOptionPane.showMessageDialog(null, "O Caminhão parou");
					movimentoVeiculo = false;
					break;
				}

				String continua = JOptionPane.showInputDialog(null,
						"O Caminhão esta a " + soma + " kmh" + "\nDeseja continuar freiando ? ");

				if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				} else {

				}

			}
		}

	}

	// MÉTODO DESLIGAR
	@Override
	public void desligar() {
		if (movimentoVeiculo == true) {
			JOptionPane.showMessageDialog(null, "O Caminhão não pode ser desligado em movimento");
		} else {
			movimentoVeiculo = false;
			ignicao = false;
			JOptionPane.showMessageDialog(null, "Caminhão desligado.");
		}

	}

}
