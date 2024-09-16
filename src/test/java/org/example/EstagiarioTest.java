package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {

    @Test
    void testGetInstituicaoDeEnsino() {
        Estagiario estagiario = new Estagiario("Ana", "123456789", 1000.0, "Universidade XYZ", 500.0);
        assertEquals("Universidade XYZ", estagiario.getInstituicaoDeEnsino());
    }

    @Test
    void testSetInstituicaoDeEnsino() {
        Estagiario estagiario = new Estagiario("Ana", "123456789", 1000.0, "Universidade XYZ", 500.0);
        estagiario.setInstituicaoDeEnsino("Universidade ABC");
        assertEquals("Universidade ABC", estagiario.getInstituicaoDeEnsino());
    }

    @Test
    void testGetBolsaAuxilio() {
        Estagiario estagiario = new Estagiario("Ana", "123456789", 1000.0, "Universidade XYZ", 500.0);
        assertEquals(500.0, estagiario.getBolsaAuxilio());
    }

    @Test
    void testSetBolsaAuxilio() {
        Estagiario estagiario = new Estagiario("Ana", "123456789", 1000.0, "Universidade XYZ", 500.0);
        estagiario.setBolsaAuxilio(600.0);
        assertEquals(600.0, estagiario.getBolsaAuxilio());
    }

    @Test
    void testCalcularSalario() {
        Estagiario estagiario = new Estagiario("Ana", "123456789", 1000.0, "Universidade XYZ", 500.0);
        assertEquals(500.0, estagiario.calcularSalario());
    }
}