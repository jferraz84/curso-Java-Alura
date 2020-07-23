package br.com.bytebank.mod3AluraByteBankPOO.utilsBank;

public class SistemaInterno {

    private int senha = 1357;

    public void autentica(Autenticavel funcAdm){
        boolean autenticou = funcAdm.autentica(this.senha);
        if (autenticou) {
            System.out.println("Acesso Autorizado");
        } else {
            System.out.println("Acesso Negado !!");
        }
    }
}
