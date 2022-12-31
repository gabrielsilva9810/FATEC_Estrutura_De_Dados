package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public int calcularSomatorio(int numDigitado) {
		if (numDigitado <= 0) { // MENOR QUE 0, PARA
			return 0; // CONDICAO DE PARADA
			
		} else {
			// A FUN��O PEGA O NUMERO DIGITADO (5) E ESCALA COMO 4, 3, 2, 1
			// O (- 1) FAZ ESSA ESCALA, DIMINUINDO 1 DO NUM DIGITADO
			// NA VOLTA, ELE SOMA O NUM DIGITADO + O VALOR QUE ESTAVA GUARDADO
			// 5+4+3+2+1 = 15
			return numDigitado + calcularSomatorio(numDigitado - 1);
		}
	}
}
