package mod6AluraJavaUtil.arraysSimples;

import br.com.bytebank.mod2AluraByteBank.banco.modelo.Conta;
import br.com.bytebank.mod2AluraByteBank.banco.modelo.ContaCorrente;

public class Teste2ArrayReferencia {

    public static void main(String[] args) {

        /*ContaCorrente[]  contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(111, 13579);
        ContaCorrente cc2 = new ContaCorrente(222, 2468);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[1].getAgencia());

        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(111, 13579);
        contas[0] = cc1;
        ContaCorrente cc2 = new ContaCorrente(222, 2468);
        contas[1] = cc2;

        Conta ref = contas[1];

        System.out.println(contas[1].getAgencia());
        System.out.println(cc2.getAgencia());
        System.out.println(ref.getAgencia());  */


        GuardadordeReferenciaContas guardado = new GuardadordeReferenciaContas();

        Conta cc1 = new ContaCorrente(22, 33);
        guardado.adicina(cc1);

        Conta cc2 = new ContaCorrente(33, 22);
        guardado.adicina(cc2);

        int tamanho = guardado.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardado.getReferencia(0);
        Conta ref1 = (Conta) guardado.getReferencia(1);
        System.out.println(ref);
        System.out.println(ref1);


    }
}
