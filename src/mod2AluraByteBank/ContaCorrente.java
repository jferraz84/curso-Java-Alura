package mod2AluraByteBank;

// CLASSE criada no MOD3  do curso  -  POLIMORFISMO

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numeroTitular) {
        super(agencia, numeroTitular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorSaque = valor + 0.2;
        return super.saca(valorSaque);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
