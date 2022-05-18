package com.company;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));


        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            int    valor2 = linhaScanner.nextInt();
            int    valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            Double valor5 = linhaScanner.nextDouble();

            //formata  a string
            System.out.println(String.format("%s - %d - %d - %s - %f", valor1, valor2, valor3, valor4, valor5));
            linhaScanner.close();
            //transforma em um objeto
//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));
        }
        scanner.close();
    }
}
