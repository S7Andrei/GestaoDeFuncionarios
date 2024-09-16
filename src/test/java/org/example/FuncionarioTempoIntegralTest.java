package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTempoIntegralTest {

    @Test
    void testCalcularSalario() {
        FuncionarioTempoIntegral funcionario = new FuncionarioTempoIntegral("João", "123456789", 1000.0, 10.0);
        assertEquals(1100.0, funcionario.calcularSalario());
    }

    @Test
    void testGetBonus() {
        FuncionarioTempoIntegral funcionario = new FuncionarioTempoIntegral("João", "123456789", 1000.0, 10.0);
        assertEquals(10.0, funcionario.getBonus());
    }

    @Test
    void testSetBonus() {
        FuncionarioTempoIntegral funcionario = new FuncionarioTempoIntegral("João", "123456789", 1000.0, 10.0);
        funcionario.setBonus(20.0);
        assertEquals(20.0, funcionario.getBonus());
    }
}