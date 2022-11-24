package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.arrays.Conta;
import br.com.bytebank.banco.arrays.ContaCorrente;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,11);
        lista.add(cc2);
        System.out.println("Tamanho:" + lista.size());

        Conta cc3 = new ContaCorrente(22,11);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22,11);
        lista.add(cc4);

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho:" + lista.size());

        for(Object listas : lista){
            System.out.println(listas.toString());
        }

    }
}
