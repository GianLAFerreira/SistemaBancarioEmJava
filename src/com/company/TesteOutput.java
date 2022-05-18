package com.company;

import java.io.*;

public class TesteOutput {
    public static void main(String[] args) throws IOException {



        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);  // OSW == output stream writer

        bw.write("Ai caliquinha");
        bw.newLine();
        bw.write("Aiaiaiai");
        bw.newLine();
        bw.write("Começa a dançar");

        bw.close();
    }
}
