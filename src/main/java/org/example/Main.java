package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionários deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Escolha o tipo de funcionário (1-Tempo Integral, 2-Meio Período, 3-Estagiário):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nome:");
            String nome = scanner.nextLine();
            System.out.println("CPF:");
            String cpf = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Salário Base:");
                    double salarioBase = scanner.nextDouble();
                    System.out.println("Bônus (%):");
                    double bonus = scanner.nextDouble();
                    scanner.nextLine();
                    funcionarios.add(new FuncionarioTempoIntegral(nome, cpf, salarioBase, bonus));
                    break;
                case 2:
                    System.out.println("Horas Trabalhadas:");
                    int horasTrabalhadas = scanner.nextInt();
                    System.out.println("Valor por Hora:");
                    double valorPorHora = scanner.nextDouble();
                    scanner.nextLine();
                    funcionarios.add(new FuncionarioMeioPeriodo(nome, cpf, 0, horasTrabalhadas, valorPorHora));
                    break;
                case 3:
                    System.out.println("Instituição de Ensino:");
                    String instituicaoDeEnsino = scanner.nextLine();
                    System.out.println("Bolsa Auxílio:");
                    double bolsaAuxilio = scanner.nextDouble();
                    scanner.nextLine();
                    funcionarios.add(new Estagiario(nome, cpf, 0, instituicaoDeEnsino, bolsaAuxilio));
                    break;
                default:
                    System.out.println("Tipo de funcionário inválido.");
                    i--;
                    break;
            }
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCPF());
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println();
        }

        scanner.close();
    }
}