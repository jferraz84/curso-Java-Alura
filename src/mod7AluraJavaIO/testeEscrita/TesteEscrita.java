package mod7AluraJavaIO.testeEscrita;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo  - Padrão DECORATOR

        FileOutputStream fos = new FileOutputStream("javaIO2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("O armazenamento de dados é feito em serviços que poderão ser acedidos de qualquer lugar do mundo, ");
        bw.newLine();
        bw.write("a qualquer hora, não havendo necessidade de instalação de programas ou de armazenar dados.");

        //System.out.println(linha);

        /*while (linha != null) {
            System.out.println(linha);
            linha = bw.toString();
        }*/


        bw.close();

    }
}
