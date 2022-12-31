package view;

import controller.OrdenacaoControllerMS;

public class PrincipalMS {

	public static void main(String[] args) {
		OrdenacaoControllerMS op = new OrdenacaoControllerMS();

		// DECLARACAO DE VALORES
		int vet[] = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
		vet = op.mergeSort(vet, 0, vet.length - 1);

		System.out.println("");
		System.out.println("===================================================");

		for (int cada : vet) {
			System.out.print(cada + " ");
		}

		System.out.println("");
		System.out.println("===================================================");
	}
}
