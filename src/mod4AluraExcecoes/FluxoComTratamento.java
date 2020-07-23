package mod4AluraExcecoes;

public class Fluxo1 {
    public static void main(String[] args) {

        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                int a = i / 0;
            } catch (ArithmeticException e){
                String msg = e.getMessage();
                System.out.println("Arithmetic Exception  erro = "+ msg);

            }
        }
        System.out.println("Fim do metodo2");
    }
}
