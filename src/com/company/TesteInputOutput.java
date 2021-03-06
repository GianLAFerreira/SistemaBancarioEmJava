package com.company;

import java.io.*;

public class TesteInputOutput {
    public static void main(String[] args) throws IOException {

        //le meu arquivo
        InputStream       fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader    br  = new BufferedReader(isr);

        //escreve no arquivo
        OutputStream      fos = new FileOutputStream("lorem3.txt");
        Writer            osw = new OutputStreamWriter(fos);
        BufferedWriter    bw  = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();

        }
        br.close();
        bw.close();

    }
}
