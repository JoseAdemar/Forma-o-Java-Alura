package br.com.alura.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //fluxo de escrita de arquivo
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Testando a escrita de arquivo com java utilizando OutputStream.");
        bw.newLine();
        bw.newLine();
        bw.write("Testando a escrita em uma nova linha.");

        bw.close();
    }
}
