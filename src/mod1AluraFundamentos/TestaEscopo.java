package mod1AluraFundamentos;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("Testando condicionais");
        System.out.println("-----------------------");

        int idade = 19;
        int qntPessoas = 2;
        boolean acompanhado;
        if (qntPessoas >= 2 ){
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        System.out.println("Está acompanhado = " + acompanhado);

        if (idade >= 18 || acompanhado) {
            System.out.println("Já é maior de idade, seja Bem Vindo");
        }  else {

            System.out.println("Vc ainda é menor de idade e não está acompanhado, Não pode entrar");
        }
    }
}
