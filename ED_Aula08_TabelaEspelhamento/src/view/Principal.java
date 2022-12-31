package view;

import controller.Dicionario;
import model.Palavra;

public class Principal {

	public static void main(String[] agrs) {
		
		Palavra p0 = new Palavra();
		p0.verbete = "Vocabulo";
		p0.significado = "Palavra";
		
		Palavra p1 = new Palavra();
		p1.verbete = "Voz";
		p1.significado = "Sons produzidos pela cordas vocais";
		
		Dicionario dicionario = new Dicionario();
		dicionario.adicionarPalavra(p0);
		dicionario.adicionarPalavra(p1);
		
		//Procurar palavra dentro do dicionario
		try {
			Palavra px = new Palavra();
			px.verbete = "Voz";
			px = dicionario.buscaPalavra(px);
			System.out.println(px.significado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
