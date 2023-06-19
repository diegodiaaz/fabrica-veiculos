//Se sobrar tempo: criar um método abstrado de trocar marcha e verificar se o veículo troca marcha.

package Veiculos;

public class Teste {

	public static void main(String[] args) {
		
		Carro carrin = new Carro("2002", "vermelho", "DVB-4650", "4");
		
		carrin.ligar();
		carrin.acelerar();
		carrin.desligar();
		carrin.acelerar();

		// Moto motinha = new Moto("2022", "Preta", "SKK-0912", "2", "Ninja", "Kawasaki", "600", "Combustível", false);
		// motinha.statusMoto();
		
		// Caminhao caminhaozinho = new Caminhao("2023", "Branco", "DKM-0211", "6", "18kg", "1m", "Mercedes Benz", "sla", "Elétrico", true);
		// caminhaozinho.statusCaminhao();
	}

}

// 	public Caminhao(String anoFabricacao, String cor, String placa, String numeroRodas, String pesoCarga, String tamanhoCarga, String marca, String modelo, String tipoAbastecimento, boolean carga) {
//super(anoFabricacao, cor, placa, numeroRodas);
