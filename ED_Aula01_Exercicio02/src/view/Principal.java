package view;

import controller.OperacoesController;

public class Principal {

		public static void main(String[] args) {
			
			//INSTANCIA PARA A CLASSE DE CONTROLER
			OperacoesController op = new OperacoesController();
			
			//DECLARAR OS VETORES
			int[] vetor = {10, 5, 5, 7, 9, 0, -1}; //NESTE EXEMPLO, TEMOS APENAS 1 NUMERO NEGATIVO
			
			//EXIBIR RESULTADO
			int resultado =  op.vetorNeg(vetor, vetor.length);
			System.out.println("Quantidade de numeros negativos : " + resultado);
	}

}
