package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
			
			//INSTANCIA PARA A CLASSE DE CONTROLER
			OperacoesController op = new OperacoesController();
			
			//DECLARAR NUMERO DIGITADO
			int numDigitado = 5;

			//EXIBIR RESULTADO
			numDigitado = op.calcularSomatorio(numDigitado);
			System.out.println("Somatoria: " + numDigitado);
	}
}


