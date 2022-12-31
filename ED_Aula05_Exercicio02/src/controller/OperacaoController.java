package controller;

import br.com.leandrocolevati.pilhaint.Pilha;

public class OperacaoController {
	public OperacaoController() {
		super();
	}

	//  GERANDO AS DUAS PILHAS
	public int maiorValor(Pilha pilha) {
		Pilha segunda = new Pilha();
		segunda = pilha;
		
	// COMPARANDO TAMANHOS
		while(segunda.size() != 1 ) {
			int n1, n2;
			
			try {
				n1 = segunda.pop();
				n2 = segunda.pop();
				
				if(n2 > n1) {
					segunda.push(n2);
				} else {
					segunda.push(n1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//APRESENTANDO RESULTADOS
		int resultado = 0;
		
		try {
			resultado = segunda.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//RETORNANDO A MAIOR
		return resultado;
	}
}
