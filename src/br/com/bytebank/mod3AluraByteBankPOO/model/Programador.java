package br.com.bytebank.mod3AluraByteBankPOO.model;

public class Programador extends Funcionario {

    public double getValorBonif() {
        double boniProg;
        return boniProg = getSalario() * 0.12;
    }

    @Override
    public double getBonificacao() {
        return (this.getSalario() * 0.12) + this.getSalario();

    }
}
