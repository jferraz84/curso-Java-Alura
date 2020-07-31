package br.com.bytebank.mod2AluraByteBank.banco.modelo;

// CLASSE criada no MOD3  do curso -  POLIMORFISMO

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroTitular) {
        super(agencia, numeroTitular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return  "Conta-Poupança " + super.toString();
    }
}
