package mod8AluraCollections.gerencDeCursos;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); // Deixa meu objeto AULA imutável.
    }

    public String getnome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        // int tempoTotal = 0;
        // for (Aula aula : aulas) {
        //   tempoTotal += aula.getTempo();
        // }

        // retorno mais moderno do que o For escrito anteriormente
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        System.out.println("======================================================");
        return "Curso nome = '" + this.nome + '\'' +
                ", Tempo Total = " + this.getTempoTotal() + " minutos..." +
                "";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno bucaMatriculado(int numero) {
        // 1° Implementação sem o HASMAP.
        /*for (Aluno aluno : alunos) {
            if (aluno.getNumMatricula() == numero)
                return aluno ;
        }
            throw  new NoSuchElementException("Aluno não encontrado !"); */

        // 2° Implementação com o HASMAP.
        if (!matriculaParaAluno.containsKey(numero)) {
            throw new NoSuchElementException("Aluno não encontrado !!");
        }
            return matriculaParaAluno.get(numero);
    }
}
