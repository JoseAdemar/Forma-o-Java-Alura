
public class ControleBonificacao {

	private double soma;
	 public void registraBonificacao(Funcionario f) {
		 double bonificacao = f.getBonificacao();
		 this.soma += bonificacao + f.getSalario();
	 }
	 
	 public double getSoma() {
		return soma;
	}
}
