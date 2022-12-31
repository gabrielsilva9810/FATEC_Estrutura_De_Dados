package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public String conversaoBinario(int num, String binario) {
		if(num < 1) { //Se o numero for < 0, ele retorna a String vazia;
			return "";
			
		} else {
			
			//Se NUM > 0, fará a conversão para Binário;
			int resto = num % 2; //Aqui registra o resto;
			int div = num / 2; // Faz a divisão
			String resultado = String.valueOf(resto); //Converte 
			return conversaoBinario(div, resultado) + resultado; //Recursividade
		}

	}

}
