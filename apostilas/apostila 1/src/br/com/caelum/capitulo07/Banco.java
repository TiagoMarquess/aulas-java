package br.com.caelum.capitulo07;

//declarando a classe Banco
public class Banco {
	// declarando o vetor de contas
	private Conta[] contas;
	

	//construtor do objeto banco passando parametro para definir a quantidade de contas
	public Banco(int quantidadeDeContas) {
		this.contas = new Conta[quantidadeDeContas];
	}
	
	//metodo para adicionar contas no banco
	public void adiciona(Conta c) {
		boolean arrayCheio = true;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = c;
				arrayCheio = false;
				break;
			}
		}
		if (arrayCheio) {
			Conta[] arrayMaior = new Conta[this.contas.length + 1];
			for (int i = 0; i < arrayMaior.length; i++) {
				arrayMaior[i] = contas[i];
			}
			arrayMaior[this.contas.length] = c;
			contas = arrayMaior;
		}
	}
	
	public Conta pegaConta(int x) {
		return this.contas[x];
	}
}
