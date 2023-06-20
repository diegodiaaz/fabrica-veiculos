package Veiculos;

import javax.swing.JOptionPane;

public class Moto extends Veiculo{
	
	boolean ignicao, movimentoVeiculo;
	protected int soma, brek, veloMax;
	protected String modelo, marca, cilindrada, tipoAbastecimento;
	protected boolean bau;
	

	public Moto(String anoFabricacao, String cor, String placa, String numeroRodas, String modelo, String marca,
			String cilindrada, String tipoAbastecimento, boolean bau) {
		super(anoFabricacao, cor, placa, numeroRodas);
		this.modelo = modelo;
		this.marca = marca;
		this.cilindrada = cilindrada;
		this.tipoAbastecimento = tipoAbastecimento;
		this.bau = bau;
	}
	
	public void statusMoto() {
		JOptionPane.showMessageDialog(null,"Marca: " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor
				+ "\nAno de fabricação: " + this.anoFabricacao + "\nTipo abastecimento: " + this.tipoAbastecimento 
				+ "\nPlaca: " + this.placa + "\nQuantidade de rodas: " + this.numeroRodas );
	}
	
	public void abrirBau() {
		bau = true;
		if (movimentoVeiculo == false) {
			JOptionPane.showMessageDialog(null, "O baú da moto está aberto.");
		} else {
			bau = true;
			movimentoVeiculo = true;
			JOptionPane.showMessageDialog(null, "Não é possível abrir o baú da moto em movimento."); 
		} 
	}
	
	// MÉTODO LIGAR
	@Override
	public void ligar() {
		ignicao = true;
		if (ignicao == true) {
			JOptionPane.showMessageDialog(null, "Moto ligada.");
			veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de sua moto ?"));
		} else {
			JOptionPane.showMessageDialog(null, "A moto já está ligada.");
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
							+ " kms pois ira ultrapassar a velocidade maxima de sua moto " + veloMax);
					break;
				}
				JOptionPane.showMessageDialog(null, "Sua moto acelerou " + acelerar + " a velocidade é de " + soma);

				String continua = JOptionPane.showInputDialog(null, "Deseja continuar acelerando ? \n" + "(s/n)");

				if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é possível acelerar pois a moto esta desligada");
		}

	}

	// MÉTODO FREAR
	@Override
	public void frear() {
		if (movimentoVeiculo == true && ignicao == true) {
			while (soma > 0) {
				JOptionPane.showMessageDialog(null, "A moto esta a " + soma + " km ");

				brek = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja frear"));

				soma -= brek;

				if (soma <= 0) {
					JOptionPane.showMessageDialog(null, "A moto parou");
					movimentoVeiculo = false;
					break;
				}

				String continua = JOptionPane.showInputDialog(null, 
						"A moto esta a " + soma + " kmh" + "\nDeseja continuar freiando ? ");

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
			JOptionPane.showMessageDialog(null, "A moto não pode ser desligada em movimento");
		} else {
			movimentoVeiculo = false;
			ignicao = false;
			JOptionPane.showMessageDialog(null, "Moto desligada.");
		}

	}
}
	
	
	

