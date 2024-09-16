package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonus;

    public FuncionarioTempoIntegral(String nome, String CPF, double salarioBase, double bonus) {
        super(nome, CPF, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + bonus / 100);
    }
}