package mod6AluraJavaUtil.arraysSimples;

import br.com.bytebank.mod2AluraByteBank.banco.modelo.Conta;

public class GuardadordeReferenciaContas {

    private Conta[] referencias;
    private int posLivre;

    public GuardadordeReferenciaContas(){
        this.referencias = new Conta[10];
        this.posLivre = 0;
    }

    public void adicina(Conta ref) {
        this.referencias[this.posLivre] = ref;
        this.posLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
