import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}

public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos).forEach(System.out::println);

        System.out.println("-----------------------------------");
        cursos.stream().collect(Collectors.toList()).forEach(System.out::println);
    }
}



