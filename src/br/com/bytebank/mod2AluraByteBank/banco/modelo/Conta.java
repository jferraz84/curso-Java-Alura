package br.com.bytebank.mod2AluraByteBank.banco.modelo;

/**
 * Classe que representa a moldura de uma Conta
 *
 * @autor Jorge
 *
 */

import br.com.bytebank.mod4AluraExcecoes.utilsbyteBank.SaldoInsuficienteException;

import javax.security.sasl.Sasl;
import java.util.Objects;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numeroTitular;
    private Cliente titular;
    private static int total;

    public Conta() {

    }


    /**
     * Construtor para inicializa um objeto Conta a partir da Agnecia
     *
     * @param saldo
     * @param agencia
     * @param numeroTitular
     * @param titular
     */

    public Conta(double saldo, int agencia, int numeroTitular, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroTitular = numeroTitular;
        this.titular = titular;
    }

    public Conta(int agencia, int numeroTitular) {
        Conta.total++;
        //System.out.println("O total de contas é " +Conta.total);
        this.agencia = agencia;
        this.numeroTitular = numeroTitular;
    }

    public double getSaldo() {
        return saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroTitular() {
        return numeroTitular;
    }

    public void setNumeroTitular(int numeroTitular) {
        this.numeroTitular = numeroTitular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numeroTitular == conta.numeroTitular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroTitular);
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior do que o saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor: " + valor + " Saldo insuficiente !");
        }
        this.saldo -= valor;

    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
            destino.deposita(valor);

    }

    @Override
    public String toString() {
        return "agencia = " + agencia +
                ", numeroTitular = "  + numeroTitular;
    }
}
