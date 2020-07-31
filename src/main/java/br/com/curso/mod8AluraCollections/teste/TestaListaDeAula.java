package mod8AluraCollections.teste;

import mod8AluraCollections.gerencDeCursos.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 18);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println("Lista de aula:\n"+aulas);

        Collections.sort(aulas);
        System.out.println("---------------------------------------------------");
        System.out.println("Ordenada pela ordem alfabética do titulo:\n" + aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println("---------------------------------------------------");
        System.out.println("Ordenada pelo tempo:\n" + aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println("---------------------------------------------------");
        System.out.println("Ordenada pelo tempo 2:\n" + aulas);




    }
}
