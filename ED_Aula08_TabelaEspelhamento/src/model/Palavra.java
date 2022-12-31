package model;

public class Palavra {
	
	public String verbete;
	public String significado;
	
	@Override
	public String toString() {
		return "Palavra \nverbete=" + verbete + "\nSignificado =" + significado + "]";
	}
	
	@Override
	public int hashCode() {
		
		//FUNÇÃO HASH
		int posicao = verbete.toLowerCase().charAt(0); 		//Retorna o 1º caractere do OBJETO
		posicao = posicao - 97;
		return posicao;
	}
	
	
}
