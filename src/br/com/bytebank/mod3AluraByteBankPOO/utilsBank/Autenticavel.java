package br.com.bytebank.mod3AluraByteBankPOO.utilsBank;

// Uma INTERFACE, é um CONTRATO
    // quem assinar esse contrato deve implementar os seus metodos
    // aqui no caso,  *** metodo setSenha   e  ***** metodo autentica.

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);
    public  abstract  boolean autentica(int senha);
}
