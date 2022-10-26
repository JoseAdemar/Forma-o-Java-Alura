package br.com.alura;

import java.util.List;

public class TesteCurso {
    public static void main(String[] args) {

         Curso curso = new Curso("Dominando as coleções do java", "José Junior");

         //curso.getAulas().add(new Aula("Teste", 22));

         curso.adiciona(new Aula("Curso de collection java", 21));
         System.out.println(curso.getAulas());


    }
}
