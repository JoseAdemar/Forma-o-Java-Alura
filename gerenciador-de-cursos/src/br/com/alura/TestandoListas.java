package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de lista";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com listas";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        for(String aula : aulas){
            System.out.println("Minhas aulas: " + aula);
        }
        System.out.println("------------------------------------");
        aulas.forEach(aula -> System.out.println("Aula " + aula));

        String aula4 = "Aumentando nosso conhecimento";
        aulas.add(aula4);
        Collections.sort(aulas);
        System.out.println("Depois da ordenação: " + aulas);

    }
}
