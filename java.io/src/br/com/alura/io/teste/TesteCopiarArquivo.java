package br.com.alura.io.teste;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        //fluxo de copiar arquivo

        //InputStream fis = new FileInputStream("lorem.txt");  Utilizado para copiar arquivo de um lado para outro
        //InputStream fis = System.in; // Utilizado para escrever o arquivo no console
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();

        //OutputStream fos = new FileOutputStream("lorem2.txt"); // Fazer a escrita no arquivo
        //OutputStream fos = System.out; // Exibir a escrita no console
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        while (linha != null && !linha.isEmpty()) {
            //System.out.println(linha);
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
