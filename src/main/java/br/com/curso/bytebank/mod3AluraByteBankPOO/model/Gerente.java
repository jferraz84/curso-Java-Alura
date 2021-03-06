package br.com.bytebank.mod3AluraByteBankPOO.model;

import br.com.bytebank.mod3AluraByteBankPOO.model.Funcionario;
import br.com.bytebank.mod3AluraByteBankPOO.utilsBank.AutentficacaoUtil;
import br.com.bytebank.mod3AluraByteBankPOO.utilsBank.Autenticavel;

public class Gerente  extends Funcionario implements Autenticavel {

    private AutentficacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutentficacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);

    }

    @Override
    public double getBonificacao(){
        return (super.getSalario() * 0.16) + super.getSalario();
    }
    
    public double getValorBonif(){
        double boniGer;
        return boniGer = super.getSalario() * 0.16;
    }
}
