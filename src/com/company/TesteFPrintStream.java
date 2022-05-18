package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteFPrintStream {
    public static void main(String[] args) throws IOException {


       // PrintStream ps = new PrintStream(new File("lorem6.txt")); // forma legada
        PrintWriter ps = new PrintWriter("lorem6.txt");
        ps.println("Ai caliquinha");
        ps.println();
        ps.println("Ai caliquinhaaaaa");
        ps.println();
        ps.println("Ai caliquinhaaaaaaaaaaa");
        ps.println();
        ps.close();


    }
}
