package view;

import br.com.leandrocolevati.pilhaint.Pilha;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		
		//INICIALIZAR UMA NOVA PILHA
		OperacaoController Pilha = new OperacaoController();
		Pilha p = new Pilha();					//LIB
		int valor;
		
		//INSERIR 15 NUMEROS ALEATORIOS DE 1 A 50
		for (int i = 1; i < 15; i++) {
			valor = (int)(Math.random()*51);
			p.push(valor);
        }
		
		valor = Pilha.maiorValor(p);
		System.out.println("Resultado => " + valor);

	}
}
