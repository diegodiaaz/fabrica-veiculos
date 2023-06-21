package veiculos;

import javax.swing.JOptionPane;

import abastecimento.Combustivel;


public class Carro extends Veiculo {

	protected boolean ignicao, movimentoVeiculo;
	protected int soma, brek, veloMax;
	protected String modelo, marca, cavalos, tipoAbastecimento;
	private double tanque;
	private double rendimentoTotal;

	public Carro(String anoFabricacao, String cor, String placa, String numeroRodas, String modelo, String marca,
			String cavalos, String tipoAbastecimento) {
		super(anoFabricacao, cor, placa, numeroRodas);

		this.modelo = modelo;
		this.marca = marca;
		this.cavalos = cavalos;
		this.tipoAbastecimento = tipoAbastecimento;
	}

	public double getTanque() {
		return tanque;
	}

	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void statusCarro() {

		JOptionPane.showMessageDialog(null,
				"Marca: " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nAno de fabricação: "
						+ this.anoFabricacao + "\nTipo abastecimento: " + this.tipoAbastecimento + "\nPlaca: "
						+ this.placa + "\nQuantidade de rodas: " + this.numeroRodas);
	}

	public void abrirPortaMala() {
		if (movimentoVeiculo = true) {
			JOptionPane.showMessageDialog(null, "Não é possível abrir o porta malas com o carro em movimento.");
		} else {
			JOptionPane.showMessageDialog(null, "O porta malas foi aberto.");
		}
	}

	public void abrirPorta() {
		if (movimentoVeiculo = true) {
			JOptionPane.showMessageDialog(null, "Não é possível abrir a porta com o carro em movimento.");
		} else {
			JOptionPane.showMessageDialog(null, "A porta do carro foi aberta.");
		}
	}

	// MÉTODO LIGAR
	@Override
	public void ligar() {
		ignicao = true;
		if (ignicao == true) {
			JOptionPane.showMessageDialog(null, "Carro ligado.");
			veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de seu carro?"));
		} else {
			JOptionPane.showMessageDialog(null, "O carro já está ligado.");
		}
	}

	// MÉTODO ACELERAR
	@Override
	public void acelerar() {

		if (ignicao == true) {
			movimentoVeiculo = true;
			int acelerar = 0;

			while (soma < veloMax) {
				acelerar = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja acelerar?"));

				soma += acelerar;

				if (soma > veloMax) {
					JOptionPane.showMessageDialog(null,
							"Você não pode acelerar " + acelerar
									+ " km/h pois ira ultrapassar a velocidade maxima de seu carro, que é " + veloMax
									+ " km/h.");
					break;
				}
				JOptionPane.showMessageDialog(null,
						"Seu carro acelerou " + acelerar + "km/h. A velocidade atual é de " + soma + " km/h.");

				String continua = JOptionPane.showInputDialog(null, "Deseja continuar acelerando? \n" + "(s/n)");

				if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é possível acelerar pois o carro esta desligado.");
		}

	}

	// MÉTODO FREAR
	@Override
	public void frear() {
		if (movimentoVeiculo == true && ignicao == true) {
			while (soma > 0) {
				JOptionPane.showMessageDialog(null, "O carro esta a " + soma + " km/h.");

				brek = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja frear?"));

				soma -= brek;

				if (soma <= 0) {
					JOptionPane.showMessageDialog(null, "O carro parou.");
					estadoVeiculo = false;
					break;
				}

				String continua = JOptionPane.showInputDialog(null,
						"O carro esta a " + soma + " km/h." + "\nDeseja continuar freiando ? ");

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
			JOptionPane.showMessageDialog(null, "O carro não pode ser desligado em movimento.");
		} else {
			movimentoVeiculo = false;
			ignicao = false;
			JOptionPane.showMessageDialog(null, "Carro desligado.");
		}
	}


	public void abastecimento(Combustivel comb, double qtd) {
		if (tanque + qtd < 50) {
			tanque += qtd;
			rendimentoTotal += comb.abastecer(qtd);
			
			System.out.println(rendimentoTotal);
		}
	}


}
