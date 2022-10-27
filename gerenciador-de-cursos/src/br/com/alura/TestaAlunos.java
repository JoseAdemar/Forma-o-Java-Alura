package br.com.alura;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo");
        alunos.add("Alberto");
        alunos.add("Nico");
        alunos.add("Sergio");
        alunos.add("Mauricio");
        alunos.add("Mauricio");
        System.out.println(alunos.size());

        System.out.println(alunos);
    }
}
