package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Quem é o aluno com matrícula 44672 ?");

        Aluno aluno = curso.buscaMatriculado(34672);
        System.out.println("Aluno: " + aluno);


    }
}
