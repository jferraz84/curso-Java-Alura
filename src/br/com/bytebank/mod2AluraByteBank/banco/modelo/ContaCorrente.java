package br.com.bytebank.mod2AluraByteBank.banco.modelo;

// CLASSE criada no MOD3  do curso  -  POLIMORFISMO


import br.com.bytebank.mod2AluraByteBank.banco.utils.Tributavel;
import br.com.bytebank.mod4AluraExcecoes.utilsbyteBank.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numeroTitular) {
        super(agencia, numeroTitular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorSaque = valor + 0.2;
        super.saca(valorSaque);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "Conta-Corrente " + super.toString();
    }
}
