package controller;

public class OrdenacaoQS {

	public OrdenacaoQS() {
		super();
	}

	public int[] quickSort(int[] vetor, int inicio, int fim) {
		
		if (fim > inicio) {
			int posicaoPivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivoFixo - 1);
			quickSort(vetor, posicaoPivoFixo + 1, fim);
		}
		
		return vetor;
	}
	
	private int dividir(int[] vetor, int inicio, int fim) {

		// DECLARACAO DOS PONTEIROS E PIVO
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;
		int pivo = vetor[inicio];

		// ENQUANTO + MOVIMENTAÇÃO DOS PONTEIROS
		while (ponteiroEsq <= ponteiroDir) {

			while (ponteiroEsq <= ponteiroDir && vetor[ponteiroEsq] <= pivo) {
				ponteiroEsq++;
			}

			while(ponteiroDir >= ponteiroEsq && vetor[ponteiroDir] > pivo) {
				ponteiroDir--;
			}

			// CONDICIONAL -> CASO O P ESQUERDO E P DIREITO SEREM BLOQUEADOS
			if (ponteiroEsq < ponteiroDir) {
				trocar(vetor, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}
		}
		
		//TROCA DO VALOR DO PIVO - DE PIVO INICIO, ELE TROCA PARA O PONTEIRO DA DIREITA
		trocar(vetor, inicio, ponteiroDir);
		return ponteiroDir;
	}

	//TROCA DE POSIÇÕES DOS VETORES
	private void trocar(int[] vetor, int iEsq, int jDir) {
		int aux = vetor[jDir];
		vetor[jDir] = vetor[iEsq];
		vetor[iEsq] = aux;
	}

}

