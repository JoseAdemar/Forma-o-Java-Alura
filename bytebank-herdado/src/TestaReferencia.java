
public class TestaReferencia {
public static void main(String[] args) {
	
	 ControleBonificacao controle = new ControleBonificacao();
	 
	 Gerente gerente = new Gerente();
	 gerente.setSalario(3000);
	 
	 Funcionario f = new Gerente();
	 f.setSalario(1000);
	 
	 EditorDeVideo editorDeVideo = new EditorDeVideo();
	 editorDeVideo.setSalario(1200);
	 
	 controle.registraBonificacao(editorDeVideo);
	 

	 System.out.println(controle.getSoma());
}
}
