package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public double calcularSomatorio(double numDigitado) {
		if (numDigitado <= 1) { // MENOR QUE 1, PARA
			return 1; // CONDICAO DE PARADA --> FICA 1 / 1

		} else {
			// PEGA A F_RECURSVIDADE - 1 -> DIMINUI A PARTE DEBAIXO
			// SOMA +++ (1 / NUM DIGITADO) -> SOMA COM O NUMERO ANTERIOR
			// NAO DEU CERTO ASSIM -> return calcularSomatorio (numDigitado - 1) + (1 /
			// (numDigitado * calcularSomatorio(numDigitado -1)));

			// SE O NUM > 1, SERÁ CALCULADO O FATORIAL DESSE NUMERO:
			return numDigitado * calcularSomatorio(numDigitado - 1);
		}
	}

	public double calcularSerie(double numDigitado) {
		if (numDigitado == 1) {
			return 1;
		} else {
			// RETORNO DA SERIE:
			return 1 / calcularSomatorio(numDigitado) + calcularSerie(numDigitado - 1);
		}
	}

}
