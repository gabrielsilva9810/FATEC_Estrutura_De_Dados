package controller;

public class OrdenacaoCont {

	public OrdenacaoCont() {
		super();
	}
	
	public int[] bubbleSort(int [] vetor) {
		int tamanho = vetor.length;
		
		//REPETINDO AS RODADAS
		for(int i = 0; i < tamanho ; i++) {
			//System.out.println("RODADA #" + i + " ");
			
			//DINAMICA
			for(int j = 0; j < tamanho - 1 ; j++) {
				
				if(vetor[j] > vetor [j + 1]) {
					
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
			
			
			for(int valor : vetor) {
				System.out.print(valor + " ");
			
			}
			
			//EXIBIR RESULTADO DAS RODADAS:
			System.out.println("==> RODADA #" + i +  " ");
			
			
		}
		
		return (vetor);
		
		

	}
}
