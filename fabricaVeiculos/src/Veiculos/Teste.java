package Veiculos;

public class Teste {

	public static void main(String[] args) {

		Moto moto = new Moto("2022", "Preta", "SKK-0912", "2", "Ninja", "Kawasaki", "600", "Flex", true);
		moto.ligar();
		moto.acelerar();
		moto.frear();
		moto.abrirBau();
		moto.desligar();
		moto.statusMoto();
		
		Carro carro = new Carro("2023", "Prata", "DDD-1012", "4", "700", "BMW", "BMW 320i", "Flex");
		carro.ligar();
		carro.acelerar();
		carro.abrirPorta();
		carro.abrirPortaMala();
		carro.frear();
		carro.statusCarro();
	
		Caminhao caminhao = new Caminhao("2021", "Azul", "CSW-0999", "6", true, "15Kg", "10m", "Volvo", "Volvo VM", "Diesel");
		caminhao.ligar();
		caminhao.acelerar();
		caminhao.frear();
		caminhao.desligar();
		caminhao.ligar();
		caminhao.statusCaminhao();
	
	}

} 	