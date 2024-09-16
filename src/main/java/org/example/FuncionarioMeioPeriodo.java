package org.example;

public class FuncionarioMeioPeriodo extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioMeioPeriodo(String nome, String CPF, double salarioBase, int horasTrabalhadas, double valorPorHora) {
        super(nome, CPF, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
}