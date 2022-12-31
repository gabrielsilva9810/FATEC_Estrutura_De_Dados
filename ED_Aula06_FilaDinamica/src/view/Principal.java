package view;

import model.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {

		Fila fila = new Fila();
		
		//INSERIR
		fila.insert(1);
		fila.insert(2);
		fila.insert(3);
		fila.insert(4);
		fila.insert(5);

		//REMOVE
		try {
			int dado = fila.remove();
			System.out.println("Removido " + dado);
			
			dado = fila.remove();
			System.out.println("Removido " + dado);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" ");
		int tamanho = fila.size();
		System.out.println("Tamanho: " + tamanho);
		
		
		
	}

}
