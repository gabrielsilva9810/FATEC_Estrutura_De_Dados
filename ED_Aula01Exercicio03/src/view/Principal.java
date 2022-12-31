package view;

import controller.OperacoesController;

public class Principal {

		public static void main(String[] args) {
			
			//INSTANCIA PARA A CLASSE DE CONTROLER
			OperacoesController op = new OperacoesController();
			
			//DECLARAR STRING
			String fraseDigitada = "Eu vou me formar na FATEC"; 
			
			//EXIBIR RESULTADO
			String resultado =  op.inverterString(fraseDigitada, fraseDigitada.length());
			System.out.println("Frase Digitada pelo Usuário: " + fraseDigitada);
			System.out.println("Frase Invertida: " + resultado);
	}

}
