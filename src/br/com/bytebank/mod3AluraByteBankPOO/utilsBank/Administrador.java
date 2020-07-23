package br.com.bytebank.mod3AluraByteBankPOO.utilsBank;

import br.com.bytebank.mod3AluraByteBankPOO.model.Funcionario;

public class Administrador extends Funcionario implements Autenticavel {

    private AutentficacaoUtil autenticador;

    public Administrador(){
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
    public double getBonificacao() {
        return 50;
    }


}
