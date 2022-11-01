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

        Comparator<String> comparador = new ComparadorPorTamanho();
        //Collections.sort(palavras, comparador);
        palavras.sort(comparador);
        System.out.println(palavras);

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }

    public static class ImprimeNaLinha implements  Consumer<String>{

        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }


    public static class  ComparadorPorTamanho implements Comparator<String>{

        @Override
        public int compare(String s1, String s2) {
            if(s1.length() < s2.length()){
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        }
    }

}
