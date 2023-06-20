package Veiculos;



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
	
	
	
	
}
