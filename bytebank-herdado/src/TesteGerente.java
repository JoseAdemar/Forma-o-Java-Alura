
public class TesteGerente {
	public static void main(String[] args) {

		Gerente g1 = new Gerente();

		g1.setNome("Joao");
		g1.setCpf("444444");
		g1.setSalario(3000);

		g1.setSenha(123);

		boolean autenticou = g1.autentica(123);

		System.out.println(g1.getSalario());
		System.out.println(autenticou);
	}
}
