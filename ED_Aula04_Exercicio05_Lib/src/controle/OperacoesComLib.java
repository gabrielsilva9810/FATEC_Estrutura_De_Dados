package controle;

import br.bubbleSort.OrdenacaoBubbleSort;
import br.mergeSort.OrdenacaoMergeSort;
import br.quickSort.OrdenacaoQuickSort;

public class OperacoesComLib {

	public OperacoesComLib() {
		super();
	}

	//CLASSE LIB DE BUBBLESORT
	public void ordenacaoBubbleSort (int[]vetor) {
		OrdenacaoBubbleSort opBs = new OrdenacaoBubbleSort();
		int[] resultado = opBs.bubbleSort(vetor);
		for (int valor:resultado ){
			System.out.print(valor + " ");
		}
	}
	
	//CLASSE LIB DE MERGESORT
	public void ordenacaoMergeSort (int[]vetor) {
		OrdenacaoMergeSort opMs = new OrdenacaoMergeSort();
		int[] resultado = opMs.mergeSort(vetor, 0, vetor.length - 1);
		for (int valor : resultado) {
			System.out.print(valor + " ");
		}
	}
	
	//CLASSE LIB DE QUICKSORT
	public void ordenacaoQuickSort (int[]vetor) {
		OrdenacaoQuickSort opQs = new OrdenacaoQuickSort();
		int[] resultado = opQs.quickSort(vetor, 0, vetor.length - 1);
		for (int valor : resultado) {
			System.out.print(valor + " ");
		}
	}
}