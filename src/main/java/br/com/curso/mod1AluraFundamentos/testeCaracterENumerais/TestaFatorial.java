package mod1AluraFundamentos.testeCaracterENumerais;

public class TestaFatorial {
    public static void main(String[] args) {

        int fatorial = 1;

        for (int n = 1; n < 11; n++) {
            fatorial *= n;
            System.out.println("Fatorial de "+ n + " é = " + fatorial);
        }
    }
}
