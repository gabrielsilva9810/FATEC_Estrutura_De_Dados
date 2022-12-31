package controller;

public class Recursividade {

	public int recFatorial(int num) {
		int fat = 1;
		
		if(num <=1) {
			return 1;
		} else {
			fat = num * recFatorial(num - 1);
			return fat;
		}
	}
}
