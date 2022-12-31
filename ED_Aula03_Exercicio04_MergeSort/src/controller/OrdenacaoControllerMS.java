package controller;

public class OrdenacaoControllerMS {

	public OrdenacaoControllerMS() {
		super();
	}

	public int[] mergeSort(int[] vet, int inicio, int fim) {

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vet, inicio, meio); 		// SEPARA O BLOCO NO MEIO
			mergeSort(vet, meio + 1, fim); 		// FAZ DO MEIO ATÉ O FIM

			intercala(vet, inicio, meio, fim);	// CHAMA O METODO DE INTERCALAR
		}
		
		return vet;
		
		
	}
	
	//METODO INTERCALAR
	private void intercala(int[] vet, int inicio, int meio, int fim) {
		int[] vetAux = new int[vet.length]; 		// AUXILIAR QUE AJUDA NAS TROCAS DE POSICAO

		
		//AQUI MOSTRA SOMENTE VALORES NAS POSIÇÕES QUE CHEGARAM PARA JUNTAR
		for (int i = inicio; i <= fim; i++) {
			vetAux[i] = vet[i];
		}

		//PONTEIROS DE LIMITACAO (EXCEL)
		int esq = inicio;
		int dir = meio + 1;

		// AQUI SÃO OS IF'S DO PDF, CONTADOR PARA PASSAR AS POSIÇÕES -> INICIO AO FIM
		for (int cont = inicio; cont <= fim; cont++) {
			if (esq > meio) {
				vet[cont] = vetAux[dir];
				dir++;
			} else if (dir > fim) {
				vet[cont] = vetAux[esq];
				esq++;
			} else if (vetAux[esq] < vetAux[dir]) {
				vet[cont] = vetAux[esq];
				esq++;
			} else {
				vet[cont] = vetAux[dir];
				dir++;
			}
		}
	}
}
