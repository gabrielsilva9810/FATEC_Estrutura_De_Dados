package controller;

import br.com.leandrocolevati.Lista.Lista;
import model.Palavra;

public class Dicionario {

	Lista[] vetDicionario;
	
	public Dicionario() {
		vetDicionario = new Lista[26];
		inicializar();
	}
	
	private void inicializar() {
		int tamanho = vetDicionario.length;
		for(int i = 0; i < tamanho ; i++) {
			vetDicionario[i] = new Lista();
		}
	}
	
	public void adicionarPalavra(Palavra palavra) {
		int posicao = palavra.hashCode();
		vetDicionario[posicao].addFirst(palavra);
	}
	
	public Palavra buscaPalavra(Palavra palavra) throws Exception {
		int posicao = palavra.hashCode();
		int tamanhoLista = vetDicionario[posicao].size(); 		//Retorna o tamanho da lista
		
		for (int i = 0; i < tamanhoLista ; i++) {
			Palavra p = (Palavra) vetDicionario[posicao].get(i);
			
			//Descobre a lista que está e percorre a lista
			if(p.verbete.equals(palavra.verbete)){
				palavra.significado = p.significado;
				break;
			}
		}
		
		if(palavra.significado == null) {
			throw new Exception ("Palavra não cadastrada");
		}
		return palavra;
	}

	
	//REMOVENDO PALAVRAS DO DICIONARIO
	public void removePalavra(Palavra palavra) throws Exception {
		int posicao = palavra.hashCode();
		int tamanhoLista = vetDicionario[posicao].size();
		for (int i = 0; i < tamanhoLista ; i++) {
			Palavra p = (Palavra) vetDicionario[posicao].get(i);
			
			//REMOVER NA POSICAO I
			if(p.verbete.equals(palavra.verbete)) {
				vetDicionario[posicao].removePosition(i);
				break;
			}
		}
	}
	
	//LISTAR PALAVRAS
	public void listarPalavras(String caracter) throws Exception {
		int posicao = funcaoHash(caracter);
		int tamanhoLista = vetDicionario[posicao].size();
		
		for(int i = 0 ; i < tamanhoLista; i++) {
			Palavra p = (Palavra) vetDicionario[posicao].get(i);
			System.out.println(p.toString());
		}
	}

	private int funcaoHash(String caracter) {
		int posicao = caracter.toLowerCase().charAt(0); 		//Retorna o 1º caractere do OBJETO
		posicao = posicao - 97;
		return posicao;
	}
}
