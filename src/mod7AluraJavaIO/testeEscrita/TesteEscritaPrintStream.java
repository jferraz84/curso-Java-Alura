package mod7AluraJavaIO.testeEscrita;

import java.io.*;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();

        // Fluxo de Entrada com Arquivo  - Padrão DECORATOR
        PrintStream ps = new PrintStream("javaIOTestEscrita2.txt");

        ps.println("Arquivo mod:  O armazenamento de dados é feito em serviços que poderão ser acedidos de qualquer lugar do mundo, ");
        ps.println(); // Pula uma linha, sabendo que 'PRINTLN' já pula uma linha.
        ps.println("a qualquer hora, não havendo necessidade de instalação de programas ou de armazenar dados.");

        // Ao executar essa linha, recebemos os milissegundos que passaram
        long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

        ps.close();

    }
}
