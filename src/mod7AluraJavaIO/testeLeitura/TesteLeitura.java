package mod7AluraJavaIO;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo  - Padrão DECORATOR

        // Classe para ler o ARQUIVO TXT - Mas vem como Baytes
        FileInputStream fis = new FileInputStream("javaIO.txt");

        // Classe para pegar o arquivo lido em Bytes e transformá-lo em um ARRAY de Caracteres
        InputStreamReader isr = new InputStreamReader(fis);

        // Classe para pegar o ARRAY e preencher uma linha
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        //System.out.println(linha);

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }


        br.close();

    }
}
