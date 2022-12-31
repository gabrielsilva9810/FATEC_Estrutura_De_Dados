package view;

import controle.OperacoesComLib;

public class Principal {

	public static void main(String[] args) {
		OperacoesComLib ord = new OperacoesComLib();
		
		int[] vetor = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75 };
		
		System.out.println("Ordenacao BubbleSort");
		ord.ordenacaoBubbleSort(vetor);
		
		System.out.println("\n\nOrdenacao MergeSort");
		ord.ordenacaoMergeSort(vetor);
		
		System.out.println("\n\nOrdenacao QuickSort");
		ord.ordenacaoQuickSort(vetor);
	}

}
