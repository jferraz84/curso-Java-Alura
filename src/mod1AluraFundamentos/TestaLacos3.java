package mod1AluraFundamentos;

public class TestaLacos3 {
    public static void main(String[] args) {

            int divide = 0;
            int naoDiv = 0;

        for (int cont = 1; cont <= 100; cont++) {
            if(cont % 3 == 0) {
                System.out.println("O numero " + cont + " é divisivel por 3");
                divide++;
            }
        }
    }
}
