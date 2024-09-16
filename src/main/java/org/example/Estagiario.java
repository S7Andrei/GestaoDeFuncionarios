package org.example;

public class Estagiario extends Funcionario {
    private String instituicaoDeEnsino;
    private double bolsaAuxilio;

    public Estagiario(String nome, String CPF, double salarioBase, String instituicaoDeEnsino, double bolsaAuxilio) {
        super(nome, CPF, salarioBase);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public String getInstituicaoDeEnsino() {
        return instituicaoDeEnsino;
    }

    public void setInstituicaoDeEnsino(String instituicaoDeEnsino) {
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }
}