package br.com.bytebank.mod2AluraByteBank.banco.utils;



public class CalculadorImposto {

    private double totalImposto;

    public void registra(Tributavel imp){
        double valor = imp.getValorImposto();
        this.totalImposto += valor;

    }

    public double getTotalImposto(){
        return totalImposto;
    }
}
