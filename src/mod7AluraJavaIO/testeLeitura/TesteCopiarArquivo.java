package mod7AluraJavaIO;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo  - Padrão DECORATOR

        FileInputStream fis = new FileInputStream("javaIO-Original.txt");
       //InputStream fis = System.in;   // Vai esperar qu eu digite alguma coisa para salvar.
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("javaIO2-Copia.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();
        //System.out.println(linha);

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }


        br.close();
        bw.close();

    }
}
