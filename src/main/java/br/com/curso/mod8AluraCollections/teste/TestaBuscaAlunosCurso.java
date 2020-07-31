package mod8AluraCollections.teste;

import mod8AluraCollections.gerencDeCursos.Aluno;
import mod8AluraCollections.gerencDeCursos.Aula;
import mod8AluraCollections.gerencDeCursos.Curso;

public class TestaBuscaAlunosCurso {
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

        System.out.println("Quem é o aluno com a matricula 123 ?");
        Aluno aluno = javaColecoes.bucaMatriculado(122);
        System.out.println(aluno);
    }
}
