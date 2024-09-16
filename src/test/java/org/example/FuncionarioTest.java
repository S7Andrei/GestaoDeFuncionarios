package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testGetNome() {
        Funcionario funcionario = new Funcionario("Carlos", "123456789", 2000.0);
        assertEquals("Carlos", funcionario.getNome());
    }

    @Test
    void testSetNome() {
        Funcionario funcionario = new Funcionario("Carlos", "123456789", 2000.0);
        funcionario.setNome("Roberto");
        assertEquals("Roberto", funcionario.getNome());
    }

    @Test
    void testGetCPF() {
        Funcionario funcionario = new Funcionario("Carlos", "123456789", 2000.0);
        assertEquals("123456789", funcionario.getCPF());
    }

    @Test
    void testSetCPF() {
        Funcionario funcionario = new Funcionario("Carlos", "123456789", 2000.0);
        funcionario.setCPF("987654321");
        assertEquals("987654321", funcionario.getCPF());
    }

    @Test
    void testGetSalarioBase() {
        Funcionario funcionario = new Funcionario("Carlos", "123456789", 2000.0);
        assertEquals(2000.0, funcionario.getSalarioBase());
    }

    @Test
    void testSetSalarioBase() {
        Funcionario funcionario = new Funcionario("Carlos", "123456789", 2000.0);
        funcionario.setSalarioBase(2500.0);
        assertEquals(2500.0, funcionario.getSalarioBase());
    }

    @Test
    void testCalcularSalario() {
        Funcionario funcionario = new Funcionario("Carlos", "123456789", 2000.0);
        assertEquals(2000.0, funcionario.calcularSalario());
    }
}