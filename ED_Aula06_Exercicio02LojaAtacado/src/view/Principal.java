package view;

import br.edu.fateczl.filaobj.Fila;
import controller.OperacoesController;
import model.Cliente;

public class Principal {
	
	public static void main(String[] args) {

		// INSTANCIA CLASSE
		Fila fila = new Fila();
		OperacoesController op = new OperacoesController();

		// INSERIR CLIENTES OS CLIENTES
		for (int i = 0; i < 20; i++) {
			Cliente c = new Cliente();
			
			c.nome = "Cliente " + i;						//CLIENTE 1, CLIENTE 2, CLIENTE 3...
			c.qtdPecas = (int)((Math.random() * 30) + 20);			//NUMERO ENTRE 20 E 50
			c.valorPecas = (float)((Math.random() * 95) + 5);		//NUMERO ENTRE 5.00 E 100.00
			fila.insert(c);
		}
		
		// CHAMA OPERACAO ----
		try {
			op.caixa(fila);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
