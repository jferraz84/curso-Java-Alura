package mod2AluraByteBank;

import mod3AluraByteBankPOO.*;

import java.text.DecimalFormat;

public class PrincipalByteBank {
    public static void main(String[] args) {

        DecimalFormat saida = new DecimalFormat("0.00");
        // *******  INICIO DO MOD1 DO CURSO ********

        /*Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        System.out.println("O saldo da conta é de R$ " + primeiraConta.getSaldo());

        primeiraConta.saldo += 150;

        System.out.println("Foi feito um deposito na conta, e o novo saldo é de R$ " + primeiraConta.getSaldo());
        System.out.println("---------------------------------------------------------------");

        Conta segundaConta = new Conta();
        segundaConta.saldo= 250;

        Conta contaDoJorge = new Conta();
        contaDoJorge.deposita(550);
        System.out.println("Saldo da conta do Jorge é de R$ " + contaDoJorge.getSaldo());
        contaDoJorge.saca(25);
        System.out.println("Saldo atualizado " + contaDoJorge.getSaldo());

        Conta contaDaAline = new Conta();
        contaDaAline.deposita(1000);
        System.out.println("Saldo da conta de Aline R$ "+ contaDaAline.getSaldo());
        contaDaAline.transfere(150, contaDoJorge);
        System.out.println("Transferencia para Jorge de Aline, seu novo saldo é de R$ "+ contaDoJorge.getSaldo() );


        System.out.println("Na primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("Na segunda conta tem " + segundaConta.getSaldo());

        // *******  INICIO DO MOD2 DO CURSO ********

        int total = 0;
        Cliente cli1 = new Cliente();
        cli1.setNome("Jorge Ferraz");
        cli1.setProfissao("Programador");
        cli1.setCpf("05.277.939-01");

        Conta contaCli1 = new Conta(2421, 1984);
        contaCli1.deposita(1500);
        // Associa o cliente Jorge a conta contaCli1.
        contaCli1.settitular(cli1);

        System.out.println("Bem vindo ao nosso Banco Sr° " +contaCli1.gettitular().getNome());
        System.out.println("Seu saldo autal é de R$ "+contaCli1.getSaldo());

        System.out.println(Conta.getTotal()); */

        // *******  INICIO DO MOD3 DO CURSO ********

        /* Programador prog1 = new Programador();
        prog1.setNome("Jorge Ferraz");
        prog1.setCpf("050.277.939-01");
        prog1.setSalario(3500);

        AtendenteCaixa atend1 = new AtendenteCaixa();
        atend1.setNome("João Carlos");
        atend1.setCpf("111.222.333-44");
        atend1.setSalario(2200);

        Gerente ger1 = new Gerente();
        ger1.setNome("Aline Ferraz");
        ger1.setCpf("346.796.528-88");
        ger1.setSalario(5500);
        boolean autentico = ger1.autentica(1706);

        ControleBonificacao control = new ControleBonificacao();
        control.controleBonif(prog1);
        control.controleBonif(ger1);
        control.controleBonif(atend1);

        System.out.println("-----------------------------------------------");
        System.out.println("Programador n°1 = "+ prog1.getNome());
        System.out.println("Salario atual de R$ " + prog1.getSalario());
        System.out.println("Receberá uma bonificação de 12% no valor de R$ " + saida.format(prog1.getValorBonif()));
        System.out.println("Sálario atualizado com a Bonificação R$ " + prog1.getBonificacao() );

        System.out.println("-----------------------------------------------");
        System.out.println("Gerente n°1 = "+ ger1.getNome());
        System.out.println("Salario atual de R$ " + ger1.getSalario());
        System.out.println("Receberá uma bonificação de 16% no valor de R$ " +saida.format(ger1.getValorBonif()));
        System.out.println("Sálario atualizado com a Bonificação R$ " + ger1.getBonificacao() );

        System.out.println("-----------------------------------------------");
        System.out.println("Atendente n°1 = "+ atend1.getNome());
        System.out.println("Salario atual de R$ " + atend1.getSalario());
        System.out.println("Receberá uma bonificação de 10% + auxilio de $ 100 no valor de R$ " + saida.format(atend1.getValorBonif()));
        System.out.println("Sálario atualizado com a bonificação R$ " + atend1.getBonificacao());
        System.out.println("================================================================================");
        System.out.println("A receita da empresa com salários e bonificações é de : R$ " + control.getSoma()+ " reais mensais");
        System.out.println("================================================================================");  */

        // MOD3 = Reforçando conceitos de POLIMORFISMO

        ContaCorrente cc1 = new ContaCorrente(2421, 238503);
        cc1.deposita(350);

        SeguroDeVida segVid = new SeguroDeVida();
        CalculadorImposto calImp = new CalculadorImposto();
        calImp.registra(cc1);
        calImp.registra(segVid);


        ContaPoupanca cp1 = new ContaPoupanca(2421, 238511);
        cp1.deposita(250);

        System.out.println("Saldo da Conta Corrente cc1 = " + cc1.getSaldo());
        System.out.println("Saldo da Conta Poupança cp1 = " + cp1.getSaldo());
        System.out.println("Imposto sobre Seguro de vida e Conta Corrente " + calImp.getTotalImposto());



        /*cc1.transfere(50, cp1);
        System.out.println("-------------------------------------------");
        System.out.println("Transferencia da cc1 para Poupança");
        System.out.println("Saldo da Conta Corrente cc1 = " + cc1.getSaldo());
        System.out.println("Saldo da Conta Poupança cp1 = " + cp1.getSaldo());

        cp1.transfere(200, cc1);
        System.out.println("-------------------------------------------");
        System.out.println("Transferencia da cp1 para Conta - Poupança");
        System.out.println("Saldo da Conta Corrente cc1 = " + cc1.getSaldo());
        System.out.println("Saldo da Conta Poupança cp1 = " + cp1.getSaldo());

        System.out.println("-------------------------------------------");
        cp1.saca(25);
        System.out.println("Saque da cc1 Conta - Corrente" );
        System.out.println("Saldo da Conta Corrente cc1 = " + cc1.getSaldo());
        System.out.println("Saldo da Conta Poupança cp1 = " + cp1.getSaldo()); */

        /*Gerente ger1 = new Gerente();
        ger1.setSenha(1357);

        Administrador adm = new Administrador();
        adm.setSenha(2468);

        SistemaInterno si = new SistemaInterno();
        si.autentica(ger1);
        si.autentica(adm); */


















    }
}
