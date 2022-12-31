package controller;

public class OperacoesController {
	
	public OperacoesController(){
		super();
	}
	
	public int sFibonacci(int num) {
			
	    if (num == 0){
            return 0; //Se for = 0, ele retorna 0;
        }
	    
	    //NUM > 1 SERÁ VERIFICADO se o resto é igual ao SEGUNDO numero
        if (num == 1 || num == 2){ //NUM = 1 OU NUM = 2;
            return 1;	 //RETORNA 1
        } else {
        	//RETURN -> SERIE FBONACCI
        	//SERIE: soma do número anterior + o número atual        	
            return sFibonacci(num - 1) + sFibonacci(num - 2);
        }
    }
	}