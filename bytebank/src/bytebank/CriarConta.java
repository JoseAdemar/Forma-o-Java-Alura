package bytebank;

public class CriarConta {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();

		primeiraConta.agencia = 0002;
		primeiraConta.numero = 0001;
		primeiraConta.saldo = 200;
		primeiraConta.titular = "José Junior";

		primeiraConta.saldo += 100;
		System.out.println("Saldo primeira conta: "+ primeiraConta.saldo);
		System.out.println();

		Conta segundaConta = new Conta();

		segundaConta.agencia = 0002;
		segundaConta.numero = 0001;
		segundaConta.saldo = 200;
		segundaConta.titular = "Maria";

		segundaConta.saldo += 50;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);

	}
}
