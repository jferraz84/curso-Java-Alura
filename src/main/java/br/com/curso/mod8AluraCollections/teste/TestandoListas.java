package mod8AluraCollections.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        /*String aula1 = "Conhecendo mais de lista";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets"; */

        String aula1 = "Trabalhando com Cursos e Sets";
        String aula2 = "Conhecendo mais de lista";
        String aula3 = "Modelando a classe Aula";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        //aulas.remove(0);

        //System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira Aula será " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));

        }
        aulas.forEach(aula -> {
            System.out.println("--------------------------------------");
            System.out.println("Percorrendo Aula: " + aula);
        });
        System.out.println("============================");
        System.out.println("Ordem atual : " + aulas);
        Collections.sort(aulas);
        System.out.println("Ordenadas: "+ aulas);



    }
}
