package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {
    public static void main(String[] args) {

         Aula aula1 = new Aula("Revisando as ArrayList", 21);
         Aula aula2 = new Aula("Lista de objetos", 20);
         Aula aula3 = new Aula("Estudando listas", 15);

        List<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("Lista de aulas após o SORT");

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println("ordenando utilizando agora o tempo utilizando comparator");
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println("uma forma mais simples ainda de fazer ordenação com comparator");
        System.out.println(aulas);


    }
}
