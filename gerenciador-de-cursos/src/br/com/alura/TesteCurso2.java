package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {
    public static void main(String[] args) {

         Curso curso = new Curso("Dominando as coleções do java", "José Junior");

         curso.adiciona(new Aula("Trabalhando com Arrays", 21));
         curso.adiciona(new Aula("Criando aula", 20));
         curso.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = curso.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        int tempo = curso.getTempoTotal();
        int tempo2 = curso.getTempoTotalComStreams();

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(tempo);
        System.out.println(tempo2);

        System.out.println(curso);


    }
}
