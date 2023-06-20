package Veiculos;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{

	protected boolean ignicao, estadoVeiculo;
	protected boolean carga;
	protected String pesoCarga, tamanhoCarga, marca, modelo, tipoAbastecimento;
	protected int soma, brek, veloMax;
	
	public Caminhao(String anoFabricacao, String cor, String placa, String numeroRodas, String pesoCarga, String tamanhoCarga, String marca, String modelo, String tipoAbastecimento, boolean carga) {
		super(anoFabricacao, cor, placa, numeroRodas);
	
	}
	
	//composição de objetos
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
			veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de seu Caminhão ?"));
		} else {
			System.out.println("O caminhão já está ligado.");
		}
		
	}

	@Override
	public void desligar() {
		if (estadoVeiculo == true) {
			JOptionPane.showMessageDialog(null, "O caminhão não pode ser desligado em movimento");
		} else {
			estadoVeiculo = false;
			ignicao = false;
			JOptionPane.showMessageDialog(null, "Caminhão desligado.");
		}
		
	}
	

	@Override
	public void acelerar() {
		
		if (ignicao == true) {
			int acelerar = 0;
			estadoVeiculo = true;
			
			
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
			JOptionPane.showMessageDialog(null, "Não é possível acelerar pois o caminhão esta desligado");
		}
		
	}

	@Override
	public void frear() {
		if (estadoVeiculo == true && ignicao == true) {
			while (soma > 0) {
				JOptionPane.showMessageDialog(null, "O carro esta a " + soma + " km ");

				brek = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja frear"));

				soma -= brek;
				
				if (soma <= 0) {
					JOptionPane.showMessageDialog(null, "O carro parou");
					estadoVeiculo = false;
					break;
				}

				String continua = JOptionPane.showInputDialog(null,
						"O carro esta a " + soma + " kmh" + "\nDeseja continuar freiando ? \n" + "(s/n)");

				 if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				}
			}
		}
		
	}

}
