package Veiculos;

public abstract class Veiculo {
	
	protected String anoFabricacao, cor, placa, numeroRodas, ignicao;

	public Veiculo(String anoFabricacao, String cor, String placa, String numeroRodas) {
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.placa = placa;
		this.numeroRodas = numeroRodas;	
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(String numeroRodas) {
		this.numeroRodas = numeroRodas;
	} 

	public abstract void ligar();
	
	public abstract void desligar();
	
	public abstract void acelerar();
	
	public abstract void freiar();
	
}