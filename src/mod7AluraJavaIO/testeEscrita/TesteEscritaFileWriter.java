package mod7AluraJavaIO.testeEscrita;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo  - Padrão DECORATOR

        FileWriter fw = new FileWriter("javaIOTeste1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("O armazenamento de dados é feito em serviços que poderão ser acedidos de qualquer lugar do mundo, ");
        // Pode ser usando tb para quebra de linha =  fw.write(System.lineSeparator());    //  OU  fw.write("\n");   '\r\n'
        bw.newLine();
        bw.write("a qualquer hora, não havendo necessidade de instalação de programas ou de armazenar dados.");


        bw.close();

    }
}
