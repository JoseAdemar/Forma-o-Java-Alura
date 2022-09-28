
public class Gerente extends Funcionario {

	 int senha;
	 
	 
	 public boolean autentica(int senha) {
		 if(this.senha == senha) {
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
