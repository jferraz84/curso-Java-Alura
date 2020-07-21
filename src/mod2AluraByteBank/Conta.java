package mod2AluraByteBank;

import java.util.Objects;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numeroTitular;
    private Cliente titular;
    private static int total;

    public Conta(){

    }

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

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
            return false;

    }

    public  boolean transfere(double valor, Conta destino){
        if (this.saca(valor)){
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("Saldo é insuficiente");
            return false;
        }
    }
}
