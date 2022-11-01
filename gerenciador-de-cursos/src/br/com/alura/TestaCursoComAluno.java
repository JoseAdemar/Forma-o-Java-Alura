package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as coleções do java", "José Junior");

        curso.adiciona(new Aula("Trabalhando com Arrays", 21));
        curso.adiciona(new Aula("Criando aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo", 34672);
        Aluno a2 = new Aluno("Guilherme", 44672);
        Aluno a3 = new Aluno("Mauricio", 54672);

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);

        System.out.println("Todos os alunos matriculados nesse curso: ");
        curso.getAlunos().forEach(aluno -> System.out.println(aluno));

        System.out.println("O aluno está matriculado ?");
        System.out.println(curso.estaMatriculado(a1));

        Aluno turini = new Aluno("Turini", 1234);
        System.out.println("Esse Turini, está matriculado ? ");
        System.out.println(curso.estaMatriculado(turini));


        System.out.println("O aluno a1 é igual ao Turini ?");
        System.out.println(turini.equals(a1));

        Collection<String> teste = new ArrayList<>();

    }
}
