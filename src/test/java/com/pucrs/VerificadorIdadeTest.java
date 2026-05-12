package com.pucrs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VerificadorIdadeTest {

    @Test
    public void testMaiorDeIdade() {
        VerificadorIdade verificador = new VerificadorIdade();
        
        assertTrue(verificador.ehMaiorDeIdade(25)); 
        assertFalse(verificador.ehMaiorDeIdade(15));
    }
}
