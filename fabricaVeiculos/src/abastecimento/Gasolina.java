package abastecimento;

public class Gasolina implements Combustivel {

	@Override
	public double abastecer(double qtd) {
		return qtd * 10;
	}

}
