package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
		
		public int vetorNeg(int[] vetor, int qtdNegativo) {
			if(qtdNegativo == 0) {
				return 0; //SE NÃO HOUVER NUMERO NEGATIVO, ELE RETORNA 0
			}
			
			if(vetor[qtdNegativo - 1] < 0) { //SE A POSIÇÃO DO VETOR [NUMERO - 1] FOR MENOR QUE 0
				return 1 + vetorNeg(vetor, qtdNegativo - 1); //ELE RETORNA 1 + A RECURSIVA INFORMANDO O VETOR E O NUMERO DE NEGATIVOS - 1
			}
			
			//SAINDO DO IF, ENTRA NESSE OUTRO RETURN, PASSANDO O VETOR, E O NUMERO - 1
			return vetorNeg(vetor, qtdNegativo - 1);
		}
}
