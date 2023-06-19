package Veiculos;

import javax.swing.JOptionPane;


public class Moto extends Veiculo{
	
	boolean ignicao;
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
		boolean ligar = true;
		if (ligar == true) {
			System.out.println("A moto está ligada");
		} else {
			System.out.println("A moto já está ligada");
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
