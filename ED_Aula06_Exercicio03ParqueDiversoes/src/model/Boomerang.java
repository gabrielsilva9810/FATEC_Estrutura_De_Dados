package model;

import java.text.DecimalFormat;

public class Boomerang {

	// ATRIBUTOS
		public String nome;
		public int idade;
		public float altura;
		
		public String toString() {
			String alturaString = new DecimalFormat("####.00").format(altura);
			return "Pessoa: " + nome + " Idade: "+ idade +" Altura= " + alturaString;
		}
}
