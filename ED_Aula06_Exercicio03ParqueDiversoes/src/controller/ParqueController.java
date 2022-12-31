package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Boomerang;

public class ParqueController {
	
	public ParqueController() {
		super();
	}

	public void brinquedo(Fila fila) throws Exception {

		// VÊ SE TA VAZIO
		while (!fila.isEmpty()) {
			Boomerang b = new Boomerang();
			b = (Boomerang) fila.remove();
			

			// VERIFICAR CONDIÇÕES PARA IR AO BRINQUEDO
			if (b.altura <= 1.60) {
				System.out.println("Nome: " + b.nome + " está reprovado devido ter a altura menor que 1.60.");
			}

			if (b.idade <= 16) {
				System.out.println("Nome: " + b.nome + " está reprovado não ter a idade minima de 16 anos.");
			}

			// VALIDACAO OK - CONTINUAR
			if (b.altura > 1.60) {
				System.out.println("Nome: " + b.nome + " está apto a ir no Boomerang devido ser maior que 1.60.");
			}

			if (b.idade > 16) {
				System.out.println("Nome: " + b.nome + " está apto a ir no Boomerang devido ser maior de 16 anos.");
			}

		}
	}
}
