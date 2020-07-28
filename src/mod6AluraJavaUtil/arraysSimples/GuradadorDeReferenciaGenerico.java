package mod6AluraJavaUtil.arraysSimples;


import com.sun.org.apache.xpath.internal.objects.XObject;

public class GuradadorDeReferenciaGenerico {
    private Object[] referencias;
    private int posLivre;

    public GuradadorDeReferenciaGenerico(){
        this.referencias = new Object[10];
        this.posLivre = 0;
    }

    public void adicina(Object ref) {
        this.referencias[this.posLivre] = ref;
        this.posLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
