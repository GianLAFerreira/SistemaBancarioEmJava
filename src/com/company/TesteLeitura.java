package com.company;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("lorem.txt"); //entrada do arquivo
        InputStreamReader isr = new InputStreamReader(fis); //tranforsma em stream
        BufferedReader br = new BufferedReader(isr);     // obtem a linha
        String linha = br.readLine();                    // transforma em string


        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
