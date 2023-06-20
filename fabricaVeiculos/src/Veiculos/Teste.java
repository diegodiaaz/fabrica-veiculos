
//Se sobrar tempo: criar um método abstrado de trocar marcha e verificar se o veículo troca marcha.

package Veiculos;

public class Teste {

	public static void main(String[] args) {

	Moto motinha = new Moto("2022", "Preta", "SKK-0912", "2", "Ninja", "Kawasaki", "600", "Flex", true);
//		motinha.ligar();
//		motinha.acelerar();
//		motinha.frear();
//		motinha.abrirBau();
//		motinha.desligar();
//		motinha.statusMoto();
		
		Carro carro = new Carro("2023", "Prata", "DDD-1012", "4", "700", "BMW", "BMW 320i", "Flex");
		carro.ligar();
		carro.acelerar();
		carro.abrirPorta();
		carro.abrirPortaMala();
		carro.frear();
		carro.desligar();
		carro.statusCarro();
	
	Caminhao caminhao = new Caminhao("2021", "Azul", "CSW-0999", "6", true, "15Kg", "10m", "Volvo", "Volvo VM", "Diesel");
//		caminhao.ligar();
//		caminhao.acelerar();
//		caminhao.abrirPorta();
//		caminhao.frear();
//		caminhao.desligar();
//		caminhao.statusCaminhao();
	
	}

} 	