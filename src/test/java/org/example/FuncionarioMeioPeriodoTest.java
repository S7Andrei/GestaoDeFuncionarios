package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMeioPeriodoTest {

    @Test
    void testCalcularSalario() {
        FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo("Maria", "987654321", 500.0, 20, 25.0);
        assertEquals(500.0, funcionario.calcularSalario());
    }

    @Test
    void testGetHorasTrabalhadas() {
        FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo("Maria", "987654321", 500.0, 20, 25.0);
        assertEquals(20, funcionario.getHorasTrabalhadas());
    }

    @Test
    void testSetHorasTrabalhadas() {
        FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo("Maria", "987654321", 500.0, 20, 25.0);
        funcionario.setHorasTrabalhadas(30);
        assertEquals(30, funcionario.getHorasTrabalhadas());
    }

    @Test
    void testGetValorPorHora() {
        FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo("Maria", "987654321", 500.0, 20, 25.0);
        assertEquals(25.0, funcionario.getValorPorHora());
    }

    @Test
    void testSetValorPorHora() {
        FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo("Maria", "987654321", 500.0, 20, 25.0);
        funcionario.setValorPorHora(30.0);
        assertEquals(30.0, funcionario.getValorPorHora());
    }
}