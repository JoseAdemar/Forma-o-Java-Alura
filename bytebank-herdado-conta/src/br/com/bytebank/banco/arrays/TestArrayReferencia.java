package br.com.bytebank.banco.arrays;

public class TestArrayReferencia {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22,11);
        contas[0] = cc1;

        ContaPouPanca cc2 = new ContaPouPanca(22,22);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        ContaPouPanca ref1 = (ContaPouPanca) contas[1];
        //br.com.bytebank.banco.arrays.ContaCorrente ref2 = (br.com.bytebank.banco.arrays.ContaCorrente) contas[1];

        System.out.println(cc2.getNumero());
        System.out.println(ref1.getNumero());
        //System.out.println(ref2.getNumero());

    }
}
