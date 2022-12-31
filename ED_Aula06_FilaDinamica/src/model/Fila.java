package model;

public class Fila {

	No inicio;
	No fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	// VERIFICAR SE É TA VAZIA
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}

	// INSERIR --> INSERCAO
	public void insert(int valor) {
		No elemento = new No();
		elemento.dado = valor;

		// TESTE DE PRIMEIRO DADOS
		if (inicio == null) {

			// OS 2 RECEBEM O MESMO DADO
			inicio = elemento;
			fim = elemento;

			elemento.proximo = null;
		} else {

			// TESTE DE SEGUNDO DADO
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;

				// A PARTIR DO 3 DADO
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
	}

	// REMOVE ---> REMOVE
	public int remove() throws Exception {

		// TESTAR SE A FILA TA VAZIA
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}

		No auxiliar = inicio;

		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;

		} else {
			inicio = inicio.proximo;
		}

		return auxiliar.dado;
	}

	// LIST --> LISTAR
	public void list() throws Exception {
		// EXCECAO FILA VAZIA
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}

		No auxiliar = inicio;
		while (auxiliar != null) {
			System.out.println(auxiliar.dado + " ");
			auxiliar = auxiliar.proximo;
		}
	}

	// SIZE ->>> TAMANHO 
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = inicio;

			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		
		return cont;
	}

}
