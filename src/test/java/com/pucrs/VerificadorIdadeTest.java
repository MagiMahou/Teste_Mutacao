package com.pucrs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VerificadorIdadeTest {

    @Test
    public void testMaiorDeIdade() {
        VerificadorIdade verificador = new VerificadorIdade();
        
        // Teste passa, e a cobertura de linhas (JaCoCo) da 100%!
        assertTrue(verificador.ehMaiorDeIdade(25)); 
        assertFalse(verificador.ehMaiorDeIdade(15));
    }
}
