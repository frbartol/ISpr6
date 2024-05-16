package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SueldoTest {
    Sueldo s = new Sueldo();
    @org.junit.jupiter.api.Test
    void calculaBruto() {
        assertEquals(1000,s.calculaBruto('F',1000));
    }

    @org.junit.jupiter.api.Test
    void calculaRet() {
    }


}