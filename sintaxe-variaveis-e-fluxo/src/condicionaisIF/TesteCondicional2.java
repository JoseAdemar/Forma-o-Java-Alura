package condicionaisIF;

public class TesteCondicional2 {
public static void main(String[] args) {
	
	 System.out.println("Testando condicionais");
	 
	 int idade = 15;
	 int quantidadeDePessoas = 2;
	 boolean acompanhado = true;
	 
	 if(idade >= 16 || quantidadeDePessoas >=3 && acompanhado) {
		 System.out.println("Voc� pode entrar");
	 }else {
		System.out.println("Voc� n�o pode entrar");
	}
}
}
