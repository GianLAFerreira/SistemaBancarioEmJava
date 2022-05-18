package com.company;

import java.io.*;

public class TesteIOEscrito {
    public static void main(String[] args) throws IOException {
        //le meu arquivo
        InputStream fis       = System.in;
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br     = new BufferedReader(isr);

        //escreve no arquivo
        OutputStream fos      = System.out; // Joga no console
        Writer            osw = new OutputStreamWriter(fos);
        BufferedWriter    bw  = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            // bw.flush(); //ele joga cada linha apos terminar no consoloe
            linha = br.readLine();

        }
        br.close();
        bw.close();
    }
}
