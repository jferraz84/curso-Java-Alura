package mod8AluraCollections.teste;

import mod8AluraCollections.gerencDeCursos.Aula;
import mod8AluraCollections.gerencDeCursos.Curso;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Coleções", "Paulo Silvera");
        //List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
        javaColecoes.adiciona(new Aula("Criando uma aula", 19));
        javaColecoes.adiciona(new Aula("Modelando Coleções", 16));

        System.out.println(javaColecoes.getAulas());



    }
}
