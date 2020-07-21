package mod3AluraByteBankPOO;

public class ControleBonificacao {

    // Método para exemplificar POLIMORFISMO

    private  double soma;

    public void controleBonif(Funcionario func){
        double boni = func.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
