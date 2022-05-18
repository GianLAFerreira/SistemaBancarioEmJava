package com.company;

import java.io.*;

public class TesteInputOutput {
    public static void main(String[] args) throws IOException {

        //escreve no arquivo
        OutputStream fos = new FileOutputStream("lorem3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Ai caliquinha");
        bw.close();

        //le meu arquivo
        InputStream fis = new FileInputStream("lorem3.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();
        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();

        //escreve novamente o arquivo
        OutputStream fos1 = new FileOutputStream("lorem3.txt");
        Writer osw1 = new OutputStreamWriter(fos1);
        BufferedWriter bw1 = new BufferedWriter(osw1);
        bw1.write("Ai caliquinha");
        bw1.newLine();
        bw1.write("Aiaiaiai");
        bw1.newLine();
        bw1.write("Começa a dançar");
        bw1.close();

        InputStream       fis1 = new FileInputStream("lorem3.txt");
        InputStreamReader isr1 = new InputStreamReader(fis1);
        BufferedReader     br1 = new BufferedReader(isr1);
        String linha1          = br1.readLine();
        while (linha1 != null){
            System.out.println(linha1);
            linha1 = br1.readLine();
        }
        br1.close();

    }
}
