package mod6AluraJavaUtil.utils;

/**
 * Deve adicionar implements Comparable;
 * Porque devemos adicionar a Interface Comparable;
 * Para assim adicionarmos a possibilidade da comparação por forma natural;
 * De dois objetos do tipo <Aula>;
 * Ou seja aqui eu posso comparar a Aula atual com outra Aula;
 * @author Jorge
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaTeste {

        public static void main(String[] args) {

            Aula aulaIntro = new Aula("Introdução às Coleções", 20);
            Aula aulaModelando = new Aula("Modelando a Classe Aula", 16);
            Aula aulaSets = new Aula("Trabalhando com Conjuntos", 18);

            List<Aula> aulas = new ArrayList<Aula>();
            aulas.add(aulaIntro);
            aulas.add(aulaModelando);
            aulas.add(aulaSets);

           Collections.sort(aulas);

            for (Aula aula : aulas) {
                System.out.println(aulas);
            }
        }

}

    class Aula implements Comparable<Aula>{

        private String titulo;
        private int tempo;

        public Aula(String titulo, int tempo) {
            this.titulo = titulo;
            this.tempo = tempo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getTempo() {
            return tempo;
        }

        public void setTempo(int tempo) {
            this.tempo = tempo;
        }

        @Override
        // Metodo de COMPARAÇÃO 'compareTo -    Ainda existe o 'REVERSE' para INVERTER uma lista,
        // o 'SHUFFLE' para EMBARALHAR  - e o 'ROTATE' para ROTACIONAR  os itens de uma lista.
        public int compareTo(Aula outro) {
            return Integer.compare(this.tempo, outro.tempo);
        }

        public String toString() {
            return "Título: " + titulo + ", tempo: " + tempo + " minutos ";
        }

    }

