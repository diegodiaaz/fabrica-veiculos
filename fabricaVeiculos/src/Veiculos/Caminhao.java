package Veiculos;

public class Caminhao extends Veiculo{

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
		// TODO Auto-generated method stub
		
	}

}
