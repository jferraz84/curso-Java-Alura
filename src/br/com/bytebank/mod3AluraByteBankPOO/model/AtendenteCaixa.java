package br.com.bytebank.mod3AluraByteBankPOO.model;

public class AtendenteCaixa extends Funcionario {

    public double getBonificacao(){
        return ((this.getSalario() * 0.1) + getSalario()) + 100;
    }

    public double getValorBonif(){
        double boniAtend;
        return boniAtend = (super.getSalario() * 0.1) + 100;
    }


}
