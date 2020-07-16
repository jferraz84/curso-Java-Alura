package mod1Alura;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 16;
        int qntPessoas = 1;

        if (idade >= 18) {
            System.out.println("Já é maior de idade");
        } else if (qntPessoas >= 2){
            System.out.println("Vc ainda é menor mas, pode entrar já que está acompanhado");
        } else {

            System.out.println("Vc ainda é menor de idade e não está acompanhado, Não pode entrar");
        }
    }
}
