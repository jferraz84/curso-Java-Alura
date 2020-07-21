package mod3AluraByteBankPOO;

import java.text.DecimalFormat;

public abstract class Funcionario {

    DecimalFormat saida = new DecimalFormat("0.00000");

    private String nome;
    private String cpf;
    private double salario;
    private int senha;

    /*public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario() {

    }*/

    // Método sem copro, sem implementação

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }  else {
            return false;
        }
    }

    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
