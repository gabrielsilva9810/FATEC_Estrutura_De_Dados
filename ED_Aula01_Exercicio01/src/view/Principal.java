package view;

import controller.Recursividade;

public class Principal {

	public static void main(String[] args) {
		Recursividade rec = new Recursividade();
		int fat = 12;
		int resultado;
		
		resultado = rec.recFatorial(fat);
		System.out.println("O resultado é " + resultado);	
	}

}
