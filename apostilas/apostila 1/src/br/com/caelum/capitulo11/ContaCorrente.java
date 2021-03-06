package br.com.caelum.capitulo11;

import br.com.caelum.capitulo11.Conta;
import br.com.caelum.capitulo11.Tributavel;

//classe conta Corrente herda metodos e atributos de conta e metodos da interface Tributavel
public class ContaCorrente extends Conta implements Tributavel {

	// sobreescrevendo atributos e metodos herdados
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}