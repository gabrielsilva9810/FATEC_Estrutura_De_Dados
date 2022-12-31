package view;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import model.Boomerang;

public class Principal {

	public static void main(String[] args) throws Exception {

		// INSTANCIA CLASSE
		Fila fila = new Fila();
		ParqueController op = new ParqueController();

		// INSERIR 30 PESSOAS
		for (int i = 0; i < 30; i++) {
			Boomerang b = new Boomerang();

			b.nome = "Pessoa " + i; // PESSOA 1, PESSOA 2, PESSOA 3...
			b.idade = (int) ((Math.random() * 31) + 10); // IDADE ENTRE 10 E 40
			b.altura = (float) ((Math.random() * 0.65) + 1.35); // NUMERO ENTRE 5.00 E 100.00 | 1.35 e 2.00
			fila.insert(b);
		}
		
		//CHAMA OPERACAO
		op.brinquedo(fila);

	}
}
