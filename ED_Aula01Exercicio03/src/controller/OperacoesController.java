package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
		
		public String inverterString(String fraseDigitada, int entrada) {
			if(entrada == 0) {
				return ""; //SE NÃO HOUVER PALAVRA (Eu vou me formar na FATEC) DIGITADO, RETORNA ""
			}
			
			//CONTENDO LETRA DENTRO DA VARIAVEL, ELE RETORNA A ENTRA - 1
			// + A PROPRIA RECURSIVA EXIBINDO A FRASE DIGITADA E ENTRADA - 1
			//SENDO ASSIM, A FRASE SERÁ INVERTIDA
			return fraseDigitada.substring(entrada - 1, entrada) + inverterString(fraseDigitada, entrada - 1);
		}
}
