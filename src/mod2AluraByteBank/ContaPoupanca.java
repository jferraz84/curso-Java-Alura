package mod2AluraByteBank;

// CLASSE criada no MOD3  do curso -  POLIMORFISMO

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroTitular) {
        super(agencia, numeroTitular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
