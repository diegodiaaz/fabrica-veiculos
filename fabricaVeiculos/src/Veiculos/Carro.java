package Veiculos;

import javax.swing.JOptionPane;

public class Carro extends Veiculo{

	public Carro(String anoFabricacao, String cor, String placa, String numeroRodas) {
		super(anoFabricacao, cor, placa, numeroRodas);
		// TODO Auto-generated constructor stub
	}
	protected String modelo, marca, cavalos, tipoAbastecimento;
	protected boolean arCondicionado;
	
	@Override
	public void ligar() {
		
		boolean ligar = true;
		if (ligar == true) {
			System.out.println("O carro está ligado.");
		} else {
			System.out.println("O carro já está ligado.");
		}
		
	}

	@Override
	public void desligar() {

		boolean desligar = true;
		if (desligar == true) {
			System.out.println("O caminhão desligou.");
		} else {
			System.out.println("O caminhão já está desligado.");
		}
		
	}

	@Override
	public void acelerar() {
		
		int soma = 0, acelerar = 0;
		int veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de seu Carro ?"));

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
		
	}

}
