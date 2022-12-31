package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {


		//INSTANCIA CONSTRUTOR
		OperacoesController op = new OperacoesController();
		
		//RECEBE PRIMEIRO NUMERO
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequência de números: "));

		//RECEBE SEGUNDO NUMERO
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um dos numeros digitados antes e verifique quantas vezes ele apareceu. "));
		
		int resultado = op.somaQtdNum(num1, num2);
		
		//EXIBIR RESULTADO
		System.out.println("O número " + num2 + " aparece "+ resultado +" vezes na sequência: " + num1 +".");

	}

}