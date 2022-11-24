package br.com.bytebank.banco.arrays;

public class TestArrayGuardadorDeConta {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

         Conta cc = new ContaCorrente(22,11);
         guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getContaReferencia(1);
        System.out.println(ref.getNumero());
    }
}
