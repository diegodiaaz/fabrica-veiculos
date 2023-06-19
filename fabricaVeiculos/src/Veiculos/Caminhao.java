package Veiculos;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{

	boolean ignicao;
	protected boolean carga;
	protected String pesoCarga, tamanhoCarga, marca, modelo, tipoAbastecimento;
	
	public Caminhao(String anoFabricacao, String cor, String placa, String numeroRodas, String pesoCarga, String tamanhoCarga, String marca, String modelo, String tipoAbastecimento, boolean carga) {
		super(anoFabricacao, cor, placa, numeroRodas);
		// TODO Auto-generated constructor stub
	}
	
	public void statusCaminhao() {
		System.out.println("Marca - " + this.marca);
		System.out.println("Modelo - " + this.modelo);
		System.out.println("Ano de fabricação - " + this.anoFabricacao);
		System.out.println("Cor - " + this.cor);
		System.out.println("Tipo abastecimento - " + this.tipoAbastecimento);
		System.out.println("Placa - " + this.placa);
		System.out.println("Quantidade de rodas - " + this.numeroRodas);
		System.out.println("Peso da carga - " + this.pesoCarga);
		System.out.println("Tamanho da carga - " + this.tamanhoCarga);		
		System.out.println("O caminhão possui carga? - " + this.carga);
	}

	@Override
	public void ligar() {
		
		boolean ligar = true;
		if (ligar == true) {
			System.out.println("O caminhão ligou.");
		} else {
			System.out.println("O caminhão já está ligado.");
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
		
		if (ignicao == true) {
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
		}else {
			JOptionPane.showMessageDialog(null, "Não é possível acelerar pois o carro esta desligado");
		}
		
	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub
		
	}

}
