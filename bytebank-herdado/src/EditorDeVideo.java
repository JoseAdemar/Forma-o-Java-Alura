
public class EditorDeVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamou funcionario");
		return super.getBonificacao() + 100;
	}
}
