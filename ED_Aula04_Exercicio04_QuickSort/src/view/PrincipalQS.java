package view;

import controller.OrdenacaoQS;

public class PrincipalQS {

	public static void main(String[] args) {
		OrdenacaoQS op = new OrdenacaoQS();

		// DECLARACAO DE VALORES
		int vet[] = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
		vet = op.quickSort(vet, 0, vet.length - 1);

		System.out.println("");
		System.out.println("================ QuickSort ========================");

		for (int cada : vet) {
			System.out.print(cada + " ");
		}

		System.out.println("");
		System.out.println("===================================================");
	

	}

}
