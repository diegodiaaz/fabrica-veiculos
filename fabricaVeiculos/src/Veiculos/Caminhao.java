package Veiculos;


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


