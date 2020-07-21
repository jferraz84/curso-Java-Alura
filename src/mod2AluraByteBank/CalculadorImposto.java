package mod2AluraByteBank;

public class CalculadorImposto {

    private double totalImposto;

    public void registra(Tributavel imp){
        double valor = imp.getValorImposto();
        this.totalImposto += valor;

    }

    public double getTotalImposto(){
        return totalImposto;
    }
}
