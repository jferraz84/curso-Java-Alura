package mod1AluraFundamentos.testeCondicionais;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 19;
        int qntPessoas = 2;

        if (idade >= 18 || qntPessoas >= 2) {
            System.out.println("Já é maior de idade, seja Bem Vindo");
        } else {

            System.out.println("Vc ainda é menor de idade e não está acompanhado, Não pode entrar");
        }

    }
}
