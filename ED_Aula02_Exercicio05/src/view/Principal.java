package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {

		// CONSTRUTOR
		OperacoesController op = new OperacoesController();

		// RECEBE NUM PARA CALCULAR A SERIE
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular a série de Fibonacci "));

		//NUM MAIOR QUE 20
		if (num > 20) {
			System.out.println("informe um número até 20");
			num = Integer.parseInt(
			JOptionPane.showInputDialog("Digite um número até 20 para calcular a série de Fibonacci "));
		}
		
		int resultado = op.sFibonacci(num);

		//EXIBE RESULTADO
		System.out.println("Resultado série Fibonacci: " + resultado + ".");

	}

}