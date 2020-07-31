package mod8AluraCollections.teste;

import mod8AluraCollections.gerencDeCursos.Aula;
import mod8AluraCollections.gerencDeCursos.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Coleções", "Paulo Silvera");
        //List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
        javaColecoes.adiciona(new Aula("Criando uma aula", 19));
        javaColecoes.adiciona(new Aula("Modelando Coleções", 16));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        //System.out.println(javaColecoes.getTempoTotal());


        System.out.println(javaColecoes);



    }
}
