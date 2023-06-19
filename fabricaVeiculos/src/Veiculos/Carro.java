package Veiculos;

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

}
