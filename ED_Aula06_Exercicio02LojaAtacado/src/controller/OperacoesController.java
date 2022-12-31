package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacoesController {

	public void caixa(Fila fila) throws Exception {
		
		float resultado;
		
		//VÊ SE TA VAZIO
		while(!fila.isEmpty()) {
			Cliente c = (Cliente) fila.remove();
			
			//VALOR TOTAL DA COMPRA
			resultado = (float) c.qtdPecas * c.valorPecas;
			
			//EXIBINDO RESULTADO
			System.out.println("Nome do Cliente: " + c.nome + "\n Valor Total da Compra: R$ " + resultado);
		
	}
	}
}

