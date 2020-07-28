package mod6AluraJavaUtil.utils;

import br.com.bytebank.mod2AluraByteBank.banco.modelo.Conta;
import br.com.bytebank.mod2AluraByteBank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {

        //ArrayList<Conta> lista = new ArrayList<Conta>();
        //LinkedList<Conta> lista = new LinkedList<Conta>();
        List<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);
        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(33, 44);
        //lista.add(cc3);
        /*Conta cc4 = new ContaCorrente(77, 88);
        lista.add(cc4);

        for (int i = 0; i < lista.size() ; i++) {
            Object oRef =  lista.get(i);
            System.out.println(oRef);

        }
        System.out.println("--------------------------------------");  */

        boolean existe = lista.contains(cc3);
        System.out.println("Conta existe ? " + existe);

        for (Object oRef : lista) {
            System.out.println(oRef);
        }


        //System.out.println("Lista tamanho: " + lista.size());

        //Conta cc1 = new ContaCorrente(22, 33);
        //Conta cc2 = new ContaCorrente(22, 33);

        //boolean igual = cc1.ehIgual(cc2);
       // System.out.println(igual);


    }
}
