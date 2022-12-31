package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
			
			//INSTANCIA PARA A CLASSE DE CONTROLER
			OperacoesController op = new OperacoesController();
			
			//DECLARAR NUMERO DIGITADO
			double numDigitado = 4;

			//EXIBIR RESULTADO
			numDigitado = op.calcularSomatorio(numDigitado);
			System.out.println("Resultado Final: " + numDigitado);
	}
}
