package mod8AluraCollections.teste;

import mod8AluraCollections.gerencDeCursos.Aluno;
import mod8AluraCollections.gerencDeCursos.Aula;
import mod8AluraCollections.gerencDeCursos.Curso;

import java.util.*;

public class TestaCursoComAlunos {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Coleções", "Paulo Silvera");
        //List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
        javaColecoes.adiciona(new Aula("Criando uma aula", 19));
        javaColecoes.adiciona(new Aula("Modelando Coleções", 16));

        Aluno a1 = new Aluno("Jorge", 123);
        Aluno a2 = new Aluno("Aline", 456);
        Aluno a3 = new Aluno("Heloa", 789);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos alunos matriculados: ");
        /* javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        } );

        System.out.println("O aluno "+a1 + " está matriculado ? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno jorge = new Aluno("Jorge", 123 );
        System.out.println("E esse Jorge, está matriculado ? ");
        System.out.println(javaColecoes.estaMatriculado(jorge));

        System.out.println("O a1 é equals(igual) ao jorge");
        System.out.println(a1.equals(jorge));

        System.out.println(a1.hashCode() == jorge.hashCode()); */

        Set<Aluno> alunos = javaColecoes.getAlunos();

        Iterator<Aluno> iterador = alunos.iterator();

        while (iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }



    }
}
