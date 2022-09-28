
public class TesteFuncionario {
public static void main(String[] args) {
	
	Funcionario funcionario1 = new Funcionario();
	funcionario1.setNome("José Junior");
	funcionario1.setCpf("222.222.222-22");
	funcionario1.setSalario(2600.00);
	funcionario1.getBonificacao();
	double total = funcionario1.getSalario() + funcionario1.getBonificacao();
	System.out.println(funcionario1.getSalario());
	System.out.println(funcionario1.getBonificacao());
	System.out.println("Salario mais bonificação = " + total);
}
}
