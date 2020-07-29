package mod7AluraJavaIO.testeLeitura;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("contas.csv"));

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
           //System.out.println(linha);

            //String[] valores = linha.split(", ");
            //System.out.println(valores[2]);

            Scanner linhaSc = new Scanner(linha);
            linhaSc.useDelimiter(",");

            String valor1 = linhaSc.next();
            String valor2 = linhaSc.next();
            String valor3 = linhaSc.next();
            String valor4 = linhaSc.next();
            String valor5 = linhaSc.next();

            System.out.println(valor1 + valor2 +  valor3 +  valor4 +  valor5);


            linhaSc.close();
        }

        sc.close();

    }
}
