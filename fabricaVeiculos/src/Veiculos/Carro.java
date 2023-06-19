package Veiculos;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {

	boolean ignicao, estadoCarro;
	protected int soma, brek, veloMax;

	public Carro(String anoFabricacao, String cor, String placa, String numeroRodas) {
		super(anoFabricacao, cor, placa, numeroRodas);
		// TODO Auto-generated constructor stub
	}

	protected String modelo, marca, cavalos, tipoAbastecimento;
	protected boolean arCondicionado;

	@Override
	public void ligar() {
		ignicao =true;
		if (ignicao == true) {
			JOptionPane.showMessageDialog(null,"Carro ligado.");
			veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de seu Carro ?"));
		} else {
			JOptionPane.showMessageDialog(null,"O carro já está ligado.");	
		}
	}


	@Override
	public void acelerar() {

		if (ignicao == true) {
			estadoCarro = true;
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

	@Override
	public void frear() {
		if (estadoCarro == true && ignicao == true) {
			while (soma > 0) {
				JOptionPane.showMessageDialog(null, "O carro esta a " + soma + " km ");

				brek = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja frear"));

				soma -= brek;
				
				if (soma <= 0) {
					JOptionPane.showMessageDialog(null, "O carro parou");
					estadoCarro = false;
					break;
				}

				String continua = JOptionPane.showInputDialog(null,
						"O carro esta a " + soma + " kmh" + "\nDeseja continuar freiando ? \n" + "(s/n)");

				 if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				} else {

				}

			}
		}

	}
	@Override
	public void desligar() {		
		if (estadoCarro == true) {
			JOptionPane.showMessageDialog(null, "O carro não pode ser desligado em movimento");
		} else {
			estadoCarro = false;
			ignicao = false;
			JOptionPane.showMessageDialog(null, "Carro desligado.");
		}
		
	}
}
