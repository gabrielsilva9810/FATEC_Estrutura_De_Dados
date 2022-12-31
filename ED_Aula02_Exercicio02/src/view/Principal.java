package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		//INSTANCIA CONSTRUTOR:
		OperacoesController op = new OperacoesController();
		
		//RECEBER E GUARDAR NUMERO PARA CALCULO BINARIO
		String num = JOptionPane.showInputDialog("Digite o numero para converter a binário");
		int decimal = Integer.parseInt(num);
		String conversaoBinario = op.conversaoBinario(decimal, "");
		
		//RESULTADO
		System.out.println("Numero Digitado: " + num + "\nBinário: " + conversaoBinario);
		
	}

}
