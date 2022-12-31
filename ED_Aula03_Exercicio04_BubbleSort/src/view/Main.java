package view;

import controller.OrdenacaoCont;

public class Main {

	public static void main(String[] args) {

		// DECLARACAO DE VALORES
		int vet[] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};

		OrdenacaoCont op = new OrdenacaoCont();
		vet = op.bubbleSort(vet);

		System.out.println("");
		System.out.println("===================================================");

		for (int cada : vet) {
			System.out.print(cada + " ");
		}

		System.out.println("");
		System.out.println("===================================================");

	}
}
