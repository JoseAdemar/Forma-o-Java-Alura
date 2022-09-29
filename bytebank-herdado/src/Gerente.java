
public class Gerente extends Funcionario {

	int senha;

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao do gerente");
		return super.getBonificacao() + 300;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void getSenha(int senha) {
		this.senha = senha;
	}
}
