package mod7AluraJavaIO.testeLeitura;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //String nome = "Jorge Ferraz";

        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
        oos.writeObject(nome);
        oos.close(); */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);


    }
}
