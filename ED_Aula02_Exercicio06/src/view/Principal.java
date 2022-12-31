package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
			
			//INSTANCIA PARA A CLASSE DE CONTROLER
			OperacoesController op = new OperacoesController();
			
			//RECEBE O NUMERO PARA CALCULAR A SERIE
			double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para calcular a série "));

			//VALIDAR SE É MAIOR QUE 10
			if (num > 10) {
				System.out.println("Inform um número até 10");
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero até 10 para calcular serie"));
			}
			
			//EXIBIR RESULTADO
			double resultado = op.calcularSerie(num);
			System.out.println("Resultado Final da Série: " + resultado);
	}
}

