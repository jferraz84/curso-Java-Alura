package mod2AluraBayteBank;

public class PrincipalByteBank {
    public static void main(String[] args) {
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
        System.out.println("Na segunda conta tem " + segundaConta.getSaldo()); */

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

        System.out.println(Conta.getTotal());

    }
}
