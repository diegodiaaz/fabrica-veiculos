package Veiculos;

import javax.swing.JOptionPane;


public class Moto extends Veiculo{
	
	boolean ignicao, estadoVeiculo;
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
		System.out.println("Marca - " + this.marca);
		System.out.println("Modelo - " + this.modelo);
		System.out.println("Cor - " + this.cor);
		System.out.println("Tipo de abastecimento - " + this.tipoAbastecimento);
		System.out.println("Baú - " + this.bau);
	}
	
	@Override
	public void ligar() {
		ignicao =true;
		if (ignicao == true) {
			JOptionPane.showMessageDialog(null,"Moto ligada.");
			veloMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade maxima de sua moto ?"));
		} else {
			JOptionPane.showMessageDialog(null,"A moto está ligado.");	
		}
		
	}

	@Override
	public void desligar() {
		if (estadoVeiculo == true && soma > 0 && soma < veloMax) {
			JOptionPane.showMessageDialog(null, "A moto não pode ser desligada em movimento");
		} else {
			estadoVeiculo = false;
			ignicao = false;
			JOptionPane.showMessageDialog(null, "Moto desligada.");
		}
		
	}
		
	

	@Override
	public void acelerar() {
		if (ignicao == true) {
			estadoVeiculo = true;
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
		}else {
			JOptionPane.showMessageDialog(null, "Não é possível acelerar pois a moto esta desligada");
		}
	
	}

	@Override
	public void frear() {
		if (estadoVeiculo == true && ignicao == true) {
			while (soma > 0 && soma < veloMax) {
				JOptionPane.showMessageDialog(null, "A moto esta a " + soma + " km ");

				brek = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você deseja frear"));

				soma -= brek;
				
				if (soma <= 0) {
					JOptionPane.showMessageDialog(null, "A moto parou");
					estadoVeiculo = false;
					break;
				}

				String continua = JOptionPane.showInputDialog(null,
						"A moto esta a " + soma + " kmh" + "\nDeseja continuar freiando ? \n" + "(s/n)");

				 if (continua.equals("s")) {

				} else if (continua.equals("n")) {
					break;
				}
			}
		}

		
	}
	
	
	
}
