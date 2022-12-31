package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public double calcularSomatorio(double numDigitado) {
		if (numDigitado <= 1) { // MENOR QUE 1, PARA
			return 1; // CONDICAO DE PARADA --> FICA 1 / 1 
			
		} else {
			//PEGA A F_RECURSVIDADE - 1 -> DIMINUI A PARTE DEBAIXO
			//SOMA +++ (1 / NUM DIGITADO) -> SOMA COM O NUMERO ANTERIOR
			return calcularSomatorio (numDigitado - 1) + (1 / numDigitado);
		}
	}
}
