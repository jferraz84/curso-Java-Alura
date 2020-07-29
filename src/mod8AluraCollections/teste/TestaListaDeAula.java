package mod8AluraCollections.teste;

import mod8AluraCollections.gerencDeCursos.Aula;

import java.util.ArrayList;

public class TestaListaDeAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas.toString());
    }
}
