package com.company;

import java.io.*;

public class TesteFileWriter {
    public static void main(String[] args) throws IOException{

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));  // Recebe a referencia da criação do FileWriter

        bw.write("Ai caliquinha");
        bw.write(System.lineSeparator()); // separa com base no sistema operacional
        bw.newLine();
        bw.write("Ai caliquinhaaaaa");
        bw.write("\n");
        bw.write("Ai caliquinhaaaaaaa");

        bw.close();
    }
}
