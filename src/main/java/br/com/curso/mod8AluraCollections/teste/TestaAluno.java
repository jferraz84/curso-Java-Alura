package mod8AluraCollections.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>(); // Não deixa repetir o mesmo objeto
        alunos.add("Jorge Ferraz");
        alunos.add("Aline Ferraz");
        alunos.add("Helo");

        boolean jorgeEsta = alunos.contains("Jorge Ferraz");
        System.out.println("Confirmado a matricula de Jorge ?  "+ jorgeEsta);
        System.out.println("Numero de alunos Matriculados: "+alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
