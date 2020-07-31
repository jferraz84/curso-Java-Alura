package mod6AluraJavaUtil.utils;

import br.com.bytebank.mod2AluraByteBank.banco.modelo.Cliente;
import br.com.bytebank.mod2AluraByteBank.banco.modelo.Conta;
import br.com.bytebank.mod2AluraByteBank.banco.modelo.ContaCorrente;
import br.com.bytebank.mod2AluraByteBank.banco.modelo.ContaPoupanca;

import java.util.*;
import java.util.function.Consumer;

public class TesteOrdenacaoClasseAnonimaLambda {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //ComparatorClass comparador = new ComparatorClass();

        // Function Object
        //ComparatorIntClass comparador = new ComparatorIntClass();
        //lista.sort(comparador);
        //lista.sort(new ComparatorIntClass());


        // Classe ANONIMA - EXPRESSÃO LAMBDA ( -> )
        lista.sort((c1, c2) -> Integer.compare(c1.getNumeroTitular(), c2.getNumeroTitular()));



        // Classe ANONIMA  - EXPRESSÃO LAMBDA ( -> )
        Comparator<Conta> comp = (Conta c1, Conta c2) -> {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
        };

        //lista.sort(comp);

        //lista.sort(new ComparatorClass());

        System.out.println("--------------------------------------------------------------------------");

        lista.forEach(new Consumer<Conta>() {
            @Override
            public void accept(Conta conta) {
                System.out.println(conta + ", Cliente: " + conta.getTitular().getNome());
            }
        });

        System.out.println("--------------------------------------------------------------------------");

        // Mesmo código de cima, simplificado com EXPRESSÃO LAMBDA ( -> )
        lista.forEach((conta) -> System.out.println(conta + ", Cliente: " + conta.getTitular().getNome()));

        System.out.println("--------------------------------------------------------------------------");


        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------------------------------------------------------------");


        Set<String> nome = new HashSet<>();
        nome.add("Super Mario");
        nome.add("Yoshi");
        nome.add("Donkey Kong");

        Iterator<String> iti = nome.iterator();

        while(iti.hasNext()) {
            System.out.println(iti.next());
        }
    }

}
