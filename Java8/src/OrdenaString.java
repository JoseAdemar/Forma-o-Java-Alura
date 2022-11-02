import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //Essa expressão lambda faz a ordenação dos nomes
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Expressão lambda para imprimir a lista utilizando a ordenação
        palavras.forEach(s -> System.out.println(s));

    }

}
