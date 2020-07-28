package mod6AluraJavaUtil.arraysSimples;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class TesteArrayprimitivo2 {
    public static void main(String[] args) {

        // AUTOBOXING   e   UNBOXING

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); // AUTOBOXING

        System.out.println(idadeRef.intValue());
        System.out.println("MAX_VALUE: "+Integer.MAX_VALUE);
        System.out.println("MIN_VALUE: "+Integer.MIN_VALUE);
        System.out.println("SIZE: "+Integer.SIZE+ " bits");
        System.out.println("BYTES: "+Integer.BYTES);
        System.out.println("TYPE: "+Integer.TYPE);


        int valor = idadeRef.intValue(); // UNBOXING

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);  // AUTOBOXING

        String s = args[0]; // "10"
        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);


        //List numeros = new ArrayList();
        //numeros.add(idadeRef);

        System.out.println(numeros);
    }
}
