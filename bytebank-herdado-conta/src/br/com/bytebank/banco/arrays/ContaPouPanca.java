package br.com.bytebank.banco.arrays;

public class ContaPouPanca extends Conta {

	public ContaPouPanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
