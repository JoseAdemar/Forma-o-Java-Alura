package br.com.bytebank.banco.arrays;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaPouPanca cp = new ContaPouPanca(222, 222);
		cp.deposita(200);
		
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		cc.transfere(10, cp);
		cc.saca(10);
		
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
		
		
		
		
	}
}
